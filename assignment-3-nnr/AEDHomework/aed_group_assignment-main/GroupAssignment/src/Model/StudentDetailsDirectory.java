/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rohan
 */
public class StudentDetailsDirectory {
  
    private ArrayList<StudentDetails> studentcourseList;
    private Map<String, Integer> studentCreditMap = new HashMap<>();
    
    
    public StudentDetailsDirectory(){
        this.studentcourseList = new ArrayList<StudentDetails>();
    }

    public ArrayList<StudentDetails> getStudentcourseList() {
        return studentcourseList;
    }

    public void setStudentcourseList(ArrayList<StudentDetails> studentcourseList) {
        this.studentcourseList = studentcourseList;
    }

        public StudentDetails addStudentCourse(){
        StudentDetails studentdetails = new StudentDetails();
        studentcourseList.add(studentdetails);
        return studentdetails;
//        System.out.println(coursedetails);
        
        }
        
        public void countCredits (Map<String, String> studentDetailsDirectory){
          for(Map.Entry<String, String> entry : studentDetailsDirectory.entrySet()) {
             String StudentName = entry.getKey();
             String[] CourseName = entry.getValue().split(",");
             int regCourses = CourseName.length;
             int credits = regCourses * 4;
             studentCreditMap.put(StudentName, credits);
           }
          for (Map.Entry<String, Integer> entry : studentCreditMap.entrySet()){
              System.out.println("Student:" + entry.getKey() +",Credit Hours: " +entry.getValue());
          }
        }

    public StudentDetails searchStudentName(String studentNameGd) {
       for (StudentDetails studentdetails : studentcourseList){
           if (studentdetails.getStudentName().equals(studentNameGd)) {
               return studentdetails;
           }
       }
        return null;
    }  

}
    

