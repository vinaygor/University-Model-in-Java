/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.course.CourseOffering;
import java.util.ArrayList;

/**
 *
 * @author vinay
 */
public class Semester {
    private String semesterName;
    private CalenderYear calenderYear;
    private DateInfo dateInfo;
    private ArrayList<CourseOffering> courseOffering;

    public Semester() {
        this.calenderYear = new CalenderYear();
        this.dateInfo = new DateInfo();
        this.courseOffering = new ArrayList<CourseOffering>();
    }

    public CalenderYear getCalenderYear() {
        return calenderYear;
    }

    public void setCalenderYear(CalenderYear calenderYear) {
        this.calenderYear = calenderYear;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    public DateInfo getDateInfo() {
        return dateInfo;
    }

    public void setDateInfo(DateInfo dateInfo) {
        this.dateInfo = dateInfo;
    }

    public ArrayList<CourseOffering> getCourseOffering() {
        return courseOffering;
    }

    public void setCourseOffering(ArrayList<CourseOffering> courseOffering) {
        this.courseOffering = courseOffering;
    }
   
    
}
