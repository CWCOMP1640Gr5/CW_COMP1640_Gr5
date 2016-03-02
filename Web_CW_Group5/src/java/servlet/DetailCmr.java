/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import entity.CourseMonitorReport;
import entity.GradeDistributionData;
import entity.StatisticalData;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CourseReportModel;

/**
 *
 * @author TIEN DAT
 */
public class DetailCmr extends HttpServlet {

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
        int cmrid = Integer.parseInt(request.getParameter("CMRId").toString());
        CourseReportModel crm = new CourseReportModel();
        StatisticalData sd = new StatisticalData();
        GradeDistributionData gdd = new GradeDistributionData();
        List<CourseMonitorReport> list = new ArrayList< CourseMonitorReport>();
        list = crm.getCMR();
        CourseMonitorReport cmrdetail = new CourseMonitorReport();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCMRId() == cmrid) {
                cmrdetail.setCMRId(cmrid);
                cmrdetail.setAcademicSession(list.get(i).getAcademicSession());
                cmrdetail.setCourseId(list.get(i).getCourseId());
                cmrdetail.setTitle(list.get(i).getTitle());
                cmrdetail.setStudentCount(list.get(i).getStudentCount());
                cmrdetail.setCourseLeader(list.get(i).getCourseLeader());
                sd = crm.getSDDetail(cmrid);
                gdd = crm.getGDDDetail(cmrid);

            }
        }

        request.setAttribute("detailcmr", cmrdetail);
        request.setAttribute("sddetail", sd);
        request.setAttribute("gdddetail", gdd);
        request.getRequestDispatcher("detailcmr.jsp").forward(request, response);

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
