/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bean.CourseDAO;
import bean.CourseWorkDAO;
import bean.GradeDistributionDataDAO;
import bean.StatisticalDataDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fpt
 */
@WebServlet(name = "DetailCRMForCM", urlPatterns = {"/DetailCRMForCM"})
public class DetailCRMForCM extends HttpServlet {

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
        
        int cmrId = Integer.parseInt(request.getParameter("CMRId"));
        
        String courseId = new CourseDAO().getCourseIdByCourseWorkId(cmrId);
        
        CourseDAO course = new CourseDAO().getCourseBycourseId(courseId);
        
        CourseWorkDAO cou = new CourseWorkDAO().getCourseWorkByCMRId(cmrId);
        
        StatisticalDataDAO sta = new StatisticalDataDAO().getStatiscalDataByCMRId(cmrId);
        
        GradeDistributionDataDAO gra = new GradeDistributionDataDAO().getStatiscalDataByCMRId(cmrId);
        
        
        request.setAttribute("CMRId", cmrId);
        request.setAttribute("Course", course);
        request.setAttribute("CourseWork", cou);
        request.setAttribute("StaData", sta);
        request.setAttribute("GradeData", gra);
        request.getRequestDispatcher("detailCMRForCM.jsp").forward(request, response);
        
        
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet DetailCRMForCM</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet DetailCRMForCM at " + cmrId + "</h1>");
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