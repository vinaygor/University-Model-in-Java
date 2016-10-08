/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.course;

import business.Semester;
import business.college.ClassRoom;
import business.department.DepartmentCourseCatalog;
import business.department.Teacher;
import business.department.TeacherDirectory;
import java.util.ArrayList;

/**
 *
 * @author vinay
 */
public class CourseOffering {
    private Semester semester;
    private  DepartmentCourseCatalog courseList;
    private TeacherDirectory teacherDirectory;
    private Seat seat;
    private ClassRoom classRoom;

    public CourseOffering() {
        this.semester = new Semester();
        this.courseList = new DepartmentCourseCatalog();
        this.teacherDirectory = new TeacherDirectory();
        this.seat = new Seat();
        this.classRoom = new ClassRoom();
    }
    
    
}
