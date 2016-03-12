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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fpt
 * courseId int identity primary key,
	title varchar(100) NOT NULL,
	description varchar(500) NOT NULL
 */
public class CourseDAO {
    private String courseId;
    private String title;
    private String description;

    public CourseDAO() {
    }

    public CourseDAO(String courseId, String title, String description) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    public List<CourseDAO> getAllCourses() {
        List<CourseDAO> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("select * from Course");
            rs = pstm.executeQuery();
            while (rs.next()) {

                CourseDAO cou = new CourseDAO();
                
                cou.setCourseId(rs.getString(1));
                cou.setTitle(rs.getString(2));
                cou.setDescription(rs.getString(3));
                
                list.add(cou);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseWorkDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            pstm = con.prepareStatement("select * from Course where courseId=?");
            pstm.setString(1, courseId);
            rs = pstm.executeQuery();
            while (rs.next()) {
                cou = new CourseDAO();
                
                cou.setCourseId(rs.getString(1));
                cou.setTitle(rs.getString(2));
                cou.setDescription(rs.getString(3));

            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }

        return cou;
    }
    
    public  boolean deleteCourse(String courseId)
    {
        Connection con;
        PreparedStatement pstm=null;
        
        con= dbconnect.DBConnect.getConnection();
        try
        {
            pstm= con.prepareStatement("delete from Course where courseId=?");
            pstm.setString(1, courseId);
            int result = pstm.executeUpdate();
            
            if(result >0)
            {
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
}
