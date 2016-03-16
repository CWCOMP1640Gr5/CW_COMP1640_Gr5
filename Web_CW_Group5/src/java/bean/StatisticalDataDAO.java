/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fpt
 * statisId int identity primary key,
	CMRId int references CourseMonitorReport(CMRId) NOT NULL,
	cw1r1 int,
	cw1r2 int,
	cw1r3 int,
	cw2r1 int,
	cw2r2 int,
	cw2r3 int,
	cw3r1 int,
	cw3r2 int,
	cw3r3 int,
	cw4r1 int,
	cw4r2 int,
	cw4r3 int,
	examr1 int,
	exam1r2 int,
	exam1r3 int,
	over1r1 float,
	overr2 float,
	overr3 float
 */
public class StatisticalDataDAO {
    private int statisId;
    private int CMRId;
    private int cw1r1;
    private int cw1r2;
    private int cw1r3;
    private int cw2r1;
    private int cw2r2;
    private int cw2r3;
    private int cw3r1;
    private int cw3r2;
    private int cw3r3;
    private int cw4r1;
    private int cw4r2;
    private int cw4r3;
    private int examr1;
    private int exam1r2;
    private int exam1r3;
    private float over1r1;
    private float overr2;
    private float overr3;

    public StatisticalDataDAO() {
    }

    public StatisticalDataDAO(int statisId, int CMRId, int cw1r1, int cw1r2, int cw1r3, int cw2r1, int cw2r2, int cw2r3, int cw3r1, int cw3r2, int cw3r3, int cw4r1, int cw4r2, int cw4r3, int examr1, int exam1r2, int exam1r3, float over1r1, float overr2, float overr3) {
        this.statisId = statisId;
        this.CMRId = CMRId;
        this.cw1r1 = cw1r1;
        this.cw1r2 = cw1r2;
        this.cw1r3 = cw1r3;
        this.cw2r1 = cw2r1;
        this.cw2r2 = cw2r2;
        this.cw2r3 = cw2r3;
        this.cw3r1 = cw3r1;
        this.cw3r2 = cw3r2;
        this.cw3r3 = cw3r3;
        this.cw4r1 = cw4r1;
        this.cw4r2 = cw4r2;
        this.cw4r3 = cw4r3;
        this.examr1 = examr1;
        this.exam1r2 = exam1r2;
        this.exam1r3 = exam1r3;
        this.over1r1 = over1r1;
        this.overr2 = overr2;
        this.overr3 = overr3;
    }

    public int getStatisId() {
        return statisId;
    }

    public void setStatisId(int statisId) {
        this.statisId = statisId;
    }

    public int getCMRId() {
        return CMRId;
    }

    public void setCMRId(int CMRId) {
        this.CMRId = CMRId;
    }

    public int getCw1r1() {
        return cw1r1;
    }

    public void setCw1r1(int cw1r1) {
        this.cw1r1 = cw1r1;
    }

    public int getCw1r2() {
        return cw1r2;
    }

    public void setCw1r2(int cw1r2) {
        this.cw1r2 = cw1r2;
    }

    public int getCw1r3() {
        return cw1r3;
    }

    public void setCw1r3(int cw1r3) {
        this.cw1r3 = cw1r3;
    }

    public int getCw2r1() {
        return cw2r1;
    }

    public void setCw2r1(int cw2r1) {
        this.cw2r1 = cw2r1;
    }

    public int getCw2r2() {
        return cw2r2;
    }

    public void setCw2r2(int cw2r2) {
        this.cw2r2 = cw2r2;
    }

    public int getCw2r3() {
        return cw2r3;
    }

    public void setCw2r3(int cw2r3) {
        this.cw2r3 = cw2r3;
    }

    public int getCw3r1() {
        return cw3r1;
    }

    public void setCw3r1(int cw3r1) {
        this.cw3r1 = cw3r1;
    }

    public int getCw3r2() {
        return cw3r2;
    }

    public void setCw3r2(int cw3r2) {
        this.cw3r2 = cw3r2;
    }

    public int getCw3r3() {
        return cw3r3;
    }

    public void setCw3r3(int cw3r3) {
        this.cw3r3 = cw3r3;
    }

    public int getCw4r1() {
        return cw4r1;
    }

    public void setCw4r1(int cw4r1) {
        this.cw4r1 = cw4r1;
    }

    public int getCw4r2() {
        return cw4r2;
    }

    public void setCw4r2(int cw4r2) {
        this.cw4r2 = cw4r2;
    }

    public int getCw4r3() {
        return cw4r3;
    }

    public void setCw4r3(int cw4r3) {
        this.cw4r3 = cw4r3;
    }

    public int getExamr1() {
        return examr1;
    }

    public void setExamr1(int examr1) {
        this.examr1 = examr1;
    }

    public int getExam1r2() {
        return exam1r2;
    }

    public void setExam1r2(int exam1r2) {
        this.exam1r2 = exam1r2;
    }

    public int getExam1r3() {
        return exam1r3;
    }

    public void setExam1r3(int exam1r3) {
        this.exam1r3 = exam1r3;
    }

    public float getOver1r1() {
        return over1r1;
    }

    public void setOver1r1(float over1r1) {
        this.over1r1 = over1r1;
    }

    public float getOverr2() {
        return overr2;
    }

    public void setOverr2(float overr2) {
        this.overr2 = overr2;
    }

    public float getOverr3() {
        return overr3;
    }

    public void setOverr3(float overr3) {
        this.overr3 = overr3;
    }
    
    public StatisticalDataDAO getStatiscalDataByCMRId(int cmrId) {
        StatisticalDataDAO sta = null;
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("select * from StatisticalData where CMRId=?");
            pstm.setInt(1, cmrId);
            rs = pstm.executeQuery();
            while (rs.next()) {
                sta = new StatisticalDataDAO();
                
                sta.setStatisId(rs.getInt(1));

                sta.setCMRId(rs.getInt(2));
                sta.setCw1r1(rs.getInt(3));
                sta.setCw1r2(rs.getInt(4)); 
                sta.setCw1r3(rs.getInt(5));
                sta.setCw2r1(rs.getInt(6));
                sta.setCw2r2(rs.getInt(7));
                sta.setCw2r3(rs.getInt(8));
                sta.setCw3r1(rs.getInt(9));
                sta.setCw3r2(rs.getInt(10));
                sta.setCw3r3(rs.getInt(11));
                sta.setCw4r1(rs.getInt(12));
                sta.setCw4r2(rs.getInt(13));
                sta.setCw4r3(rs.getInt(14));
                sta.setExamr1(rs.getInt(15));
                sta.setExam1r2(rs.getInt(16));
                sta.setExam1r3(rs.getInt(17));
                sta.setOver1r1(rs.getFloat(18));
                sta.setOverr2(rs.getFloat(19));
                sta.setOverr3(rs.getFloat(20));                

            }

        } catch (SQLException ex) {
            Logger.getLogger(StatisticalDataDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }

        return sta;
    }
}
