/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author TIEN DAT
 */
public class CourseMonitorReport {

    private int CMRId;
    private int academicSession;
    private String courseId;
    private String title;
    private String courseLeader;
    private int studentCount;
    private String commentContent;
    private String action;
    private boolean isStatus;

    public int getCMRId() {
        return CMRId;
    }

    public void setCMRId(int CMRId) {
        this.CMRId = CMRId;
    }

    public int getAcademicSession() {
        return academicSession;
    }

    public void setAcademicSession(int academicSession) {
        this.academicSession = academicSession;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
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

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
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

    public boolean isIsStatus() {
        return isStatus;
    }

    public void setIsStatus(boolean isStatus) {
        this.isStatus = isStatus;
    }

    public CourseMonitorReport() {
    }

    public CourseMonitorReport(int academicSession, String courseId, String title, String courseLeader, int studentCount, float examOfStatistical, int overallOfStatistical, int examOfGradeDistribution, float overallOfGradeDistribution) {
        this.academicSession = academicSession;
        this.courseId = courseId;
        this.title = title;
        this.courseLeader = courseLeader;
        this.studentCount = studentCount;
    }

}
