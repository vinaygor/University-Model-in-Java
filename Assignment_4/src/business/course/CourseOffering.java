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
    private DepartmentCourseCatalog courseList;
    private TeacherDirectory teacherDirectory;
    private ClassRoom classRoom;

    public CourseOffering() {
        this.semester = new Semester();
        this.courseList = new DepartmentCourseCatalog();
        this.teacherDirectory = new TeacherDirectory();
        this.classRoom = new ClassRoom();
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public DepartmentCourseCatalog getCourseList() {
        return courseList;
    }

    public void setCourseList(DepartmentCourseCatalog courseList) {
        this.courseList = courseList;
    }

    public TeacherDirectory getTeacherDirectory() {
        return teacherDirectory;
    }

    public void setTeacherDirectory(TeacherDirectory teacherDirectory) {
        this.teacherDirectory = teacherDirectory;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }
    
    
}
