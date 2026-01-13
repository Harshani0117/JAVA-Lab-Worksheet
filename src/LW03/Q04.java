package LW03;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        Lecturer lecturer = new Lecturer();
        lecturer.setLecturerName("Dr.kesevan");
        lecturer.setcourseTeaching("OOP");

        Course course = new Course();
        course.setCourseName("OOP");
        course.setcourseCode("CSCI21052");

        Student student = new Student();
        student.setStudentname("Harshani");
        student.setdegreename("Computer Science");
        student.setcoursefollowing(course.getCourseName());


        System.out.println("course name :"+course.getCourseName());
        System.out.println("course code :"+course.getcourseCode());
        System.out.println("student name:"+student.getStudentname());
        System.out.println("Lecturer :"+lecturer.getLecturerName());
        System.out.println("Degree :"+ student.getdegreename());
        System.out.println("course Followed :"+ student.getcoursefollowing() );

    }
}
