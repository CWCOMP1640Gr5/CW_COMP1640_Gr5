/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dbconnect.DBConnect;
import entity.CourseMonitorReport;
import entity.Courses;
import entity.GradeDistributionData;
import entity.StatisticalData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TIEN DAT
 */
public class CourseReportModel {

    private Courses course;
    private ResultSet rs;
    DBConnect conn;
    Connection con;

    public List<Courses> getCourses() {
        List<Courses> courceList = new ArrayList<Courses>();
        conn = new DBConnect();
        con = conn.getConnection();
        try {

            PreparedStatement ps = con.prepareStatement("select * from [Courses]");
            rs = ps.executeQuery();
            while (rs.next()) {
                Courses c = new Courses();
                c.setCostUnit(rs.getString("costUnit"));
                c.setCourseId(rs.getString("courseId"));
                c.setCourseLeader(rs.getString("courseLeader"));
                c.setCourserModerator(rs.getString("courserModerator"));
                c.setCourserUnits(rs.getInt("courserUnits"));
                c.setCreateDate(rs.getDate("createDate"));
                c.setDepartmentId(rs.getInt("departmentId"));
                c.setSemester(rs.getInt("semester"));
                c.setStudentCount(rs.getInt("studentCount"));
                c.setTitle(rs.getString("title"));
                courceList.add(c);
            }
            rs.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return courceList;
    }

    public int addCoursesReport(int CWid) {
        java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        int result = 0;
        try {
            conn = new DBConnect();
            con = conn.getConnection();
            PreparedStatement ps = con.prepareStatement("Insert into CourseMonitorReport(courseWorkId,action, startDate) values (?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, CWid);
            ps.setString(2, "CreateNew");
            ps.setDate(3, date);
            ps.executeUpdate();
            ResultSet keys = ps.getGeneratedKeys();
            keys.next();
            result = keys.getInt(1);
            keys.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CourseReportModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    public boolean addSD(int cmrID, StatisticalData sd) {
        boolean status = false;
        int i = 0;
        try {
            conn = new DBConnect();
            con = conn.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT into [StatisticalData]([CMRId],[cw1r1],[cw1r2],[cw1r3],[cw2r1],[cw2r2],[cw2r3],[cw3r1],[cw3r2],[cw3r3],[cw4r1],[cw4r2],[cw4r3],[examr1],[exam1r2],[exam1r3],[over1r1],[overr2],[overr3]) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cmrID);
            ps.setInt(2, sd.getCw1r1());
            ps.setInt(3, sd.getCw1r2());
            ps.setInt(4, sd.getCw1r3());
            ps.setInt(5, sd.getCw2r1());
            ps.setInt(6, sd.getCw2r2());
            ps.setInt(7, sd.getCw2r3());
            ps.setInt(8, sd.getCw3r1());
            ps.setInt(9, sd.getCw3r2());
            ps.setInt(10, sd.getCw3r3());
            ps.setInt(11, sd.getCw4r1());
            ps.setInt(12, sd.getCw4r2());
            ps.setInt(13, sd.getCw4r3());
            ps.setInt(14, sd.getExamr1());
            ps.setInt(15, sd.getExam1r2());
            ps.setInt(16, sd.getExam1r3());
            ps.setInt(17, sd.getOver1r1());
            ps.setInt(18, sd.getOverr2());
            ps.setInt(19, sd.getOverr3());
            i = ps.executeUpdate();
            if (i > 0) {
                status = true;
            } else {
                status = false;
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CourseReportModel.class.getName()).log(Level.SEVERE, null, ex);
            status = false;
        }

        return status;
    }

    public boolean addGDD(int cmrID, GradeDistributionData gdd) {
        int i = 0;
        boolean status = false;
        try {
            conn = new DBConnect();
            con = conn.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT into [GradeDistributionData] values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cmrID);
            ps.setInt(2, gdd.getR1c1());
            ps.setInt(3, gdd.getR1c2());
            ps.setInt(4, gdd.getR1c3());
            ps.setInt(5, gdd.getR1c4());
            ps.setInt(6, gdd.getR1c5());
            ps.setInt(7, gdd.getR1c6());
            ps.setInt(8, gdd.getR1c7());
            ps.setInt(9, gdd.getR1c8());
            ps.setInt(10, gdd.getR1c9());
            ps.setInt(11, gdd.getR1c10());
            ps.setInt(12, gdd.getR2c1());
            ps.setInt(13, gdd.getR2c2());
            ps.setInt(14, gdd.getR2c3());
            ps.setInt(15, gdd.getR2c4());
            ps.setInt(16, gdd.getR2c5());
            ps.setInt(17, gdd.getR2c6());
            ps.setInt(18, gdd.getR2c7());
            ps.setInt(19, gdd.getR2c8());
            ps.setInt(20, gdd.getR2c9());
            ps.setInt(21, gdd.getR2c10());
            ps.setInt(22, gdd.getR3c1());
            ps.setInt(23, gdd.getR3c2());
            ps.setInt(24, gdd.getR3c3());
            ps.setInt(25, gdd.getR3c4());
            ps.setInt(26, gdd.getR3c5());
            ps.setInt(27, gdd.getR3c6());
            ps.setInt(28, gdd.getR3c7());
            ps.setInt(29, gdd.getR3c8());
            ps.setInt(30, gdd.getR3c9());
            ps.setInt(31, gdd.getR3c10());
            ps.setInt(32, gdd.getR4c1());
            ps.setInt(33, gdd.getR4c2());
            ps.setInt(34, gdd.getR4c3());
            ps.setInt(35, gdd.getR4c4());
            ps.setInt(36, gdd.getR4c5());
            ps.setInt(37, gdd.getR4c6());
            ps.setInt(38, gdd.getR4c7());
            ps.setInt(39, gdd.getR4c8());
            ps.setInt(40, gdd.getR4c9());
            ps.setInt(41, gdd.getR4c10());
            ps.setInt(42, gdd.getR5c1());
            ps.setInt(43, gdd.getR5c2());
            ps.setInt(44, gdd.getR5c3());
            ps.setInt(45, gdd.getR5c4());
            ps.setInt(46, gdd.getR5c5());
            ps.setInt(47, gdd.getR5c6());
            ps.setInt(48, gdd.getR5c7());
            ps.setInt(49, gdd.getR5c8());
            ps.setInt(50, gdd.getR5c9());
            ps.setInt(51, gdd.getR5c10());
            ps.setInt(52, gdd.getR6c1());
            ps.setInt(53, gdd.getR6c2());
            ps.setInt(54, gdd.getR6c3());
            ps.setInt(55, gdd.getR6c4());
            ps.setInt(56, gdd.getR6c5());
            ps.setInt(57, gdd.getR6c6());
            ps.setInt(58, gdd.getR6c7());
            ps.setInt(59, gdd.getR6c8());
            ps.setInt(60, gdd.getR6c9());
            ps.setInt(61, gdd.getR6c10());
            i = ps.executeUpdate();
            if (i > 0) {
                status = true;
            } else {
                status = false;
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CourseReportModel.class.getName()).log(Level.SEVERE, null, ex);
            status = false;
        }

        return status;
    }

    public List<CourseMonitorReport> getCMRListForCL(String lastname) {
        List<CourseMonitorReport> courceCMR = new ArrayList<CourseMonitorReport>();
        conn = new DBConnect();
        con = conn.getConnection();
        try {

            PreparedStatement ps = con.prepareStatement(" select CourseMonitorReport.CMRId,CourseMonitorReport.action,CourseMonitorReport.startDate, Course.title, CourseWork.courserModerator, CourseWork.studentCount from [CourseMonitorReport]\n"
                    + " INNER join CourseWork\n"
                    + " ON CourseMonitorReport.courseWorkId = CourseWork.courseWorkId\n"
                    + " INNER JOIN Course\n"
                    + " ON CourseWork.courseId = Course.courseId\n"
                    + " Where CourseWork.courseLeader = ?");
            ps.setString(1, lastname);
            rs = ps.executeQuery();
            while (rs.next()) {
                CourseMonitorReport c = new CourseMonitorReport();
                c.setCMRId(rs.getInt("CMRId"));
                c.setAction(rs.getString("action"));
                c.setStartDate(rs.getDate("startDate"));
                c.setTitle(rs.getString("title"));
                c.setCourserModerator(rs.getString("courserModerator"));
                c.setStudentCount(rs.getInt("studentCount"));

                courceCMR.add(c);
            }
            rs.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return courceCMR;
    }

    public StatisticalData getSDDetail(int CmrId) {
        StatisticalData sd = new StatisticalData();
        conn = new DBConnect();
        con = conn.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from [StatisticalData] where CMRId = ?");
            ps.setInt(1, CmrId);
            rs = ps.executeQuery();
            while (rs.next()) {
                sd.setCw1r1(rs.getInt("cw1r1"));
                sd.setCw1r2(rs.getInt("cw1r2"));
                sd.setCw1r3(rs.getInt("cw1r3"));
                sd.setCw2r1(rs.getInt("cw2r1"));
                sd.setCw2r2(rs.getInt("cw2r2"));
                sd.setCw2r3(rs.getInt("cw2r3"));
                sd.setCw3r1(rs.getInt("cw3r1"));
                sd.setCw3r2(rs.getInt("cw3r2"));
                sd.setCw3r3(rs.getInt("cw3r3"));
                sd.setCw4r1(rs.getInt("cw4r1"));
                sd.setCw4r2(rs.getInt("cw4r2"));
                sd.setCw4r3(rs.getInt("cw4r3"));
                sd.setExamr1(rs.getInt("examr1"));
                sd.setExam1r2(rs.getInt("exam1r2"));
                sd.setExam1r3(rs.getInt("exam1r3"));
                sd.setOver1r1(rs.getInt("over1r1"));
                sd.setOverr2(rs.getInt("overr2"));
                sd.setOverr3(rs.getInt("overr3"));
            }
            rs.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sd;
    }

    public GradeDistributionData getGDDDetail(int CmrId) {
        GradeDistributionData gdd = new GradeDistributionData();
        conn = new DBConnect();
        con = conn.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from [GradeDistributionData] where CMRId = ?");
            ps.setInt(1, CmrId);
            rs = ps.executeQuery();
            while (rs.next()) {
                gdd.setR1c1(rs.getInt("r1c1"));
                gdd.setR1c2(rs.getInt("r1c2"));
                gdd.setR1c3(rs.getInt("r1c3"));
                gdd.setR1c4(rs.getInt("r1c4"));
                gdd.setR1c5(rs.getInt("r1c5"));
                gdd.setR1c6(rs.getInt("r1c6"));
                gdd.setR1c7(rs.getInt("r1c7"));
                gdd.setR1c8(rs.getInt("r1c8"));
                gdd.setR1c9(rs.getInt("r1c9"));
                gdd.setR1c10(rs.getInt("r1c10"));

                gdd.setR2c1(rs.getInt("r2c1"));
                gdd.setR2c2(rs.getInt("r2c2"));
                gdd.setR2c3(rs.getInt("r2c3"));
                gdd.setR2c4(rs.getInt("r2c4"));
                gdd.setR2c5(rs.getInt("r2c5"));
                gdd.setR2c6(rs.getInt("r2c6"));
                gdd.setR2c7(rs.getInt("r2c7"));
                gdd.setR2c8(rs.getInt("r2c8"));
                gdd.setR2c9(rs.getInt("r2c9"));
                gdd.setR2c10(rs.getInt("r2c10"));

                gdd.setR3c1(rs.getInt("r3c1"));
                gdd.setR3c2(rs.getInt("r3c2"));
                gdd.setR3c3(rs.getInt("r3c3"));
                gdd.setR3c4(rs.getInt("r3c4"));
                gdd.setR3c5(rs.getInt("r3c5"));
                gdd.setR3c6(rs.getInt("r3c6"));
                gdd.setR3c7(rs.getInt("r3c7"));
                gdd.setR3c8(rs.getInt("r3c8"));
                gdd.setR3c9(rs.getInt("r3c9"));
                gdd.setR3c10(rs.getInt("r3c10"));

                gdd.setR4c1(rs.getInt("r4c1"));
                gdd.setR4c2(rs.getInt("r4c2"));
                gdd.setR4c3(rs.getInt("r4c3"));
                gdd.setR4c4(rs.getInt("r4c4"));
                gdd.setR4c5(rs.getInt("r4c5"));
                gdd.setR4c6(rs.getInt("r4c6"));
                gdd.setR4c7(rs.getInt("r4c7"));
                gdd.setR4c8(rs.getInt("r4c8"));
                gdd.setR4c9(rs.getInt("r4c9"));
                gdd.setR4c10(rs.getInt("r4c10"));

                gdd.setR5c1(rs.getInt("r5c1"));
                gdd.setR5c2(rs.getInt("r5c2"));
                gdd.setR5c3(rs.getInt("r5c3"));
                gdd.setR5c4(rs.getInt("r5c4"));
                gdd.setR5c5(rs.getInt("r5c5"));
                gdd.setR5c6(rs.getInt("r5c6"));
                gdd.setR5c7(rs.getInt("r5c7"));
                gdd.setR5c8(rs.getInt("r5c8"));
                gdd.setR5c9(rs.getInt("r5c9"));
                gdd.setR5c10(rs.getInt("r5c10"));

                gdd.setR6c1(rs.getInt("r6c1"));
                gdd.setR6c2(rs.getInt("r6c2"));
                gdd.setR6c3(rs.getInt("r6c3"));
                gdd.setR6c4(rs.getInt("r6c4"));
                gdd.setR6c5(rs.getInt("r6c5"));
                gdd.setR6c6(rs.getInt("r6c6"));
                gdd.setR6c7(rs.getInt("r6c7"));
                gdd.setR6c8(rs.getInt("r6c8"));
                gdd.setR6c9(rs.getInt("r6c9"));
                gdd.setR6c10(rs.getInt("r6c10"));
            }
            rs.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gdd;
    }

    public int setTrueisHadCMR(int cwID) {
        int result = 0;
        try {
            conn = new DBConnect();
            con = conn.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE CourseWork SET ishadCMR = ? where courseWorkId = ?");
            ps.setInt(2, cwID);
            ps.setBoolean(1, true);
            result = ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CourseReportModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    public CourseMonitorReport getCMRDetail(int cmrID) {
        CourseMonitorReport c = new CourseMonitorReport();
        conn = new DBConnect();
        con = conn.getConnection();
        try {

            PreparedStatement ps = con.prepareStatement("select r.*, c.*, o.title, d.departmentName from CourseMonitorReport r\n"
                    + "INNER JOIN CourseWork c\n"
                    + "ON r.courseWorkId = c.courseWorkId\n"
                    + "INNER JOIN Course o\n"
                    + "ON o.courseId = c.courseId\n"
                    + "INNER JOIN Department d\n"
                    + "ON c.departmentId = d.departmentId\n"
                    + "WHERE r.CMRId = ?");
            ps.setInt(1, cmrID);
            rs = ps.executeQuery();
            while (rs.next()) {
                c.setCMRId(rs.getInt("CMRId"));
                c.setCommentContent(rs.getString("commentContent"));
                c.setCostUnit(rs.getString("costUnit"));
                c.setCourseId(rs.getString("courseId"));
                c.setCourseLeader(rs.getString("courseLeader"));
                c.setCourseWorkId(rs.getInt("courseWorkId"));
                c.setCourserModerator(rs.getString("courserModerator"));
                c.setCourserUnits(rs.getInt("courserUnits"));
                c.setCreateDate(rs.getDate("createDate"));
                c.setDepartment(rs.getString("departmentName"));
                c.setDepartmentId(rs.getInt("departmentId"));
                c.setSemester(rs.getInt("semester"));
                c.setStartDate(rs.getDate("startDate"));
                c.setStudentCount(rs.getInt("studentCount"));
                c.setTitle(rs.getString("title"));
                c.setAction(rs.getString("action"));
                c.setYearMaking(rs.getInt("yearMaking"));
            }
            rs.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

}
