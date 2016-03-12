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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fpt
 * staffId int identity primary key,
	position varchar(50)
 */
public class StaffDAO {
    private int staffId;
    private String position;

    public StaffDAO() {
    }

    public StaffDAO(int staffId, String position) {
        this.staffId = staffId;
        this.position = position;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public String getStaffNameByAccountId(int accountId)
    {
        String staffName =null;
        Connection con;
        PreparedStatement pstm=null;
        ResultSet rs= null;
        con= dbconnect.DBConnect.getConnection();
        
        try
        {
            pstm = con.prepareStatement("select e.position from Staff e inner join Account s on e.staffId = s.staffId and accountId =?");
            pstm.setInt(1, accountId);
            rs=pstm.executeQuery();
            
            if(rs.next())
            {
                staffName=rs.getString(1);
            }
        }
        catch (SQLException ex) {        
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return staffName;
    }
}
