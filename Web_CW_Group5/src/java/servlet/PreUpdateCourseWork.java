/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;


import bean.CourseDAO;
import bean.CourseWorkDAO;
import bean.Department;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
@WebServlet(name = "PreUpdateCourseWork", urlPatterns = {"/PreUpdateCourseWork"})
public class PreUpdateCourseWork extends HttpServlet {

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
        
        String courseWorkId = request.getParameter("courseWorkId");
        CourseWorkDAO cou = null;
        
        //Ket noi database de lay ve produc theo product id nay:
        Connection con;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        con = dbconnect.DBConnect.getConnection();
        try {
            pstmt = con.prepareStatement("select * from CourseWork where courseWorkId=?");
            pstmt.setInt(1,Integer.parseInt(courseWorkId) );            
            rs = pstmt.executeQuery();
            
            if(rs.next()){
                cou = new CourseWorkDAO();
                cou.setCourseWorkId(rs.getInt(1));
                cou.setCourseId(rs.getString(2));
                cou.setDepartmentId(rs.getInt(3));
                cou.setCourseLeader(rs.getString(4));
                cou.setCourserModerator(rs.getString(5));
                cou.setCreateDate(rs.getDate(6));
                cou.setYearMaking(rs.getInt(7));
                cou.setSemester(rs.getInt(8));
                cou.setStudentCount(rs.getInt(9));
                cou.setCourserUnits(rs.getInt(10));
                cou.setCostUnit(rs.getString(11));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseWorkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.DBConnect.closeAll(con, pstmt, rs);
        }
        
        CourseDAO course = new CourseWorkDAO().getCourseByCourseWorkId(Integer.parseInt(courseWorkId));
        List<CourseDAO> listCou =new CourseDAO().getAllCourses();
        Department de = new CourseWorkDAO().getDepartmentCourseWorkId(Integer.parseInt(courseWorkId));
        List<Department> listDe = new Department().getAllDepartment();
        
        request.setAttribute("Course", course);
        request.setAttribute("ListDe", listDe);
        request.setAttribute("Department", de);
        request.setAttribute("ListCourse", listCou);
        request.setAttribute("CourseWork", cou);
        request.getRequestDispatcher("updateCourseWorkAdmin.jsp").forward(request, response);
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
