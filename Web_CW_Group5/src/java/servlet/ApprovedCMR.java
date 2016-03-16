/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;


import bean.CourseMonitorReportDAO;
import bean.CourseWorkDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

/**
 *
 * @author Fpt
 */
@WebServlet(name = "ApprovedCMR", urlPatterns = {"/ApprovedCMR"})
public class ApprovedCMR extends HttpServlet {

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
        
        int cmrId = Integer.parseInt(request.getParameter("txtCMRId"));
        
        
        boolean kq = false;
        Connection con;
        PreparedStatement pstm;
        con = dbconnect.DBConnect.getConnection();
        String act ="Approved";

        try {
            pstm = con.prepareStatement("update CourseMonitorReport set action=? where CMRId=?");
//
            pstm.setString(1, act);
            pstm.setInt(2, cmrId);
            

            int result = pstm.executeUpdate();

           if (result > 0) {
                    kq = true;
                    
                    HttpSession session = request.getSession();
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equals("lastname")) {
                    session.setAttribute("lastname", cookies[i].getValue());
                }
            }
        }
        String cmName = (String) session.getAttribute("lastname");
        
        List<CourseMonitorReportDAO> listCMR = new CourseWorkDAO().getCMRByCMName(cmName);
        
       
        request.setAttribute("insertStatus", "Approve SuccessFully:");
         request.setAttribute("listCMR", listCMR);
         request.getRequestDispatcher("listCMRNewForCM.jsp").forward(request, response);
                }
                else {
                    //ko thanhcong
                    request.setAttribute("insertStatus", "Approve Fail:");
                    
                    request.getRequestDispatcher("listCMRNewForCM.jsp").forward(request, response);
                }

            } catch (SQLException ex) {
                Logger.getLogger(CourseWorkDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ApprovedCMR</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ApprovedCMR at " + cmrId + "</h1>");
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
