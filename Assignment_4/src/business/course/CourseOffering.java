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
    
    private DepartmentCourseCatalog courseList;
    private Teacher teacher;
    private ClassRoom classRoom;
    private int numberOfSeats;
    private String deptId;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public CourseOffering() {
      //  this.semester = new Semester();
        this.courseList = new DepartmentCourseCatalog();
        this.teacher = new Teacher();
        this.classRoom = new ClassRoom();
        
    }

//    public Semester getSemester() {
//        return semester;
//    }
//
//    public void setSemester(Semester semester) {
//        this.semester = semester;
//    }

    public DepartmentCourseCatalog getCourseList() {
        
        return courseList;
        
    }

    public void setCourseList(DepartmentCourseCatalog courseList) {
        this.courseList = courseList;
        //this.courseList.setDepartmentId(deptId);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    
    
    
    
    
}
