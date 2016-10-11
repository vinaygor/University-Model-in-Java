/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.department;

import business.Semester;
import business.course.CourseOffering;
import java.util.ArrayList;

/**
 *
 * @author vinay
 */
public class DepartmentCourseSchedule {
    private ArrayList<CourseOffering> courseOffering;
    private ArrayList<Semester> semester;
    
    public DepartmentCourseSchedule(){
        this.courseOffering = new ArrayList<CourseOffering>();
        this.semester = new ArrayList<Semester>();
    }

    public ArrayList<CourseOffering> getCourseOffering() {
        return courseOffering;
    }

    public void setCourseOffering(ArrayList<CourseOffering> courseOffering) {
        this.courseOffering = courseOffering;
    }

    public ArrayList<Semester> getSemester() {
        return semester;
    }

    public void setSemester(ArrayList<Semester> semester) {
        this.semester = semester;
    }


    
    
    
}
