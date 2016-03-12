/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bean.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Fpt
 */
@WebServlet(name = "LoginProcess", urlPatterns = {"/LoginProcess"})
public class LoginProcess extends HttpServlet {

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

        String userName = request.getParameter("txtuserName");
        String passWord = request.getParameter("txtpassword");

        String encryptPass = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] digest1 = digest.digest(passWord.getBytes());
            BASE64Encoder encoder = new BASE64Encoder();
            encryptPass = encoder.encode(digest1);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LoginProcess.class.getName()).log(Level.SEVERE, null, ex);
        }

        //ket noi database va so sanh user va pass:
        Connection con;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String cl= new String("CL");
        String cm=new String("CM");
        String adm=new String("ADM");
        String pvc=new String("PVC");
        String dtl=new String("DTL");
        String gu=new String("GU");

        List<AccountDAO> list = new ArrayList<>();

        con = dbconnect.DBConnect.getConnection();
        try {
            pstmt = con.prepareStatement("select permission from Account where userName=? and password=?");
            pstmt.setString(1, userName);
            pstmt.setString(2, encryptPass);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                //login successful
                HttpSession session = request.getSession();
                session.setAttribute("user", userName);

                //use cookie to save user and password:
                Cookie cUser = new Cookie("user", userName);
                Cookie cPass = new Cookie("pass", passWord);

                cUser.setMaxAge(60 * 60 * 24 * 30); // 1 month
                cPass.setMaxAge(60 * 60 * 24 * 30); // 1 month

                response.addCookie(cUser);
                response.addCookie(cPass);
                String kq =rs.getString("permission");
                
                if(rs.getString("permission").equals(gu))
                {
                     request.getRequestDispatcher("index.jsp").forward(request, response);
                }
                if(rs.getString("permission").equals(adm))
                {
                     request.getRequestDispatcher("LoadHomeAdmin").forward(request, response);
                }
                if(rs.getString("permission").equals(cl))
                {
                     request.getRequestDispatcher("homePageForCL.jsp").forward(request, response);
                }
                if(rs.getString("permission").equals(cm))
                {
                     request.getRequestDispatcher("homePageForCM.jsp").forward(request, response);
                }
                if(rs.getString("permission").equals(pvc) || rs.getString("permission").equals(dtl))
                {
                     request.getRequestDispatcher("homePageForDirection.jsp").forward(request, response);
                }
                
                   

            } else {
                request.setAttribute("loginErr", "Login fail!");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstmt, rs);
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
