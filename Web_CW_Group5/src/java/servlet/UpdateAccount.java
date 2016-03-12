/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bean.AccountDAO;
import bean.CourseWorkDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fpt
 */
@WebServlet(name = "UpdateAccount", urlPatterns = {"/UpdateAccount"})
public class UpdateAccount extends HttpServlet {

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

        String  firstName, lastName, address, permission;

        int accountId = Integer.parseInt(request.getParameter("txtAccountId"));
        firstName = request.getParameter("txtFirstName");
        lastName = request.getParameter("txtLastName");
        address = request.getParameter("txtAddress");
        int department = Integer.parseInt(request.getParameter("department"));
        int staff = Integer.parseInt(request.getParameter("staff"));
        int phone = Integer.parseInt(request.getParameter("txtPhone"));
        permission = request.getParameter("permission");

        boolean kq = false;
        Connection con;
        PreparedStatement pstm;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("update Account set firtsName=?, lastName=?, address=?, departmentId=?, staffId=?, phone=?, permission=? where accountId=?");
//
            pstm.setString(1, firstName);
            pstm.setString(2, lastName);
            pstm.setString(3, address);
            pstm.setInt(4, department);
            pstm.setInt(5, staff);
            pstm.setInt(6, phone);
            pstm.setString(7, permission);
            pstm.setInt(8, accountId);

            int result = pstm.executeUpdate();

           if (result > 0) {
                    kq = true;
                    
                    request.setAttribute("insertStatus", "Update successfull for Account id:" + accountId);

                    List<AccountDAO> listAc = new AccountDAO().getAllAccount();
                    //chuyen trang:
                    request.setAttribute("listAccount", listAc);
                    request.getRequestDispatcher("homeAdm.jsp").forward(request, response);
                }
                else {
                    //ko thanhcong
                    request.setAttribute("insertStatus", "Update failed for Account id:" + accountId);
                    
                    request.getRequestDispatcher("homeAdm.jsp").forward(request, response);
                }

            } catch (SQLException ex) {
                Logger.getLogger(CourseWorkDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

            
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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
