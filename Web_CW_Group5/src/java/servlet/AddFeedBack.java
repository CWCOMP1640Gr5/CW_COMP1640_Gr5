/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bean.CourseDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
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
@WebServlet(name = "AddFeedBack", urlPatterns = {"/AddFeedBack"})
public class AddFeedBack extends HttpServlet {

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
        
        String userName, email, title, message;
        
        userName = request.getParameter("txtUserName");
        email = request.getParameter("txtEmail");
        title = request.getParameter("txtTitle");
        message = request.getParameter("txtMessage");
        Date today=new Date(System.currentTimeMillis());
        SimpleDateFormat timeFormat= new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
        String timePost=timeFormat.format(today.getTime());
        Date timep = new java.sql.Date(System.currentTimeMillis());
        //timep = timeFormat.format(today.getTime());
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        
        Connection con;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        con = dbconnect.DBConnect.getConnection();
        try {
            pstmt = con.prepareStatement("INSERT INTO FeedBack VALUES (?,?,?,?,?,?)");

            pstmt.setString(1, userName);
            pstmt.setString(2, email);
            pstmt.setString(3, message);
            pstmt.setString(4, title);
            pstmt.setDate(5, sqlDate);
            pstmt.setBoolean(6, false);

            int i = pstmt.executeUpdate();
            if (i > 0) {
                //thanh cong
                request.setAttribute("insertStatus", "FeedBack had been sent for us! Thanks you.");
                request.getRequestDispatcher("feedBack.jsp").forward(request, response);

            } else {
                //ko thanhcong
                request.setAttribute("insertStatus", "Send FeedBack failed");

                request.getRequestDispatcher("feedBack.jsp").forward(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstmt, rs);
        }
        
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet AddFeedBack</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet AddFeedBack at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
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
