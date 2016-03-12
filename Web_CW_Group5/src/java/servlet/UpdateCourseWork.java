/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bean.CourseWorkDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@WebServlet(name = "UpdateCourseWork", urlPatterns = {"/UpdateCourseWork"})
public class UpdateCourseWork extends HttpServlet {

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
        
        String courseId, courseLeader, courserModerator, createDate, costUnit;

        int courseWorkId= Integer.parseInt(request.getParameter("courseWorkId"));
        courseId = request.getParameter("courseId");
        int department = Integer.parseInt(request.getParameter("department"));
        courseLeader = request.getParameter("courseLeader");
        courserModerator = request.getParameter("courserModerator");
        createDate = request.getParameter("createDate");
        int semester = Integer.parseInt(request.getParameter("semester"));
        int yearmaking = Integer.parseInt(request.getParameter("yearmaking"));
        int studentCount = Integer.parseInt(request.getParameter("studentCount"));
        int courserUnits = Integer.parseInt(request.getParameter("courserUnits"));
        costUnit = request.getParameter("costUnit");

        //
        boolean bl = true;
        Date startDate = null;
        if (createDate.length() == 0) {
            request.setAttribute("dateErr", "Date must be inputed");
            bl = false;
        } else {
            SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd");
            try {
                startDate = sDate.parse(createDate);
            } catch (ParseException ex) {
                request.setAttribute("dateErr", "Date is not valid");
                bl = false;
            }
        }
        
        if (bl) {
            boolean kq = false;
           Connection con;
            PreparedStatement pstm;
            con = dbconnect.DBConnect.getConnection();

           try {
               pstm = con.prepareStatement("update CourseWork set courseId=?, departmentId=?, courseLeader=?, courserModerator=?, createDate=?, yearMaking=?,semester=?, studentCount=?, courserUnits=?, costUnit=? where courseWorkId=?");
//
                pstm.setString(1, courseId);
                pstm.setInt(2, department);
                pstm.setString(3, courseLeader);
                pstm.setString(4, courserModerator);
                java.sql.Date sqlDate = new java.sql.Date(startDate.getDate());
                pstm.setDate(5, sqlDate);
                pstm.setInt(6, yearmaking);
                pstm.setInt(7, semester);
                pstm.setInt(8, studentCount);
                pstm.setInt(9, courserUnits);
                pstm.setString(10, costUnit);
                pstm.setInt(11, courseWorkId);

                int result = pstm.executeUpdate();

               
                if (result > 0) {
                    kq = true;
                    
                    request.setAttribute("insertStatus", "Update successfull for Course id:" + courseId);

                    List<CourseWorkDAO> listCou = new CourseWorkDAO().getAllCoursesWork();
                    //chuyen trang:
                    request.setAttribute("listCou", listCou);
                    request.getRequestDispatcher("listCourseWorkAdmin.jsp").forward(request, response);
                }
                else {
                    //ko thanhcong
                    request.setAttribute("insertStatus", "Update failed for Course id:" + courseId);
                    
                    request.getRequestDispatcher("addNewCourse.jsp").forward(request, response);
                }

            } catch (SQLException ex) {
                Logger.getLogger(CourseWorkDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

            
            
       // } else {
        //    request.getRequestDispatcher("addNewCourseWork.jsp").forward(request, response);
       // }

        
        
        
        
        
        
        
        
        
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
