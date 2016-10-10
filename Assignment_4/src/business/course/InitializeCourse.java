/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.course;

import business.InitializeSemester;
import business.Semester;
import business.department.DepartmentCourseCatalog;
import java.util.ArrayList;

/**
 *
 * @author vinay
 */
public class InitializeCourse {
    private InitializeSemester initializeSemester;
    private ArrayList<DepartmentCourseCatalog> departmentCourseCatalog;
    public InitializeCourse(){
        initializeSemester = new InitializeSemester();
    }
    public ArrayList<Course> initializeCourse(int number){
        
        
        switch(number){
            
        case 1:
        ArrayList<Course> courseCatalog1 = new ArrayList<Course>();
        Course course = new Course();
        course.setCourseId("1");
        course.setCourseName("AED");
        course.setCourseType("Mandatory");
        course.setFollowUpCourse("None");
        course.setPrerequisiteCourse("None");
        courseCatalog1.add(course);
        
        Course course1 = new Course();
        course1.setCourseId("2");
        course1.setCourseName("Database");
        course1.setCourseType("Elective");
        course1.setFollowUpCourse("Data Warehousing");
        course1.setPrerequisiteCourse("None");
        courseCatalog1.add(course1);
        
        Course course2 = new Course();
        course2.setCourseId("3");
        course2.setCourseName("Web Design");
        course2.setCourseType("Elective");
        course2.setFollowUpCourse("Web Tools");
        course2.setPrerequisiteCourse("None");
        courseCatalog1.add(course2);
        
        Course course3 = new Course();
        course3.setCourseId("4");
        course3.setCourseName("OOPS");
        course3.setCourseType("Elective");
        course3.setFollowUpCourse("None");
        course3.setPrerequisiteCourse("None");
        courseCatalog1.add(course3);
        
        return courseCatalog1;
        
        case 2:
        ArrayList<Course> courseCatalog2 = new ArrayList<Course>();
        Course course4 = new Course();
        course4.setCourseId("1");
        course4.setCourseName("P.M.");
        course4.setCourseType("Mandatory");
        course4.setFollowUpCourse("None");
        course4.setPrerequisiteCourse("None");
        courseCatalog2.add(course4);
        
        Course course5 = new Course();
        course5.setCourseId("2");
        course5.setCourseName("EDM");
        course5.setCourseType("Elective");
        course5.setFollowUpCourse("None");
        course5.setPrerequisiteCourse("None");
        courseCatalog2.add(course5);
        
        Course course6 = new Course();
        course6.setCourseId("3");
        course6.setCourseName("CO-OP");
        course6.setCourseType("Elective");
        course6.setFollowUpCourse("None");
        course6.setPrerequisiteCourse("None");
        courseCatalog2.add(course6);
        
        Course course7 = new Course();
        course7.setCourseId("4");
        course7.setCourseName("Stats");
        course7.setCourseType("Elective");
        course7.setFollowUpCourse("None");
        course7.setPrerequisiteCourse("None");
        courseCatalog2.add(course7);
        
        
        return courseCatalog2;
        }
        return null;
    }

    public void initializeCourseOffering(){
        ArrayList<CourseOffering> courseOffering = new ArrayList<CourseOffering>();
        ArrayList<Semester> semesterList = initializeSemester.initializeSemester();
        semesterList.get(1).getSemesterName();
    }
    
    public void getDepartmentCourseCatalog(DepartmentCourseCatalog d){
        departmentCourseCatalog.add(d);
    }
}
