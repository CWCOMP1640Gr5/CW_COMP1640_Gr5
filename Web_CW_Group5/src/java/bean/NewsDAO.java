/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fpt
 * NewsId int identity primary key,
	title varchar(50),
	image varchar(200),
	content varchar(700),
	postDate date
 */
public class NewsDAO {
    private int newsId;
    private String title;
    private String image;
    private String content;
    private Date postDate;

    public NewsDAO() {
    }

    public NewsDAO(int newsId, String title, String image, String content, Date postDate) {
        this.newsId = newsId;
        this.title = title;
        this.image = image;
        this.content = content;
        this.postDate = postDate;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
    
    public List<NewsDAO> getAllNews()
    {
        List<NewsDAO> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm=null;
        ResultSet rs= null;
        con= dbconnect.DBConnect.getConnection();
        
        try
        {
            pstm= con.prepareStatement("select * from News");
            rs= pstm.executeQuery();
            while (rs.next()) {                

                NewsDAO n = new NewsDAO();
                n.setNewsId(rs.getInt(1));
                n.setTitle(rs.getString(2));
                n.setContent(rs.getString(4));
                n.setImage(rs.getString(3));
                n.setPostDate(rs.getDate(5));
    
                list.add(n);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CourseWorkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }
        return list;
    }
}
