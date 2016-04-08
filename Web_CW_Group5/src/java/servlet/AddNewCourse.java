/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bean.CourseDAO;
import bean.CourseWorkDAO;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
public class AddNewCourse extends HttpServlet {

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

        String courseId, description, title;

        courseId = request.getParameter("courseId");
        description = request.getParameter("txtdescription");
        title = request.getParameter("txtTitle");
        
        boolean kq = new CourseDAO().checkCourse(courseId);

        //
        if(!kq)
        {
            Connection con;
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            con = dbconnect.DBConnect.getConnection();
            try {
                pstmt = con.prepareStatement("INSERT INTO Course VALUES (?,?,?)");

                pstmt.setString(1, courseId);
                pstmt.setString(2, title);
                pstmt.setString(3, description);

                int i = pstmt.executeUpdate();
                if (i > 0) {
                    //thanh cong
                    request.setAttribute("insertStatus", "Insert successfull for Course:" + courseId);

                    //lay lai du lieu cho collection
                    List<CourseDAO> listCou = new CourseDAO().getAllCourses();

                    request.setAttribute("listCou", listCou);
                    request.getRequestDispatcher("listCourseAdmin.jsp").forward(request, response);

                } else {
                    //ko thanhcong
                    request.setAttribute("insertStatus", "Insert failed");

                    request.getRequestDispatcher("listCourseAdmin.jsp").forward(request, response);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                dbconnect.DBConnect.closeAll(con, pstmt, rs);
            }

    }
        else
        {
            request.setAttribute("courseIdErr", "Course Id has been exist!");
            request.getRequestDispatcher("addNewCourse.jsp").forward(request, response);
        }

   }// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
