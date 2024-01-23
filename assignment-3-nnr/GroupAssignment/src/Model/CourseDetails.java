package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Naved
 */
public class CourseDetails {
    
    
    private String Mode;
    private String CourseCode;
    private String CourseName;
    private String Intake;     // Lecture, Lab
    private String CourseScheduleDate;
    private String CourseScheduleTime;        // Registration Status
    private String CourseDescription;
    private String ProfessorName;
    private int  ProfessorRating;
    
    

    public String getProfessorName() {
        return ProfessorName;
        
    }

    public void setProfessorName(String ProfessorName) {
        this.ProfessorName = ProfessorName;
//        System.out.println(ProfessorName);
    }

    public String getMode() {
        return Mode;
        
    }

    public void setMode(String mode) {
        this.Mode = mode;
//        System.out.println(Mode);
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
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
    
    @Override
    public String toString(){
        return Mode;
    }

    public String getCourseSchedule() {
        return CourseScheduleDate;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void setCourseSchedule(String courseScheduleDate) {
        this.CourseScheduleDate = courseScheduleDate;
    }
    public void setCourseTime(String courseScheduleTime) {
        this.CourseScheduleTime = courseScheduleTime;
    }

    public String getCourseTime() {
        return CourseScheduleTime;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getProfessorRating() {
        return ProfessorRating;
    }

    public void setProfessorRating(int ProfessorRating) {
        this.ProfessorRating = ProfessorRating;
    }
    
    
    
}
