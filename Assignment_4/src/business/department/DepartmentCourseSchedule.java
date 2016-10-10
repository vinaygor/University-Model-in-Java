/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.department;

import business.Semester;
import business.course.CourseOffering;

/**
 *
 * @author vinay
 */
public class DepartmentCourseSchedule {
    private CourseOffering courseOffering;
    private Semester semester;
    
    public DepartmentCourseSchedule(){
        this.courseOffering = new CourseOffering();
        this.semester = new Semester();
    }

    public CourseOffering getCourseOffering() {
        return courseOffering;
    }

    public void setCourseOffering(CourseOffering courseOffering) {
        this.courseOffering = courseOffering;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }
    
    
}
