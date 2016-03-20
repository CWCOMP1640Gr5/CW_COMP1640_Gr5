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
	courseWorkId int FOREIGN KEY REFERENCES CourseWork(courseWorkId) NOT NULL,
	commentContent varchar(200) NULL,
	action varchar(20)  NULL,
	startDate date NOT NULL,
 */
public class CourseMonitorReportDAO {
    private int CMRId;
    private int courseWorkId;
    private String commentContent;
    private String action;
    private Date startDate;
    
    

    public CourseMonitorReportDAO() {
    }

    public CourseMonitorReportDAO(int CMRId, int courseWorkId, String commentContent, String action, Date startDate) {
        this.CMRId = CMRId;
        this.courseWorkId = courseWorkId;
        this.commentContent = commentContent;
        this.action = action;
        this.startDate = startDate;
    }

    public int getCMRId() {
        return CMRId;
    }

    public void setCMRId(int CMRId) {
        this.CMRId = CMRId;
    }

    public int getCourseWorkId() {
        return courseWorkId;
    }

    public void setCourseWorkId(int courseWorkId) {
        this.courseWorkId = courseWorkId;
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
    
    

    
    
    public List<CourseMonitorReportDAO> getNewCMR() {
        List<CourseMonitorReportDAO> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();
        String act ="CreateNew";
        try {
            pstm = con.prepareStatement("select * from CourseMonitorReport where action=?");
            pstm.setString(1, act);
            rs = pstm.executeQuery();
            while (rs.next()) {

                CourseMonitorReportDAO cmr = new CourseMonitorReportDAO();
                
                cmr.setCMRId(rs.getInt(1));
                cmr.setCourseWorkId(rs.getInt(2));
                cmr.setCommentContent(rs.getString(3));
                cmr.setAction(rs.getString(4));
                cmr.setStartDate(rs.getDate(5));
                
                list.add(cmr);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseMonitorReportDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }
        return list;
    }
    
    public List<CourseMonitorReportDAO> getAllCourseMonitorReport() {
        List<CourseMonitorReportDAO> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("select * from CourseMonitorReport");
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
    
    
    public List<CourseMonitorReportDAO> searchCMRforAction(String act) {
        List<CourseMonitorReportDAO> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();
        try {
            pstm = con.prepareStatement("select * from CourseMonitorReport where action=?");
            pstm.setString(1, act);
            rs = pstm.executeQuery();
            while (rs.next()) {

                CourseMonitorReportDAO cmr = new CourseMonitorReportDAO();
                
                cmr.setCMRId(rs.getInt(1));
                cmr.setCourseWorkId(rs.getInt(2));
                cmr.setCommentContent(rs.getString(3));
                cmr.setAction(rs.getString(4));
                cmr.setStartDate(rs.getDate(5));
                
                list.add(cmr);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseMonitorReportDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }
        return list;
    }
    
    public List<CourseMonitorReportDAO> loadAllCMRForDirector() {
        List<CourseMonitorReportDAO> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();
        String act="Approved";
        try {
            pstm = con.prepareStatement("select * from CourseMonitorReport where commentContent IS NULL and action=?");
            pstm.setString(1, act);
            rs = pstm.executeQuery();
            while (rs.next()) {

                CourseMonitorReportDAO cmr = new CourseMonitorReportDAO();
                
                cmr.setCMRId(rs.getInt(1));
                cmr.setCourseWorkId(rs.getInt(2));
                cmr.setCommentContent(rs.getString(3));
                cmr.setAction(rs.getString(4));
                cmr.setStartDate(rs.getDate(5));
                
                list.add(cmr);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseMonitorReportDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }
        return list;
    }
    
    public List<CourseMonitorReportDAO> loadUnAppCMRForDirector() {
        List<CourseMonitorReportDAO> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();
        String act="CreateNew";
        try {
            pstm = con.prepareStatement("select * from CourseMonitorReport where  action=?");
            pstm.setString(1, act);
            rs = pstm.executeQuery();
            while (rs.next()) {

                CourseMonitorReportDAO cmr = new CourseMonitorReportDAO();
                
                cmr.setCMRId(rs.getInt(1));
                cmr.setCourseWorkId(rs.getInt(2));
                cmr.setCommentContent(rs.getString(3));
                cmr.setAction(rs.getString(4));
                cmr.setStartDate(rs.getDate(5));
                
                list.add(cmr);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseMonitorReportDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }
        return list;
    }
    
    
    public List<CourseMonitorReportDAO> loadAppCMRForDirector() {
        List<CourseMonitorReportDAO> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();
        String act="Approved";
        try {
            pstm = con.prepareStatement("select * from CourseMonitorReport where  action=?");
            pstm.setString(1, act);
            rs = pstm.executeQuery();
            while (rs.next()) {

                CourseMonitorReportDAO cmr = new CourseMonitorReportDAO();
                
                cmr.setCMRId(rs.getInt(1));
                cmr.setCourseWorkId(rs.getInt(2));
                cmr.setCommentContent(rs.getString(3));
                cmr.setAction(rs.getString(4));
                cmr.setStartDate(rs.getDate(5));
                
                list.add(cmr);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseMonitorReportDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }
        return list;
    }
    
    
    public CourseMonitorReportDAO getCMRByCMRId(int CMRId) {
        CourseMonitorReportDAO cmr = null;
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("select * from CourseMonitorReport where CMRId=?");
            pstm.setInt(1, CMRId);
            rs = pstm.executeQuery();
            while (rs.next()) {
                cmr = new CourseMonitorReportDAO();
                
                cmr.setCMRId(rs.getInt(1));
                cmr.setCourseWorkId(rs.getInt(2));
                cmr.setCommentContent(rs.getString(3));
                cmr.setAction(rs.getString(4));
                cmr.setStartDate(rs.getDate(5));

            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseMonitorReportDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }

        return cmr;
    }
}
