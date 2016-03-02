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
 * accountId int identity primary key,
	firtsName varchar(50) NOT NULL,
	lastName varchar(50) NOT NULL,
	address varchar(100) NULL,
	departmentId int references Department(departmentID) NOT NULL,
	staffId int references Staff(staffId) NOT NULL,
	phone int NULL,
	userName varchar(50) NOT NULL,
	password varchar(50) NOT NULL,
	permission char(10) NOT NULL
 */

public class AccountDAO implements Serializable{
    private int accountId;
    private String firtsName;
    private String lastName;
    private String address;
    private int departmentId;
    private int staffId;
    private int phone;
    private String userName;
    private String password;
    private String permission;

    public AccountDAO() {
    }

    public AccountDAO(int accountId, String firtsName, String lastName, String address, int departmentId, int staffId, int phone, String userName, String password, String permission) {
        this.accountId = accountId;
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.address = address;
        this.departmentId = departmentId;
        this.staffId = staffId;
        this.phone = phone;
        this.userName = userName;
        this.password = password;
        this.permission = permission;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
    
    public List<AccountDAO> getAllAccount()
    {
        List<AccountDAO> list = new ArrayList<>();
        Connection con;
        PreparedStatement pstm=null;
        ResultSet rs= null;
        con= dbconnect.DBConnect.getConnection();
        
        try
        {
            pstm= con.prepareStatement("select * from Account");
            rs= pstm.executeQuery();
            while (rs.next()) {                

                AccountDAO acc = new AccountDAO();
                acc.setAccountId(rs.getInt(1));
                acc.setFirtsName(rs.getString(2));
                acc.setLastName(rs.getString(3));
                acc.setAddress(rs.getString(4));
                acc.setDepartmentId(rs.getInt(5));
                acc.setStaffId(rs.getInt(6));
                acc.setPhone(rs.getInt(7));
                acc.setUserName(rs.getString(8));
                acc.setPassword(rs.getString(9));
                acc.setPermission(rs.getString(10));
    
                list.add(acc);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }
        return list;
    }
    
    public AccountDAO getAccountByAccountId(int accountId)
    {       
        AccountDAO acc = null;
        Connection con;
        PreparedStatement pstm=null;
        ResultSet rs= null;
        con= dbconnect.DBConnect.getConnection();
        
        try
        {
            pstm= con.prepareStatement("select * from Account where accountId=?");
            pstm.setInt(1, accountId);
            rs= pstm.executeQuery();
            while (rs.next()) {                
                acc= new AccountDAO();
                    
                acc.setAccountId(rs.getInt(1));
                acc.setFirtsName(rs.getString(2));
                acc.setLastName(rs.getString(3));
                acc.setAddress(rs.getString(4));
                acc.setDepartmentId(rs.getInt(5));
                acc.setStaffId(rs.getInt(6));
                acc.setPhone(rs.getInt(7));
                acc.setUserName(rs.getString(8));
                acc.setPassword(rs.getString(9));
                acc.setPermission(rs.getString(10));
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }
        
        return acc;
    }
    
     public String getDepartmentNameAccountId(int accountId)
    {
        String departmentName =null;
        Connection con;
        PreparedStatement pstm=null;
        ResultSet rs= null;
        con= dbconnect.DBConnect.getConnection();
        
        try
        {
            pstm = con.prepareStatement("select e.departmentName from Department e inner join Account s on e.departmentId = s.departmentId and accountId =?");
            pstm.setInt(1, accountId);
            rs=pstm.executeQuery();
            
            if(rs.next())
            {
                departmentName=rs.getString(1);
            }
        }
        catch (SQLException ex) {        
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return departmentName;
    }
     
      public  boolean deleteAccount(int accountId)
    {
        Connection con;
        PreparedStatement pstm=null;
        
        con= dbconnect.DBConnect.getConnection();
        try
        {
            pstm= con.prepareStatement("delete from Account where accountId=?");
            pstm.setInt(1, accountId);
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
