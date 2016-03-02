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
 * @author Fpt
 */
public class CourseDAO implements Serializable {

    private String courseId;
    private int departmentId;
    private String title;
    private String courseLeader;
    private String courserModerator;
    private Date createDate;
    private int semester;
    private int studentCount;
    private int courserUnits;
    private String costUnit;

    public CourseDAO() {
    }

    public CourseDAO(String courseId, int departmentId, String title, String courseLeader, String courserModerator, Date createDate, int semester, int studentCount, int courserUnits, String costUnit) {
        this.courseId = courseId;
        this.departmentId = departmentId;
        this.title = title;
        this.courseLeader = courseLeader;
        this.courserModerator = courserModerator;
        this.createDate = createDate;
        this.semester = semester;
        this.studentCount = studentCount;
        this.courserUnits = courserUnits;
        this.costUnit = costUnit;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public List<CourseDAO> getAllCourses() {
        List<CourseDAO> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("select * from Courses");
            rs = pstm.executeQuery();
            while (rs.next()) {

                CourseDAO cou = new CourseDAO();
                cou.setCourseId(rs.getString(1));
                cou.setDepartmentId(rs.getInt(2));
                cou.setTitle(rs.getString(3));
                cou.setCourseLeader(rs.getString(4));
                cou.setCourserModerator(rs.getString(5));
                cou.setCreateDate(rs.getDate(6));
                cou.setSemester(rs.getInt(7));
                cou.setStudentCount(rs.getInt(8));
                cou.setCourserUnits(rs.getInt(9));
                cou.setCostUnit(rs.getString(10));

                list.add(cou);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }
        return list;
    }

    public CourseDAO getCourseBycourseId(String courseId) {
        CourseDAO cou = null;
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("select * from Courses where courseId=?");
            pstm.setString(1, courseId);
            rs = pstm.executeQuery();
            while (rs.next()) {
                cou = new CourseDAO();

                cou.setCourseId(rs.getString(1));
                cou.setDepartmentId(rs.getInt(2));
                cou.setTitle(rs.getString(3));
                cou.setCourseLeader(rs.getString(4));
                cou.setCourserModerator(rs.getString(5));
                cou.setCreateDate(rs.getDate(6));
                cou.setSemester(rs.getInt(7));
                cou.setStudentCount(rs.getInt(8));
                cou.setCourserUnits(rs.getInt(9));
                cou.setCostUnit(rs.getString(10));

            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }

        return cou;
    }

    public List<CourseDAO> getCourseBydepartmentId(int departmentId) {
        List<CourseDAO> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("select * from Courses where departmentId=?");
            pstm.setInt(1, departmentId);
            rs = pstm.executeQuery();
            while (rs.next()) {

                CourseDAO cou = new CourseDAO();
                cou.setCourseId(rs.getString(1));
                cou.setDepartmentId(rs.getInt(2));
                cou.setTitle(rs.getString(3));
                cou.setCourseLeader(rs.getString(4));
                cou.setCourserModerator(rs.getString(5));
                cou.setCreateDate(rs.getDate(6));
                cou.setSemester(rs.getInt(7));
                cou.setStudentCount(rs.getInt(8));
                cou.setCourserUnits(rs.getInt(9));
                cou.setCostUnit(rs.getString(10));
                
                list.add(cou);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }

        return list;
    }
}
