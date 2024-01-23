package Model;

import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Naved
 */
public class StudentDetails {
    
    private String Mode;
    private String CourseCode;
    private String CourseName;
    private String Intake;     // Lecture, Lab
    private String CourseScheduleDate;
    private String CourseScheduleTime;        // Registration Status
    private String CourseDescription;
    private String StudentName;
    private String ProfessorFeedback;
    private int CourseCredit;
    private Map<String, Integer> studentCreditMap = new HashMap<>();

    public String getMode() {
        return Mode;
    }

    public void setMode(String Mode) {
        this.Mode = Mode;
//        System.out.println(this.Mode);
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
//         System.out.println(this.CourseCode);
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
//        System.out.println(this.CourseName);
    }

    public String getIntake() {
        return Intake;
    }

    public void setIntake(String Intake) {
        this.Intake = Intake;
    }

    public String getCourseScheduleDate() {
        return CourseScheduleDate;
    }

    public void setCourseScheduleDate(String CourseScheduleDate) {
        this.CourseScheduleDate = CourseScheduleDate;
    }

    public String getCourseScheduleTime() {
        return CourseScheduleTime;
    }

    public void setCourseScheduleTime(String CourseScheduleTime) {
        this.CourseScheduleTime = CourseScheduleTime;
    }

    public String getCourseDescription() {
        return CourseDescription;
    }

    public void setCourseDescription(String CourseDescription) {
        this.CourseDescription = CourseDescription;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getProfessorFeedback() {
        return ProfessorFeedback;
    }

    public void setProfessorFeedback(String ProfessorFeedback) {
        this.ProfessorFeedback = ProfessorFeedback;
    }

    public void countCredits(Map<String, String> studentDetailsDirectory) {
        //public void countCredits (Map<String, String> studentDetailsDirectory){
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
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

  
    }
    
    
