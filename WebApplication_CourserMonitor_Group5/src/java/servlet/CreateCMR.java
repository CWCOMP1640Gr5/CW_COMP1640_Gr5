/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bean.CourseMonitorReportDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fpt
 */
@WebServlet(name = "CreateCMR", urlPatterns = {"/CreateCMR"})
public class CreateCMR extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        
    
         int academicSession =Integer.parseInt(request.getParameter("txtacademicSession")) ;
	 String courseID=request.getParameter("txtCourseId");
	 String title=request.getParameter("txtTitle");
	 String courseLeader=request.getParameter("txtCourseLeader");
         int studentCount=Integer.parseInt(request.getParameter("txtStudentCount"));
	  float examOfStatistical=Float.parseFloat(request.getParameter("txtExamSD3"));	 
	  float overallOfStatistical=Float.parseFloat(request.getParameter("txtOverallSD3"));
         int examOfGradeDistribution=Integer.parseInt(request.getParameter("txtExamDD"));
	 float overallOfGradeDistribution=Float.parseFloat(request.getParameter("txtOverAllDD"));
	 String commentContent=request.getParameter("txtComment");
	 String action=request.getParameter("txtAction");
	 boolean isStatus= false;
         
         boolean result = new CourseMonitorReportDAO().addCMR(academicSession,courseID, title, courseLeader, studentCount, examOfStatistical, overallOfStatistical, examOfGradeDistribution, overallOfGradeDistribution, commentContent, action, isStatus);
        
        if(result == true)
        {
            request.setAttribute("insertStatus", "Insert success CMR:"+ courseID);
            
           // List<CourseMonitorReportDAO> listEx = new CourseMonitorReportDAO().getAllExam();
           // request.setAttribute("listEX", listEx);
            request.getRequestDispatcher("homePageCL.jsp").forward(request, response);
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
