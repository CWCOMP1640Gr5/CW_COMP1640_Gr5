/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bean.AccountDAO;
import bean.Department;
import bean.StaffDAO;
import dbconnect.DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fpt
 */
public class PreUpdateAccount extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        int accountId= Integer.parseInt(request.getParameter("accountId"));
        
        AccountDAO acc= null;
        
        Connection con;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        con = dbconnect.DBConnect.getConnection();
        try {
            pstmt = con.prepareStatement("select * from Account where accountId=?");
            pstmt.setInt(1, accountId);            
            rs = pstmt.executeQuery();
            
            if(rs.next()){
                
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
            Logger.getLogger(PreUpdateAccount.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            DBConnect.closeAll(con, pstmt, rs);
        }
        
        Department de = new AccountDAO().getDepartmentAccountId(accountId);
        StaffDAO st = new AccountDAO().getSatffByAccountId(accountId);
        
        request.setAttribute("Department", de);
        request.setAttribute("Staff", st);
        request.setAttribute("Account", acc);
        request.getRequestDispatcher("updateAccount.jsp").forward(request, response);
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
