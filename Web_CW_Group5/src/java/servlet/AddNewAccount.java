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
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
import sun.misc.BASE64Encoder;

/**
 *
 * @author Fpt
 */
@WebServlet(name = "AddNewAccount", urlPatterns = {"/AddNewAccount"})
public class AddNewAccount extends HttpServlet {

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

        String firstName, lastName, address,email, userName, password, permission;

        firstName = request.getParameter("txtFirstName");
        lastName = request.getParameter("txtLastName");
        address = request.getParameter("txtAddress");
        int department = Integer.parseInt(request.getParameter("sldepartment"));
        int staff = Integer.parseInt(request.getParameter("slstaff"));
        int phone = Integer.parseInt(request.getParameter("txtPhone"));
        email = request.getParameter("txtEmail");
        userName = address = request.getParameter("txtuserName");
        password = request.getParameter("txtPass");
        permission = request.getParameter("permission");
        
        String encryptPass = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] digest1 = digest.digest(password.getBytes());
            BASE64Encoder encoder = new BASE64Encoder();
            encryptPass = encoder.encode(digest1);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(AddNewAccount.class.getName()).log(Level.SEVERE, null, ex);
        }

        boolean kq = new AccountDAO().checkUserName(userName);
        
        if(!kq)
        {
            Connection con;
        PreparedStatement pstm;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("insert into Account(firtsName,lastName,address,departmentId,staffId,phone,email,userName,password,permission)" + " values (?,?,?,?,?,?,?,?,?,?)");

            pstm.setString(1, firstName);
            pstm.setString(2, lastName);
            pstm.setString(3, address);
            pstm.setInt(4, department);
            pstm.setInt(5, staff);
            pstm.setInt(6, phone);
            pstm.setString(7, email);
            pstm.setString(8, userName);
            pstm.setString(9, encryptPass);
            pstm.setString(10, permission);

            int result = pstm.executeUpdate();
            if (result > 0) {
                kq = true;
                request.setAttribute("insertStatus", "Insert successfull for Account:" + userName);

                List<AccountDAO> listAc = new AccountDAO().getAllAccount();
                    //chuyen trang:
                    request.setAttribute("listAccount", listAc);
                    request.getRequestDispatcher("homeAdm.jsp").forward(request, response);
            } else {
                //ko thanhcong
                request.setAttribute("insertStatus", "Insert failed" );

                request.getRequestDispatcher("homeAdm.jsp").forward(request, response);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CourseWorkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else
        {
            request.setAttribute("userNameErr", "User Name has been exist!");
            request.getRequestDispatcher("addAccount.jsp").forward(request, response);
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
