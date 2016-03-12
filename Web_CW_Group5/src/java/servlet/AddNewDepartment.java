/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bean.Department;
import java.io.File;
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
public class AddNewDepartment extends HttpServlet {

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
        
        
        String departmentName = request.getParameter("department");
        
         boolean bl = true;
         boolean result = new Department().checkProDuplicate(departmentName);
         if (departmentName.length() == 0) {
            request.setAttribute("deErr", "Programing id must be inputed");
            bl = false;
        }
         if(result)
         {
             request.setAttribute("deErr", "Programing has been exist");
             bl= false;
         }
         
         if(bl)
         {
            Connection con;
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            con = dbconnect.DBConnect.getConnection();
            try {
                pstmt = con.prepareStatement("insert into Department values (?)");
                pstmt.setString(1, departmentName);
                
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    //thanh cong
                    request.setAttribute("insertStatus", "Insert successfull for Programing:" + departmentName);

                     List<Department> listDe = new Department().getAllDepartment();
        
                    request.setAttribute("listDe", listDe);
                    request.getRequestDispatcher("listDepartmentAdmin.jsp").forward(request, response);
                } else {
                    //ko thanhcong
                    request.setAttribute("insertStatus", "Add failed");
                    
                    request.getRequestDispatcher("addNewDepartment.jsp").forward(request, response);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                dbconnect.DBConnect.closeAll(con, pstmt, rs);
            }
            //ket thuc update
        } else {           
            request.getRequestDispatcher("addNewDepartment.jsp").forward(request, response);
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
