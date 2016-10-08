/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.course.CourseOffering;

/**
 *
 * @author vinay
 */
public class Semester {
    private String semesterName;
    private CalenderYear calenderYear;
    private DateInfo dateInfo;
    private CourseOffering courseOffering;

    public Semester() {
        this.calenderYear = new CalenderYear();
        this.dateInfo = new DateInfo();
        this.courseOffering = new CourseOffering();
    }

    public CalenderYear getCalenderYear() {
        return calenderYear;
    }

    public void setCalenderYear(CalenderYear calenderYear) {
        this.calenderYear = calenderYear;
    }
    
    
    
}
