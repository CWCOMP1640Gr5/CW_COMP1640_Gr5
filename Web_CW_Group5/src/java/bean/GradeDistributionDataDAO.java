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
 */
public class GradeDistributionDataDAO {
    
     private int gradeId,
            CMRId,
            r1c1 , r1c2 , r1c3 , r1c4 , r1c5 , r1c6 , r1c7 , r1c8 , r1c9 , r1c10 ,
            r2c1 , r2c2 , r2c3 , r2c4 , r2c5 , r2c6 , r2c7 , r2c8 , r2c9 , r2c10 ,
            r3c1 , r3c2 , r3c3 , r3c4 , r3c5 , r3c6 , r3c7 , r3c8 , r3c9 , r3c10 ,
            r4c1 , r4c2 , r4c3 , r4c4 , r4c5 , r4c6 , r4c7 , r4c8 , r4c9 , r4c10 ,
            r5c1 , r5c2 , r5c3 , r5c4 , r5c5 , r5c6 , r5c7 , r5c8 , r5c9 , r5c10 ,
            r6c1 , r6c2 , r6c3 , r6c4 , r6c5 , r6c6 , r6c7 , r6c8 , r6c9 , r6c10;

    public GradeDistributionDataDAO() {
    }

    public GradeDistributionDataDAO(int gradeId, int CMRId, int r1c1, int r1c2, int r1c3, int r1c4, int r1c5, int r1c6, int r1c7, int r1c8, int r1c9, int r1c10, int r2c1, int r2c2, int r2c3, int r2c4, int r2c5, int r2c6, int r2c7, int r2c8, int r2c9, int r2c10, int r3c1, int r3c2, int r3c3, int r3c4, int r3c5, int r3c6, int r3c7, int r3c8, int r3c9, int r3c10, int r4c1, int r4c2, int r4c3, int r4c4, int r4c5, int r4c6, int r4c7, int r4c8, int r4c9, int r4c10, int r5c1, int r5c2, int r5c3, int r5c4, int r5c5, int r5c6, int r5c7, int r5c8, int r5c9, int r5c10, int r6c1, int r6c2, int r6c3, int r6c4, int r6c5, int r6c6, int r6c7, int r6c8, int r6c9, int r6c10) {
        this.gradeId = gradeId;
        this.CMRId = CMRId;
        this.r1c1 = r1c1;
        this.r1c2 = r1c2;
        this.r1c3 = r1c3;
        this.r1c4 = r1c4;
        this.r1c5 = r1c5;
        this.r1c6 = r1c6;
        this.r1c7 = r1c7;
        this.r1c8 = r1c8;
        this.r1c9 = r1c9;
        this.r1c10 = r1c10;
        this.r2c1 = r2c1;
        this.r2c2 = r2c2;
        this.r2c3 = r2c3;
        this.r2c4 = r2c4;
        this.r2c5 = r2c5;
        this.r2c6 = r2c6;
        this.r2c7 = r2c7;
        this.r2c8 = r2c8;
        this.r2c9 = r2c9;
        this.r2c10 = r2c10;
        this.r3c1 = r3c1;
        this.r3c2 = r3c2;
        this.r3c3 = r3c3;
        this.r3c4 = r3c4;
        this.r3c5 = r3c5;
        this.r3c6 = r3c6;
        this.r3c7 = r3c7;
        this.r3c8 = r3c8;
        this.r3c9 = r3c9;
        this.r3c10 = r3c10;
        this.r4c1 = r4c1;
        this.r4c2 = r4c2;
        this.r4c3 = r4c3;
        this.r4c4 = r4c4;
        this.r4c5 = r4c5;
        this.r4c6 = r4c6;
        this.r4c7 = r4c7;
        this.r4c8 = r4c8;
        this.r4c9 = r4c9;
        this.r4c10 = r4c10;
        this.r5c1 = r5c1;
        this.r5c2 = r5c2;
        this.r5c3 = r5c3;
        this.r5c4 = r5c4;
        this.r5c5 = r5c5;
        this.r5c6 = r5c6;
        this.r5c7 = r5c7;
        this.r5c8 = r5c8;
        this.r5c9 = r5c9;
        this.r5c10 = r5c10;
        this.r6c1 = r6c1;
        this.r6c2 = r6c2;
        this.r6c3 = r6c3;
        this.r6c4 = r6c4;
        this.r6c5 = r6c5;
        this.r6c6 = r6c6;
        this.r6c7 = r6c7;
        this.r6c8 = r6c8;
        this.r6c9 = r6c9;
        this.r6c10 = r6c10;
    }

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public int getCMRId() {
        return CMRId;
    }

    public void setCMRId(int CMRId) {
        this.CMRId = CMRId;
    }

    public int getR1c1() {
        return r1c1;
    }

    public void setR1c1(int r1c1) {
        this.r1c1 = r1c1;
    }

    public int getR1c2() {
        return r1c2;
    }

    public void setR1c2(int r1c2) {
        this.r1c2 = r1c2;
    }

    public int getR1c3() {
        return r1c3;
    }

    public void setR1c3(int r1c3) {
        this.r1c3 = r1c3;
    }

    public int getR1c4() {
        return r1c4;
    }

    public void setR1c4(int r1c4) {
        this.r1c4 = r1c4;
    }

    public int getR1c5() {
        return r1c5;
    }

    public void setR1c5(int r1c5) {
        this.r1c5 = r1c5;
    }

    public int getR1c6() {
        return r1c6;
    }

    public void setR1c6(int r1c6) {
        this.r1c6 = r1c6;
    }

    public int getR1c7() {
        return r1c7;
    }

    public void setR1c7(int r1c7) {
        this.r1c7 = r1c7;
    }

    public int getR1c8() {
        return r1c8;
    }

    public void setR1c8(int r1c8) {
        this.r1c8 = r1c8;
    }

    public int getR1c9() {
        return r1c9;
    }

    public void setR1c9(int r1c9) {
        this.r1c9 = r1c9;
    }

    public int getR1c10() {
        return r1c10;
    }

    public void setR1c10(int r1c10) {
        this.r1c10 = r1c10;
    }

    public int getR2c1() {
        return r2c1;
    }

    public void setR2c1(int r2c1) {
        this.r2c1 = r2c1;
    }

    public int getR2c2() {
        return r2c2;
    }

    public void setR2c2(int r2c2) {
        this.r2c2 = r2c2;
    }

    public int getR2c3() {
        return r2c3;
    }

    public void setR2c3(int r2c3) {
        this.r2c3 = r2c3;
    }

    public int getR2c4() {
        return r2c4;
    }

    public void setR2c4(int r2c4) {
        this.r2c4 = r2c4;
    }

    public int getR2c5() {
        return r2c5;
    }

    public void setR2c5(int r2c5) {
        this.r2c5 = r2c5;
    }

    public int getR2c6() {
        return r2c6;
    }

    public void setR2c6(int r2c6) {
        this.r2c6 = r2c6;
    }

    public int getR2c7() {
        return r2c7;
    }

    public void setR2c7(int r2c7) {
        this.r2c7 = r2c7;
    }

    public int getR2c8() {
        return r2c8;
    }

    public void setR2c8(int r2c8) {
        this.r2c8 = r2c8;
    }

    public int getR2c9() {
        return r2c9;
    }

    public void setR2c9(int r2c9) {
        this.r2c9 = r2c9;
    }

    public int getR2c10() {
        return r2c10;
    }

    public void setR2c10(int r2c10) {
        this.r2c10 = r2c10;
    }

    public int getR3c1() {
        return r3c1;
    }

    public void setR3c1(int r3c1) {
        this.r3c1 = r3c1;
    }

    public int getR3c2() {
        return r3c2;
    }

    public void setR3c2(int r3c2) {
        this.r3c2 = r3c2;
    }

    public int getR3c3() {
        return r3c3;
    }

    public void setR3c3(int r3c3) {
        this.r3c3 = r3c3;
    }

    public int getR3c4() {
        return r3c4;
    }

    public void setR3c4(int r3c4) {
        this.r3c4 = r3c4;
    }

    public int getR3c5() {
        return r3c5;
    }

    public void setR3c5(int r3c5) {
        this.r3c5 = r3c5;
    }

    public int getR3c6() {
        return r3c6;
    }

    public void setR3c6(int r3c6) {
        this.r3c6 = r3c6;
    }

    public int getR3c7() {
        return r3c7;
    }

    public void setR3c7(int r3c7) {
        this.r3c7 = r3c7;
    }

    public int getR3c8() {
        return r3c8;
    }

    public void setR3c8(int r3c8) {
        this.r3c8 = r3c8;
    }

    public int getR3c9() {
        return r3c9;
    }

    public void setR3c9(int r3c9) {
        this.r3c9 = r3c9;
    }

    public int getR3c10() {
        return r3c10;
    }

    public void setR3c10(int r3c10) {
        this.r3c10 = r3c10;
    }

    public int getR4c1() {
        return r4c1;
    }

    public void setR4c1(int r4c1) {
        this.r4c1 = r4c1;
    }

    public int getR4c2() {
        return r4c2;
    }

    public void setR4c2(int r4c2) {
        this.r4c2 = r4c2;
    }

    public int getR4c3() {
        return r4c3;
    }

    public void setR4c3(int r4c3) {
        this.r4c3 = r4c3;
    }

    public int getR4c4() {
        return r4c4;
    }

    public void setR4c4(int r4c4) {
        this.r4c4 = r4c4;
    }

    public int getR4c5() {
        return r4c5;
    }

    public void setR4c5(int r4c5) {
        this.r4c5 = r4c5;
    }

    public int getR4c6() {
        return r4c6;
    }

    public void setR4c6(int r4c6) {
        this.r4c6 = r4c6;
    }

    public int getR4c7() {
        return r4c7;
    }

    public void setR4c7(int r4c7) {
        this.r4c7 = r4c7;
    }

    public int getR4c8() {
        return r4c8;
    }

    public void setR4c8(int r4c8) {
        this.r4c8 = r4c8;
    }

    public int getR4c9() {
        return r4c9;
    }

    public void setR4c9(int r4c9) {
        this.r4c9 = r4c9;
    }

    public int getR4c10() {
        return r4c10;
    }

    public void setR4c10(int r4c10) {
        this.r4c10 = r4c10;
    }

    public int getR5c1() {
        return r5c1;
    }

    public void setR5c1(int r5c1) {
        this.r5c1 = r5c1;
    }

    public int getR5c2() {
        return r5c2;
    }

    public void setR5c2(int r5c2) {
        this.r5c2 = r5c2;
    }

    public int getR5c3() {
        return r5c3;
    }

    public void setR5c3(int r5c3) {
        this.r5c3 = r5c3;
    }

    public int getR5c4() {
        return r5c4;
    }

    public void setR5c4(int r5c4) {
        this.r5c4 = r5c4;
    }

    public int getR5c5() {
        return r5c5;
    }

    public void setR5c5(int r5c5) {
        this.r5c5 = r5c5;
    }

    public int getR5c6() {
        return r5c6;
    }

    public void setR5c6(int r5c6) {
        this.r5c6 = r5c6;
    }

    public int getR5c7() {
        return r5c7;
    }

    public void setR5c7(int r5c7) {
        this.r5c7 = r5c7;
    }

    public int getR5c8() {
        return r5c8;
    }

    public void setR5c8(int r5c8) {
        this.r5c8 = r5c8;
    }

    public int getR5c9() {
        return r5c9;
    }

    public void setR5c9(int r5c9) {
        this.r5c9 = r5c9;
    }

    public int getR5c10() {
        return r5c10;
    }

    public void setR5c10(int r5c10) {
        this.r5c10 = r5c10;
    }

    public int getR6c1() {
        return r6c1;
    }

    public void setR6c1(int r6c1) {
        this.r6c1 = r6c1;
    }

    public int getR6c2() {
        return r6c2;
    }

    public void setR6c2(int r6c2) {
        this.r6c2 = r6c2;
    }

    public int getR6c3() {
        return r6c3;
    }

    public void setR6c3(int r6c3) {
        this.r6c3 = r6c3;
    }

    public int getR6c4() {
        return r6c4;
    }

    public void setR6c4(int r6c4) {
        this.r6c4 = r6c4;
    }

    public int getR6c5() {
        return r6c5;
    }

    public void setR6c5(int r6c5) {
        this.r6c5 = r6c5;
    }

    public int getR6c6() {
        return r6c6;
    }

    public void setR6c6(int r6c6) {
        this.r6c6 = r6c6;
    }

    public int getR6c7() {
        return r6c7;
    }

    public void setR6c7(int r6c7) {
        this.r6c7 = r6c7;
    }

    public int getR6c8() {
        return r6c8;
    }

    public void setR6c8(int r6c8) {
        this.r6c8 = r6c8;
    }

    public int getR6c9() {
        return r6c9;
    }

    public void setR6c9(int r6c9) {
        this.r6c9 = r6c9;
    }

    public int getR6c10() {
        return r6c10;
    }

    public void setR6c10(int r6c10) {
        this.r6c10 = r6c10;
    }
     
     public GradeDistributionDataDAO getStatiscalDataByCMRId(int cmrId) {
        GradeDistributionDataDAO gra = null;
        Connection con;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        con = dbconnect.DBConnect.getConnection();

        try {
            pstm = con.prepareStatement("select * from StatisticalData where CMRId=?");
            pstm.setInt(1, cmrId);
            rs = pstm.executeQuery();
            while (rs.next()) {
                gra = new GradeDistributionDataDAO();
                
                gra.setGradeId(rs.getInt(1));
                gra.setCMRId(rs.getInt(2));
                gra.setR1c1(rs.getInt(3));
                gra.setR1c2(rs.getInt(4));
                gra.setR1c3(rs.getInt(5));
                gra.setR1c4(rs.getInt(6));
                gra.setR1c5(rs.getInt(7));
                gra.setR1c6(rs.getInt(8));
                gra.setR1c7(rs.getInt(9));
                gra.setR1c8(rs.getInt(10));
                gra.setR1c9(rs.getInt(11));
                gra.setR1c10(rs.getInt(12));
                gra.setR2c1(rs.getInt(13));
                gra.setR2c2(rs.getInt(14));
                gra.setR2c3(rs.getInt(15));
                gra.setR2c4(rs.getInt(16));
                gra.setR2c5(rs.getInt(17));
                gra.setR2c6(rs.getInt(18));
                gra.setR2c7(rs.getInt(19));
                gra.setR2c8(rs.getInt(20));
                gra.setR2c9(rs.getInt(21));
                gra.setR2c10(rs.getInt(22));
                gra.setR3c1(rs.getInt(23));
                gra.setR3c2(rs.getInt(24));
                gra.setR3c3(rs.getInt(25));
                gra.setR3c4(rs.getInt(26));
                gra.setR3c5(rs.getInt(27));
                gra.setR3c6(rs.getInt(28));
                gra.setR3c7(rs.getInt(29));
                gra.setR3c8(rs.getInt(30));
                gra.setR3c9(rs.getInt(31));
                gra.setR3c10(rs.getInt(32));
                gra.setR4c1(rs.getInt(33));
                gra.setR4c2(rs.getInt(34));
                gra.setR4c3(rs.getInt(35));
                gra.setR4c4(rs.getInt(36));
                gra.setR4c5(rs.getInt(37));
                gra.setR4c6(rs.getInt(38));
                gra.setR4c7(rs.getInt(39));
                gra.setR4c8(rs.getInt(40));
                gra.setR4c9(rs.getInt(41));
                gra.setR4c10(rs.getInt(42));
                gra.setR5c1(rs.getInt(43));
                gra.setR5c2(rs.getInt(44));
                gra.setR5c3(rs.getInt(45));
                gra.setR5c4(rs.getInt(46));
                gra.setR5c5(rs.getInt(47));
                gra.setR5c6(rs.getInt(48));
                gra.setR5c7(rs.getInt(49));
                gra.setR5c8(rs.getInt(50));
                gra.setR5c9(rs.getInt(51));
                gra.setR5c10(rs.getInt(52));
                gra.setR6c1(rs.getInt(53));
                gra.setR6c2(rs.getInt(54));
                gra.setR6c3(rs.getInt(55));
                gra.setR6c4(rs.getInt(56));
                gra.setR6c5(rs.getInt(57));
                gra.setR6c6(rs.getInt(58));
                gra.setR6c7(rs.getInt(59));
                gra.setR6c8(rs.getInt(60));
                gra.setR6c9(rs.getInt(61));
                gra.setR6c10(rs.getInt(62));
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(GradeDistributionDataDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.DBConnect.closeAll(con, pstm, rs);
        }

        return gra;
    }
    
    
}
