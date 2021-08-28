/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author HuynhThiKhanhLinh
 */
public class CourseModel {
    private String courseCode;
    private String courseName;
    private Integer courseCredit;

    public CourseModel() {
    }

    public CourseModel(String courseCode, String courseName, Integer courseCredit) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseCredit = courseCredit;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Integer getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCredit(Integer courseCredit) {
        this.courseCredit = courseCredit;
    }
    
    @Override
    public String toString() {
        return courseCode + " | " + courseName + " | " + courseCredit;
    }
}
