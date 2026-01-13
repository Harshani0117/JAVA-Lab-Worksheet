package LW03;

import java.util.Scanner;

public class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getcourseCode(){
        return courseCode;
    }
    public void setcourseCode(String courseCode ){
        this.courseCode = courseCode;
    }
    public Lecturer getLecturer(){
        return lecturer;
    }
    public void setLecturer(Lecturer lecturer){
        this.lecturer = lecturer;
    }

}

