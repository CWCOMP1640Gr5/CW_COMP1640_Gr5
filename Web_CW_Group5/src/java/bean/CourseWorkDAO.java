/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fpt courseWorkId varchar(20) primary key, courseId int references
 * Course(courseId) NOT NULL, departmentId int references
 * Department(departmentID) NOT NULL, courseLeader varchar(50) NOT NULL,
 * courserModerator varchar(50) NOT NULL, createDate date NOT NULL, yearMaking
 * int NOT NULL, semester int NOT NULL, studentCount int NOT NULL, courserUnits
 * int NOT NULL, costUnit varchar(50) NOT NULL
 */
public class CourseWorkDAO implements Serializable {

    private int courseWorkId;
    private String courseId;
    private int departmentId;
    private String courseLeader;
    private String courserModerator;
    private Date createDate;
    private int yearMaking;
    private int semester;
    private int studentCount;
    private int courserUnits;
    private String costUnit;
    private boolean ishadCMR;
    private String title;

    public CourseWorkDAO() {
    }

    public CourseWorkDAO(int courseWorkId, String courseId, int departmentId, String courseLeader, String courserModerator, Date createDate, int yearMaking, int semester, int studentCount, int courserUnits, String costUnit, boolean ishadCMR, String title) {
        this.courseWorkId = courseWorkId;
        this.courseId = courseId;
        this.departmentId = departmentId;
        this.courseLeader = courseLeader;
        this.courserModerator = courserModerator;
        this.createDate = createDate;
        this.yearMaking = yearMaking;
        this.semester = semester;
        this.studentCount = studentCount;
        this.courserUnits = courserUnits;
        this.costUnit = costUnit;
        this.ishadCMR = ishadCMR;
        this.title = title;
    }

    public int getCourseWorkId() {
        return courseWorkId;
    }

    public void setCourseWorkId(int courseWorkId) {
        this.courseWorkId = courseWorkId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getCourseLeader() {
        return courseLeader;
    }

    public void setCourseLeader(String courseLeader) {
        this.courseLeader = courseLeader;
    }

    public String getCourserModerator() {
        return courserModerator;
    }

    public void setCourserModerator(String courserModerator) {
        this.courserModerator = courserModerator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public int getCourserUnits() {
        return courserUnits;
    }

    public void setCourserUnits(int courserUnits) {
        this.courserUnits = courserUnits;
    }

    public String getCostUnit() {
        return costUnit;
    }

    public void setCostUnit(String costUnit) {
        this.costUnit = costUnit;
    }

    public boolean isIshadCMR() {
        return ishadCMR;
    }

    public void setIshadCMR(boolean ishadCMR) {
        this.ishadCMR = ishadCMR;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<CourseWorkDAO> getAllCoursesWork() {
        List<CourseWorkDAO> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("select * from CourseWork");
            rs = pstm.executeQuery();
            while (rs.next()) {

                CourseWorkDAO cou = new CourseWorkDAO();
                cou.setCourseWorkId(rs.getInt(1));
                cou.setCourseId(rs.getString(2));
                cou.setDepartmentId(rs.getInt(3));
                cou.setCourseLeader(rs.getString(4));
                cou.setCourserModerator(rs.getString(5));
                cou.setCreateDate(rs.getDate(6));
                cou.setYearMaking(rs.getInt(7));
                cou.setSemester(rs.getInt(8));
                cou.setStudentCount(rs.getInt(9));
                cou.setCourserUnits(rs.getInt(10));
                cou.setCostUnit(rs.getString(11));
                cou.setIshadCMR(rs.getBoolean(12));

                list.add(cou);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseWorkDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }
        return list;
    }

    public CourseWorkDAO getCourseBycourseId(int courseWorkId) {
        CourseWorkDAO cou = null;
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("select * from CourseWork where courseWorkId=?");
            pstm.setInt(1, courseWorkId);
            rs = pstm.executeQuery();
            while (rs.next()) {
                cou = new CourseWorkDAO();

                cou.setCourseWorkId(rs.getInt(1));
                cou.setCourseId(rs.getString(2));
                cou.setDepartmentId(rs.getInt(3));
                cou.setCourseLeader(rs.getString(4));
                cou.setCourserModerator(rs.getString(5));
                cou.setCreateDate(rs.getDate(6));
                cou.setYearMaking(rs.getInt(7));
                cou.setSemester(rs.getInt(8));
                cou.setStudentCount(rs.getInt(9));
                cou.setCourserUnits(rs.getInt(10));
                cou.setCostUnit(rs.getString(11));
                cou.setIshadCMR(rs.getBoolean(12));

            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseWorkDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }

        return cou;
    }

    public List<CourseWorkDAO> getCourseBydepartmentId(int departmentId) {
        List<CourseWorkDAO> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("select s.*,e.title from CourseWork s inner join Course e on e.courseId = s.courseId and departmentId=?");
            pstm.setInt(1, departmentId);
            rs = pstm.executeQuery();
            while (rs.next()) {

                CourseWorkDAO cou = new CourseWorkDAO();
                cou.setCourseWorkId(rs.getInt(1));
                cou.setCourseId(rs.getString(2));
                cou.setDepartmentId(rs.getInt(3));
                cou.setCourseLeader(rs.getString(4));
                cou.setCourserModerator(rs.getString(5));
                cou.setCreateDate(rs.getDate(6));
                cou.setYearMaking(rs.getInt(7));
                cou.setSemester(rs.getInt(8));
                cou.setStudentCount(rs.getInt(9));
                cou.setCourserUnits(rs.getInt(10));
                cou.setCostUnit(rs.getString(11));
                cou.setIshadCMR(rs.getBoolean(12));
                cou.setTitle(rs.getString(13));
                
                list.add(cou);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseWorkDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }

        return list;
    }

    public String getDepartmentNameByCourseId(int courseWorkId) {
        String departmentName = null;
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("select e.departmentName from Department e inner join CourseWork s on e.departmentId = s.departmentId and courseWorkId =?");
            pstm.setInt(1, courseWorkId);
            rs = pstm.executeQuery();

            if (rs.next()) {
                departmentName = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return departmentName;
    }

    ///
    public CourseDAO getCourseByCourseWorkId(int courseWorkId) {
        CourseDAO co = null;
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("select * from Course e inner join CourseWork s on e.courseId = s.courseId and courseWorkId =?");
            pstm.setInt(1, courseWorkId);
            rs = pstm.executeQuery();

            if (rs.next()) {
                co = new CourseDAO();
                co.setCourseId(rs.getString(1));
                co.setTitle(rs.getString(2));
                co.setDescription(rs.getString(3));

            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return co;
    }

    public Department getDepartmentCourseWorkId(int courseWorkId) {
        Department de = null;
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("select * from Department e inner join CourseWork s on e.departmentId = s.departmentId and courseWorkId =?");
            pstm.setInt(1, courseWorkId);
            rs = pstm.executeQuery();

            if (rs.next()) {
                de = new Department();
                de.setDepartmentId(rs.getInt(1));
                de.setDepartmentName(rs.getString(2));

            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return de;
    }

    public boolean deleteCourse(int courseWorkId) {
        Connection con;
        PreparedStatement pstm = null;

        con = dbconnect.DBConnect.getConnection();
        try {
            pstm = con.prepareStatement("delete from CourseWork where courseWorkId=?");
            pstm.setInt(1, courseWorkId);
            int result = pstm.executeUpdate();

            if (result > 0) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    public boolean checkCourseWork(String courseId, int year) {
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        boolean kq = false;

        con = dbconnect.DBConnect.getConnection();
        try {
            pstm = con.prepareStatement("select * from CourseWork where courseId=? and yearMaking=?");
            pstm.setString(1, courseId);
            pstm.setInt(2, year);
            rs = pstm.executeQuery();

            if (rs.next()) {

                return kq = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseWorkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    public List<CourseWorkDAO> getCourseWorkByCLName(String clName) {
        List<CourseWorkDAO> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();
        boolean ishadCMR = false;

        try {
            pstm = con.prepareStatement("select * from CourseWork where courseLeader=? and ishadCMR=?");
            pstm.setString(1, clName);
            pstm.setBoolean(2, ishadCMR);
            rs = pstm.executeQuery();
            while (rs.next()) {

                CourseWorkDAO cou = new CourseWorkDAO();
                cou.setCourseWorkId(rs.getInt(1));
                cou.setCourseId(rs.getString(2));
                cou.setDepartmentId(rs.getInt(3));
                cou.setCourseLeader(rs.getString(4));
                cou.setCourserModerator(rs.getString(5));
                cou.setCreateDate(rs.getDate(6));
                cou.setYearMaking(rs.getInt(7));
                cou.setSemester(rs.getInt(8));
                cou.setStudentCount(rs.getInt(9));
                cou.setCourserUnits(rs.getInt(10));
                cou.setCostUnit(rs.getString(11));
                cou.setIshadCMR(rs.getBoolean(12));

                list.add(cou);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseWorkDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }

        return list;
    }

    public List<CourseWorkDAO> getCourseWorkByLastName(String lastName) {
        List<CourseWorkDAO> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();
        boolean ishadCMR = false;

        try {
            pstm = con.prepareStatement("select CourseWork.courseWorkId,CourseWork.yearMaking,CourseWork.semester,CourseWork.courseId,CourseWork.studentCount, Course.title from CourseWork\n"
                    + "full join Course\n"
                    + "ON Course.courseId = CourseWork.courseId\n"
                    + " where courseLeader=? and ishadCMR=?");
            pstm.setString(1, lastName);
            pstm.setBoolean(2, ishadCMR);
            rs = pstm.executeQuery();
            while (rs.next()) {
                CourseWorkDAO cou = new CourseWorkDAO();
                cou.setCourseWorkId(rs.getInt("courseWorkId"));
                cou.setCourseId(rs.getString("courseId"));
                cou.setYearMaking(rs.getInt("yearMaking"));
                cou.setSemester(rs.getInt("semester"));
                cou.setStudentCount(rs.getInt("studentCount"));
                cou.setTitle(rs.getString("title"));
                list.add(cou);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseWorkDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }

        return list;
    }

    public CourseWorkDAO getCourseWorkByID(int id) {
        CourseWorkDAO cwd = new CourseWorkDAO();
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();
        boolean ishadCMR = false;

        try {
            pstm = con.prepareStatement("select CourseWork.courseWorkId,CourseWork.yearMaking,CourseWork.semester,CourseWork.courseId,CourseWork.studentCount, Course.title,\n"
                    + "CourseWork.createDate from CourseWork\n"
                    + "full join Course\n"
                    + "ON Course.courseId = CourseWork.courseId\n"
                    + " where courseWorkId=?");
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                cwd.setCourseWorkId(rs.getInt("courseWorkId"));
                cwd.setCourseId(rs.getString("courseId"));
                cwd.setYearMaking(rs.getInt("yearMaking"));
                cwd.setSemester(rs.getInt("semester"));
                cwd.setStudentCount(rs.getInt("studentCount"));
                cwd.setTitle(rs.getString("title"));
                cwd.setCreateDate(rs.getDate("createDate"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseWorkDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }

        return cwd;
    }
    
    
   public List<CourseMonitorReportDAO> getCMRByCMName(String cmName) {
        List<CourseMonitorReportDAO> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();
        String act="CreateNew";

        try {
            pstm = con.prepareStatement("select * from CourseMonitorReport s inner join CourseWork e on e.courseWorkId = s.courseWorkId and courserModerator= ? and action =?");
            pstm.setString(1, cmName);
            pstm.setString(2, act);
            rs = pstm.executeQuery();
            while (rs.next()) {

                CourseMonitorReportDAO cou = new CourseMonitorReportDAO();

                cou.setCMRId(rs.getInt(1));
                cou.setCourseWorkId(rs.getInt(2));
                cou.setCommentContent(rs.getString(3));
                cou.setAction(rs.getString(4));
                cou.setStartDate(rs.getDate(5));

                list.add(cou);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseMonitorReportDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }

        return list;
    }
   
   public CourseWorkDAO getCourseWorkByCMRId(int cmrId) {
        CourseWorkDAO cou = null;
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("select s.* from CourseWork s inner join CourseMonitorReport e on e.courseWorkId = s.courseWorkId and CMRId=?");
            pstm.setInt(1, cmrId);
            rs = pstm.executeQuery();
            while (rs.next()) {
                cou = new CourseWorkDAO();

                cou.setCourseWorkId(rs.getInt(1));
                cou.setCourseId(rs.getString(2));
                cou.setDepartmentId(rs.getInt(3));
                cou.setCourseLeader(rs.getString(4));
                cou.setCourserModerator(rs.getString(5));
                cou.setCreateDate(rs.getDate(6));
                cou.setYearMaking(rs.getInt(7));
                cou.setSemester(rs.getInt(8));
                cou.setStudentCount(rs.getInt(9));
                cou.setCourserUnits(rs.getInt(10));
                cou.setCostUnit(rs.getString(11));
                cou.setIshadCMR(rs.getBoolean(12));

            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseWorkDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }

        return cou;
    }
}
