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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class UpdateCourse extends HttpServlet {

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
        
        String courseId,title,description;
        

        courseId = request.getParameter("txtcourseId");
        title = request.getParameter("txtTitle");
        description = request.getParameter("txtdescription");
        
        Connection con;
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            con = dbconnect.DBConnect.getConnection();
            try {
                pstmt = con.prepareStatement("update Course set title=?, description=? where courseId=?");
                pstmt.setString(1, title);
                pstmt.setString(2, description);
        
                pstmt.setString(3, courseId);
                
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    //thanh cong
                    request.setAttribute("updateStatus", "Update successfull for Course id:" + courseId);

                    //lay lai du lieu cho collection
                   List<CourseDAO> list = new CourseDAO().getAllCourses();
                    //chuyen trang:
                    request.setAttribute("listCou", list);
                    request.getRequestDispatcher("listCourseAdmin.jsp").forward(request, response);
                } else {
                    //ko thanhcong
                    request.setAttribute("updateStatus", "Update failed ");

                   request.getRequestDispatcher("listCourseAdmin.jsp").forward(request, response);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
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
