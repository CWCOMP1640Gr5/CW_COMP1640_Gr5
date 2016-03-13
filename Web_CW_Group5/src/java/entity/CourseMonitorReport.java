/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author TIEN DAT
 */
public class CourseMonitorReport {

    private int CMRId;
    private int courseWorkId;
    private String commentContent;
    private String action;
    private Date startDate;
    private String isStatus;
    private String title;
    private String CourseId;
    private int departmentId;
    private String courserModerator;
    private String courseLeader;
    private int yearMaking;
    private int semester;
    private int studentCount;
    private int courserUnits;
    private int costUnit;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourseId() {
        return CourseId;
    }

    public void setCourseId(String CourseId) {
        this.CourseId = CourseId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getCourserModerator() {
        return courserModerator;
    }

    public void setCourserModerator(String courserModerator) {
        this.courserModerator = courserModerator;
    }

    public String getCourseLeader() {
        return courseLeader;
    }

    public void setCourseLeader(String courseLeader) {
        this.courseLeader = courseLeader;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
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

    public int getCostUnit() {
        return costUnit;
    }

    public void setCostUnit(int costUnit) {
        this.costUnit = costUnit;
    }
    
    

    public int getCMRId() {
        return CMRId;
    }

    public void setCMRId(int CMRId) {
        this.CMRId = CMRId;
    }

    public int getCourseWorkId() {
        return courseWorkId;
    }

    public void setCourseWorkId(int courseWorkId) {
        this.courseWorkId = courseWorkId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getIsStatus() {
        return isStatus;
    }

    public void setIsStatus(String isStatus) {
        this.isStatus = isStatus;
    }

    public CourseMonitorReport(int CMRId, int courseWorkId, String commentContent, String action, Date startDate, String isStatus) {
        this.CMRId = CMRId;
        this.courseWorkId = courseWorkId;
        this.commentContent = commentContent;
        this.action = action;
        this.startDate = startDate;
        this.isStatus = isStatus;
    }

    public CourseMonitorReport() {
    }

}
