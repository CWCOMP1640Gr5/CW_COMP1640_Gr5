/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

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
 * CMRId int identity primary key,
	academicSession int NOT NULL,
	courseWorkId int references CourseWork(courseWorkId) NOT NULL,
	title varchar(100) NOT NULL,
	courseLeader varchar(50) NOT NULL,
	studentCount int NOT NULL,
	commentContent varchar(200) NULL,
	action varchar(20)  NULL,
	startDate date NOT NULL,
	isStatus bit
 */
public class CourseMonitorReportDAO {
    private int CMRId;
    private int academicSession;
    private int courseWorkId;
    private String title;
    private String courseLeader;
    private int studentCount;
    private String commentContent;
    private String action;
    private Date startDate;
    private boolean isStatus;

    public CourseMonitorReportDAO() {
    }

    public CourseMonitorReportDAO(int CMRId, int academicSession, int courseWorkId, String title, String courseLeader, int studentCount, String commentContent, String action, Date startDate, boolean isStatus) {
        this.CMRId = CMRId;
        this.academicSession = academicSession;
        this.courseWorkId = courseWorkId;
        this.title = title;
        this.courseLeader = courseLeader;
        this.studentCount = studentCount;
        this.commentContent = commentContent;
        this.action = action;
        this.startDate = startDate;
        this.isStatus = isStatus;
    }

    public int getCMRId() {
        return CMRId;
    }

    public void setCMRId(int CMRId) {
        this.CMRId = CMRId;
    }

    public int getAcademicSession() {
        return academicSession;
    }

    public void setAcademicSession(int academicSession) {
        this.academicSession = academicSession;
    }

    public int getCourseWorkId() {
        return courseWorkId;
    }

    public void setCourseWorkId(int courseWorkId) {
        this.courseWorkId = courseWorkId;
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

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public boolean isIsStatus() {
        return isStatus;
    }

    public void setIsStatus(boolean isStatus) {
        this.isStatus = isStatus;
    }
    
    
    public List<CourseMonitorReportDAO> getAllCmrApproved() {
        List<CourseMonitorReportDAO> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();
         boolean status= true;
        try {
            pstm = con.prepareStatement("select * from CourseMonitorReport where isStatus=?");
            pstm.setBoolean(1, status);
            rs = pstm.executeQuery();
            while (rs.next()) {

                CourseMonitorReportDAO cmr = new CourseMonitorReportDAO();
                
                cmr.setCMRId(rs.getInt(1));
                cmr.setAcademicSession(rs.getInt(2));
                cmr.setCourseWorkId(rs.getInt(3));
                cmr.setTitle(rs.getString(4));
                cmr.setCourseLeader(rs.getString(5));
                cmr.setStudentCount(rs.getInt(6));
                cmr.setCommentContent(rs.getString(7));
                cmr.setAction(rs.getString(8));
                cmr.setStartDate(rs.getDate(9));
                cmr.setIsStatus(rs.getBoolean(10));
                
                list.add(cmr);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseMonitorReportDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }
        return list;
    }
}
