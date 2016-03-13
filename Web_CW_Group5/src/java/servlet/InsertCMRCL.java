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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CourseReportModel;

/**
 *
 * @author Fpt
 */
@WebServlet(name = "InsertCMR", urlPatterns = {"/InsertCMR"})
public class InsertCMRCL extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InsertCMR</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InsertCMR at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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

        String academicsession = request.getParameter("academicsession");

        StatisticalData sd = new StatisticalData();
        sd.setCw1r1(Integer.parseInt(request.getParameter("cw1r1")));
        sd.setCw1r2(Integer.parseInt(request.getParameter("cw1r2")));
        sd.setCw1r3(Integer.parseInt(request.getParameter("cw1r3")));
        sd.setCw2r1(Integer.parseInt(request.getParameter("cw2r1")));
        sd.setCw2r2(Integer.parseInt(request.getParameter("cw2r2")));
        sd.setCw2r3(Integer.parseInt(request.getParameter("cw2r3")));
        sd.setCw3r1(Integer.parseInt(request.getParameter("cw3r1")));
        sd.setCw3r2(Integer.parseInt(request.getParameter("cw3r2")));
        sd.setCw3r3(Integer.parseInt(request.getParameter("cw3r3")));
        sd.setCw4r1(Integer.parseInt(request.getParameter("cw4r1")));
        sd.setCw4r2(Integer.parseInt(request.getParameter("cw4r2")));
        sd.setCw4r3(Integer.parseInt(request.getParameter("cw4r1")));
        sd.setExamr1(Integer.parseInt(request.getParameter("examr1")));
        sd.setExam1r2(Integer.parseInt(request.getParameter("examr2")));
        sd.setExam1r3(Integer.parseInt(request.getParameter("examr3")));
        sd.setOver1r1(Integer.parseInt(request.getParameter("overr1")));
        sd.setOverr2(Integer.parseInt(request.getParameter("overr2")));
        sd.setOverr3(Integer.parseInt(request.getParameter("overr3")));

        GradeDistributionData gdd = new GradeDistributionData();
        gdd.setR1c1(Integer.parseInt(request.getParameter("r1c1")));
        gdd.setR1c2(Integer.parseInt(request.getParameter("r1c2")));
        gdd.setR1c3(Integer.parseInt(request.getParameter("r1c3")));
        gdd.setR1c4(Integer.parseInt(request.getParameter("r1c4")));
        gdd.setR1c5(Integer.parseInt(request.getParameter("r1c5")));
        gdd.setR1c6(Integer.parseInt(request.getParameter("r1c6")));
        gdd.setR1c7(Integer.parseInt(request.getParameter("r1c7")));
        gdd.setR1c8(Integer.parseInt(request.getParameter("r1c8")));
        gdd.setR1c9(Integer.parseInt(request.getParameter("r1c9")));
        gdd.setR1c10(Integer.parseInt(request.getParameter("r1c10")));

        gdd.setR2c1(Integer.parseInt(request.getParameter("r2c1")));
        gdd.setR2c2(Integer.parseInt(request.getParameter("r2c2")));
        gdd.setR2c3(Integer.parseInt(request.getParameter("r2c3")));
        gdd.setR2c4(Integer.parseInt(request.getParameter("r2c4")));
        gdd.setR2c5(Integer.parseInt(request.getParameter("r2c5")));
        gdd.setR2c6(Integer.parseInt(request.getParameter("r2c6")));
        gdd.setR2c7(Integer.parseInt(request.getParameter("r2c7")));
        gdd.setR2c8(Integer.parseInt(request.getParameter("r2c8")));
        gdd.setR2c9(Integer.parseInt(request.getParameter("r2c9")));
        gdd.setR2c10(Integer.parseInt(request.getParameter("r2c10")));

        gdd.setR3c1(Integer.parseInt(request.getParameter("r3c1")));
        gdd.setR3c2(Integer.parseInt(request.getParameter("r3c2")));
        gdd.setR3c3(Integer.parseInt(request.getParameter("r3c3")));
        gdd.setR3c4(Integer.parseInt(request.getParameter("r3c4")));
        gdd.setR3c5(Integer.parseInt(request.getParameter("r3c5")));
        gdd.setR3c6(Integer.parseInt(request.getParameter("r3c6")));
        gdd.setR3c7(Integer.parseInt(request.getParameter("r3c7")));
        gdd.setR3c8(Integer.parseInt(request.getParameter("r3c8")));
        gdd.setR3c9(Integer.parseInt(request.getParameter("r3c9")));
        gdd.setR3c10(Integer.parseInt(request.getParameter("r3c10")));

        gdd.setR4c1(Integer.parseInt(request.getParameter("r4c1")));
        gdd.setR4c2(Integer.parseInt(request.getParameter("r4c2")));
        gdd.setR4c3(Integer.parseInt(request.getParameter("r4c3")));
        gdd.setR4c4(Integer.parseInt(request.getParameter("r4c4")));
        gdd.setR4c5(Integer.parseInt(request.getParameter("r4c5")));
        gdd.setR4c6(Integer.parseInt(request.getParameter("r4c6")));
        gdd.setR4c7(Integer.parseInt(request.getParameter("r4c7")));
        gdd.setR4c8(Integer.parseInt(request.getParameter("r4c8")));
        gdd.setR4c9(Integer.parseInt(request.getParameter("r4c9")));
        gdd.setR4c10(Integer.parseInt(request.getParameter("r4c10")));

        gdd.setR5c1(Integer.parseInt(request.getParameter("r5c1")));
        gdd.setR5c2(Integer.parseInt(request.getParameter("r5c2")));
        gdd.setR5c3(Integer.parseInt(request.getParameter("r5c3")));
        gdd.setR5c4(Integer.parseInt(request.getParameter("r5c4")));
        gdd.setR5c5(Integer.parseInt(request.getParameter("r5c5")));
        gdd.setR5c6(Integer.parseInt(request.getParameter("r5c6")));
        gdd.setR5c7(Integer.parseInt(request.getParameter("r5c7")));
        gdd.setR5c8(Integer.parseInt(request.getParameter("r5c8")));
        gdd.setR5c9(Integer.parseInt(request.getParameter("r5c9")));
        gdd.setR5c10(Integer.parseInt(request.getParameter("r5c10")));

        gdd.setR6c1(Integer.parseInt(request.getParameter("r6c1")));
        gdd.setR6c2(Integer.parseInt(request.getParameter("r6c2")));
        gdd.setR6c3(Integer.parseInt(request.getParameter("r6c3")));
        gdd.setR6c4(Integer.parseInt(request.getParameter("r6c4")));
        gdd.setR6c5(Integer.parseInt(request.getParameter("r6c5")));
        gdd.setR6c6(Integer.parseInt(request.getParameter("r6c6")));
        gdd.setR6c7(Integer.parseInt(request.getParameter("r6c7")));
        gdd.setR6c8(Integer.parseInt(request.getParameter("r6c8")));
        gdd.setR6c9(Integer.parseInt(request.getParameter("r6c9")));
        gdd.setR6c10(Integer.parseInt(request.getParameter("r6c10")));

        CourseReportModel crm = new CourseReportModel();
        int addCoursesReport = crm.addCoursesReport(Integer.parseInt(academicsession));
        if (addCoursesReport > 0) {
            int setTrueisHadCMR = crm.setTrueisHadCMR(Integer.parseInt(academicsession));
            sd.setCMRId(addCoursesReport);
            boolean addSD = crm.addSD(addCoursesReport, sd);
            gdd.setCMRId(addCoursesReport);
            boolean addGDD = crm.addGDD(addCoursesReport, gdd);
            System.out.println(addCoursesReport + ":" + addSD + ":" + addGDD);
            request.getRequestDispatcher("getCMRCLServlet").forward(request, response);
        } else {
            request.getRequestDispatcher("createCMR.jsp").forward(request, response);
        }

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
