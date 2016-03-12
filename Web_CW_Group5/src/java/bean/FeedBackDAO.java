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
 * @author Fpt feedBackId int NOT NULL identity primary key, userName
 * varchar(30), yourEmail varchar(50), content varchar(255), title varchar(100),
 * timePost dateTime, statusFeedBack bit
 */
public class FeedBackDAO {

    private int feedBackId;
    private String userName;
    private String yourEmail;
    private String content;
    private String title;
    private Date timePost;
    private boolean statusFeedBack;

    public FeedBackDAO() {
    }

    public FeedBackDAO(int feedBackId, String userName, String yourEmail, String content, String title, Date timePost, boolean statusFeedBack) {
        this.feedBackId = feedBackId;
        this.userName = userName;
        this.yourEmail = yourEmail;
        this.content = content;
        this.title = title;
        this.timePost = timePost;
        this.statusFeedBack = statusFeedBack;
    }

    public int getFeedBackId() {
        return feedBackId;
    }

    public void setFeedBackId(int feedBackId) {
        this.feedBackId = feedBackId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getYourEmail() {
        return yourEmail;
    }

    public void setYourEmail(String yourEmail) {
        this.yourEmail = yourEmail;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getTimePost() {
        return timePost;
    }

    public void setTimePost(Date timePost) {
        this.timePost = timePost;
    }

    public boolean isStatusFeedBack() {
        return statusFeedBack;
    }

    public void setStatusFeedBack(boolean statusFeedBack) {
        this.statusFeedBack = statusFeedBack;
    }

    public List<FeedBackDAO> getAllFeedBack() {
        List<FeedBackDAO> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("select * from FeedBack");
            rs = pstm.executeQuery();
            while (rs.next()) {

                FeedBackDAO fb = new FeedBackDAO();
                fb.setFeedBackId(rs.getInt(1));
                fb.setUserName(rs.getString(2));
                fb.setYourEmail(rs.getString(3));
                fb.setContent(rs.getString(4));
                fb.setTitle(rs.getString(5));
                fb.setTimePost(rs.getDate(6));
                fb.setStatusFeedBack(rs.getBoolean(7));

                list.add(fb);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }
        return list;
    }

    public FeedBackDAO getFeedBackByFeedBAckId(int feedBackId) {
        FeedBackDAO fb = null;
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("select * from FeedBack where feedBackId=?");
            pstm.setInt(1, feedBackId);
            rs = pstm.executeQuery();
            while (rs.next()) {
                fb = new FeedBackDAO();

                fb.setFeedBackId(rs.getInt(1));
                fb.setUserName(rs.getString(2));
                fb.setYourEmail(rs.getString(3));
                fb.setContent(rs.getString(4));
                fb.setTitle(rs.getString(5));
                fb.setTimePost(rs.getDate(6));
                fb.setStatusFeedBack(rs.getBoolean(7));

            }

        } catch (SQLException ex) {
            Logger.getLogger(FeedBackDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }

        return fb;
    }

    public boolean deleteFeedBack(int feedBackId) {
        Connection con;
        PreparedStatement pstm = null;

        con = dbconnect.DBConnect.getConnection();
        try {
            pstm = con.prepareStatement("delete from FeedBack where feedBackId=?");
            pstm.setInt(1, feedBackId);
            int result = pstm.executeUpdate();

            if (result > 0) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(FeedBackDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
}
