/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author TIEN DAT
 */
public class Courses {

    private String courseId;
    private int departmentId;
    private String title;
    private String courseLeader;
    private String courserModerator;
    private Date createDate;
    private int semester;
    private int studentCount;
    private int courserUnits;
    private String costUnit;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourseLeader() {
        return courseLeader;
    }

    public void setCourseLeader(String courseLeader) {
        this.courseLeader = courseLeader;
    }

    public String getCourserModerator() {
        return courserModerator;
    }

    public void setCourserModerator(String courserModerator) {
        this.courserModerator = courserModerator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public int getCourserUnits() {
        return courserUnits;
    }

    public void setCourserUnits(int courserUnits) {
        this.courserUnits = courserUnits;
    }

    public String getCostUnit() {
        return costUnit;
    }

    public void setCostUnit(String costUnit) {
        this.costUnit = costUnit;
    }

    public Courses() {
    }

    public Courses(String courseId, String title) {
        this.courseId = courseId;
        this.title = title;
    }
    
    
}
