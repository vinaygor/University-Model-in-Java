/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.course;

import business.Semester;
import business.department.DepartmentCourseCatalog;

/**
 *
 * @author vinay
 */
public class CourseLoad {
    private DepartmentCourseCatalog courseList;
    private SeatAssignment seatAssignment;
    private Semester semester;
    
    public CourseLoad(){
        this.courseList = new DepartmentCourseCatalog();
        this.seatAssignment = new SeatAssignment();
        this.semester = new Semester();
    }
}
