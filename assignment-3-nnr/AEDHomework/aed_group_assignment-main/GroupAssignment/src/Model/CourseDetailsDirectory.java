/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Naved
 */

public class CourseDetailsDirectory {
    private ArrayList<CourseDetails> courseList;
    
    
    public CourseDetailsDirectory(){
        this.courseList = new ArrayList<CourseDetails>();
    }

    public ArrayList<CourseDetails> getCourseList() {
        return courseList;
//        System.out.println(courseList);
    }

    public void setCourseList(ArrayList<CourseDetails> courseList) {
        this.courseList = courseList;
//        System.out.println("Contents of courseList: " + courseList);
    }
    
    public CourseDetails addCourse(){
        CourseDetails coursedetails = new CourseDetails();
        courseList.add(coursedetails);
        return coursedetails;
//        System.out.println(coursedetails);
        
        }
    

    
    public void deleteCourse (CourseDetails coursedetails){
           courseList.remove(coursedetails);
    }

public CourseDetails searchCourseDetails(String ProfessorName) {
    for (CourseDetails coursedetails : courseList) {
//        System.out.println("Course Details in courseDetailsDirectory: " + courseD);
//        System.out.println("Searching for: " + ProfessorName);
//        System.out.println("Found: " + coursedetails.getProfessorName());
        if (coursedetails.getProfessorName().equals(ProfessorName)) {
            return coursedetails;
        }
    }
    return null;
}

public CourseDetails searchProfessorName(String ProfessorName) {
    for (CourseDetails coursedetails : courseList) {
//        System.out.println("Course Details in courseDetailsDirectory: " + courseD);
//        System.out.println("Searching for: " + ProfessorName);
//        System.out.println("Found: " + coursedetails.getProfessorName());
        if (coursedetails.getProfessorName().equals(ProfessorName)) {
            return coursedetails;
        }
    }
    return null;
}


   /* public CourseDetails searchCourseDetails(String courseName, String professorName) {
        for (CourseDetails coursedetails : courseList) {
        if (coursedetails.getCourseName().equals(courseName) && coursedetails.getProfessorName().equals(professorName)) {
            return coursedetails;
        }
    }
    return null;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
}
    


