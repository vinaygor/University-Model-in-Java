/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.college.College;
import business.course.Course;
import business.department.Department;
import business.university.InitializeUniversity;
import business.university.University;
import java.util.ArrayList;

/**
 *
 * @author vinay
 */
public class InitializeCity {

    public static void initializeCity() {
        City c = new City();
        c.setCityName("Boston");
        c.setCityStateName("MA");
        
        InitializeUniversity initializeUniversity = new InitializeUniversity();
        ArrayList<University> u = initializeUniversity.initializeUniversity();
        for(int i =0;i<u.size();i++){
           University u1 = u.get(i);
        for(College c1: u1.getCollegeDirectory().getCollegeList())
        {
            
            for(Department d :c1.getDepartmentDirectory().getDepartmentList())
            {
                System.out.println("Department Name :"+d.getDepartmentName());
                System.out.println("Semester Details :"+d.getDepartmentCourseSchedule().getSemester().getSemesterName()+" "+d.getDepartmentCourseSchedule().getCourseOffering().getSemester().getCalenderYear().getYear());
                
                for(int q = 0; q<d.getDepartmentCourseSchedule().getSemester().getCourseOffering().getCourseList().getCourseCatalog().size();q++){
                  Course course = d.getDepartmentCourseSchedule().getSemester().getCourseOffering().getCourseList().getCourseCatalog().get(q);
                    System.out.println("Course Details :"+course.getCourseName() + " "+course.getCourseType());
                }
//                for(Course c2 : d.getDepartmentCourseCatalog().getCourseCatalog())
//                System.out.println(" University Name "+u1.getUniversityName()+" College Name "+c1.getCollegeName()+" Department Name "+d.getDepartmentName() +"|| Course Name "+c2.getCourseName());
//        
            }
        }
//            System.out.println("University 1 Student Count:"+u1.getUniversityStudentDirectory().getStudentList().size());
//            System.out.println(" "+u1.getCollegeDirectory().getCollegeList().size());
//            ArrayList<College> college=u1.getCollegeDirectory().getCollegeList();
            
        }
    }
    
}
