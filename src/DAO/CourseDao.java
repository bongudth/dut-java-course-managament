/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.CourseModel;
import java.sql.*;
import java.util.*;

/**
 *
 * @author HuynhThiKhanhLinh
 */
public class CourseDao {
    public void addCourse(CourseModel course){
        Connection conn = Connection.getJDBCConnection();
        
        try{
            PreparedStatement pstmt = conn.prepareStatement("insert into COURSE (CourseCode, CourseName, CourseCredit) values (?, ?, ?)");
            pstmt.setString(1, course.getCourseCode());
            pstmt.setString(1, course.getCourseName());
            pstmt.setInt(1, course.getCourseCredit());
            pstmt.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public List<CourseModel> getAllCourses() {
        List<CourseModel> courses = new ArrayList<CourseModel>();
        Connection connection = Connection.getJDBCConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement("select * from COURSE");
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                CourseModel course = new CourseModel();
                course.setCourseCode(rs.getString("courseCode"));
                course.setCourseName(rs.getString("courseName"));
                course.setCourseCredit(rs.getInt("courseCredit"));
                courses.add(course);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return courses;
    }
    
    public CourseModel getCourseByCourseCode(String code) {
        CourseModel course = new CourseModel();
        Connection connection = Connection.getJDBCConnection();

        try {
            Statement stmt = connection.createStatement("select * from course where id = " + code);

            ResultSet rs = stmt.executeQuery("select * from course where id = " + code);

            if (rs.next()) {
                course.setCourseCode(rs.getString("courseCode"));
                course.setCourseName(rs.getString("courseName"));
                course.setCourseCredit(rs.getInt("courseCredit"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return course;
    }
}
