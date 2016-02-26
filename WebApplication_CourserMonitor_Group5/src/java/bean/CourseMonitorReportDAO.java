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
 * 
	
	
 */
public class CourseMonitorReportDAO implements Serializable{
    
        private int cmrId ;
	private int academicSession;
	private String courseID;
	private String title;
	private String courseLeader;
        private int studentCount;
	private  float examOfStatistical;	 
	private  float overallOfStatistical;
        private int examOfGradeDistribution;
	private float overallOfGradeDistribution;
	private String commentContent;
	private String action;
	private boolean isStatus;

    public CourseMonitorReportDAO() {
    }

    public CourseMonitorReportDAO(int cmrId, int academicSession, String courseID, String title, String courseLeader, int studentCount, float examOfStatistical, float overallOfStatistical, int examOfGradeDistribution, float overallOfGradeDistribution, String commentContent, String action, boolean isStatus) {
        this.cmrId = cmrId;
        this.academicSession = academicSession;
        this.courseID = courseID;
        this.title = title;
        this.courseLeader = courseLeader;
        this.studentCount = studentCount;
        this.examOfStatistical = examOfStatistical;
        this.overallOfStatistical = overallOfStatistical;
        this.examOfGradeDistribution = examOfGradeDistribution;
        this.overallOfGradeDistribution = overallOfGradeDistribution;
        this.commentContent = commentContent;
        this.action = action;
        this.isStatus = isStatus;
    }

    public int getCmrId() {
        return cmrId;
    }

    public void setCmrId(int cmrId) {
        this.cmrId = cmrId;
    }

    public int getAcademicSession() {
        return academicSession;
    }

    public void setAcademicSession(int academicSession) {
        this.academicSession = academicSession;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
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

    public float getExamOfStatistical() {
        return examOfStatistical;
    }

    public void setExamOfStatistical(float examOfStatistical) {
        this.examOfStatistical = examOfStatistical;
    }

    public float getOverallOfStatistical() {
        return overallOfStatistical;
    }

    public void setOverallOfStatistical(float overallOfStatistical) {
        this.overallOfStatistical = overallOfStatistical;
    }

    public int getExamOfGradeDistribution() {
        return examOfGradeDistribution;
    }

    public void setExamOfGradeDistribution(int examOfGradeDistribution) {
        this.examOfGradeDistribution = examOfGradeDistribution;
    }

    public float getOverallOfGradeDistribution() {
        return overallOfGradeDistribution;
    }

    public void setOverallOfGradeDistribution(float overallOfGradeDistribution) {
        this.overallOfGradeDistribution = overallOfGradeDistribution;
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

    public boolean isIsStatus() {
        return isStatus;
    }

    public void setIsStatus(boolean isStatus) {
        this.isStatus = isStatus;
    }

   
        
 //Code
 
    public boolean addCMR(int academicSession,String courseID,String title,String courseLeader,
            int studentCount,float examOfStatistical,
            float overallOfStatistical,int examOfGradeDistribution,float overallOfGradeDistribution,
            String commentContent,String action,boolean isStatus)
    {
        Connection con;
        PreparedStatement pstm;
        con=dbconnect.DBConnect.getConnection();
        
        try
        {
            pstm =con.prepareStatement("INSERT INTO CourseMonitorReport(academicSession,courseID,title,courseLeader,studentCount,examOfStatistical,overallOfStatistical,examOfGradeDistribution,overallOfGradeDistribution,commentContent,action,isStatus)"+" values (?,?,?,?,?,?,?,?,?,?,?,?)");
                       
            int result = pstm.executeUpdate();
            pstm.setInt(1, academicSession);
            pstm.setString(2, courseID);
            pstm.setString(3, title);
            pstm.setString(4, courseLeader);
            pstm.setInt(5, studentCount);
            pstm.setFloat(6, examOfStatistical);
            pstm.setFloat(7, overallOfStatistical);
            pstm.setInt(8, examOfGradeDistribution);
            pstm.setFloat(9, overallOfGradeDistribution);
            pstm.setString(10, commentContent);
            pstm.setString(11, action);
            pstm.setBoolean(12, isStatus);
            
            
            if(result >0)
            {
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CourseMonitorReportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
}
