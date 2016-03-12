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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fpt
 * departmentId int identity primary key,
	departmentName varchar(50) NOT NULL
 */
public class Department implements Serializable{
    private int departmentId;
    private String departmentName;

    public Department() {
    }

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    public List<Department> getAllDepartment()
    {
        List<Department> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm=null;
        ResultSet rs= null;
        con= dbconnect.DBConnect.getConnection();
        
        try
        {
            pstm= con.prepareStatement("select * from Department");
            rs= pstm.executeQuery();
            while (rs.next()) {                

                Department de = new Department();
                de.setDepartmentId(rs.getInt(1));
                de.setDepartmentName(rs.getString(2));
             
                list.add(de);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }
        return list;
    }
    
     public Department getDepartmentById(int departmentId) {
        Department de = null;
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("select * from Department where departmentId=?");
            pstm.setInt(1, departmentId);
            rs = pstm.executeQuery();
            while (rs.next()) {
                de = new Department();
                
                de.setDepartmentId(rs.getInt(1));
                de.setDepartmentName(rs.getString(2));                              

            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseWorkDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }

        return de;
    }
     
     public boolean checkProDuplicate(String departmentName)
     {
         Connection con;
        PreparedStatement pstm=null;
        ResultSet rs= null;
        
        con= dbconnect.DBConnect.getConnection();
        try
        {
            pstm= con.prepareStatement("select * from Department where departmentName=?");
            pstm.setString(1, departmentName);
            rs = pstm.executeQuery();
            
            if(rs.next())
            {
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
     }
     
     
     public  boolean deleteDepartment(int departmentId)
    {
        Connection con;
        PreparedStatement pstm=null;
        
        con= dbconnect.DBConnect.getConnection();
        try
        {
            pstm= con.prepareStatement("delete from Department where departmentId=?");
            pstm.setInt(1, departmentId);
            int result = pstm.executeUpdate();
            
            if(result >0)
            {
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
}
