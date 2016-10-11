/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.college.College;
import business.course.Course;
import business.course.CourseOffering;
import business.department.Department;
import business.department.DepartmentCourseCatalog;
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
//        for(int i =0;i<u.size();i++){
//           University u1 = u.get(i);
//           System.out.println("University Name :"+u1.getUniversityName());
//        for(College c1: u1.getCollegeDirectory().getCollegeList())
//        {
//            System.out.println("College Name :"+c1.getCollegeName());
//            for(Department d :c1.getDepartmentDirectory().getDepartmentList())
//            {
//                System.out.println("Department Name :"+d.getDepartmentName());
//                
//               // System.out.println("Department semester size "+d.getDepartmentCourseSchedule().getSemester().getCourseOffering().size());
//                for(int z=0;z<d.getDepartmentCourseSchedule().getSemester().size();z++)    
//                {  
//                    
//                    System.out.println("Semester Details :"+d.getDepartmentCourseSchedule().getSemester().get(z).getSemesterName()+" "
//                            +d.getDepartmentCourseSchedule().getSemester().get(z).getCalenderYear().getYear());
//                for(int q = 0; q<d.getDepartmentCourseSchedule().getSemester().get(z).getCourseOffering().size();q++){
//                    
//                    //System.out.println(" Course offering size" +d.getDepartmentCourseSchedule().getSemester().get(z).getCourseOffering().get(q).getCourseList().getCourseCatalog().size());
//                   ArrayList<Course>  dc = d.getDepartmentCourseSchedule().getSemester().get(z).getCourseOffering().get(q).getCourseList().getCourseCatalog();
////                    for(int w=0;w<d.getDepartmentCourseSchedule().getSemester().)
//                   for(int r=0; r<dc.size();r++)
//                    {
//                  Course course = dc.get(r);
//                   // System.out.println("Course Details :"+course.getCourseName() + " "+course.getCourseType());
//                }
//                }
////                for(Course c2 : d.getDepartmentCourseCatalog().getCourseCatalog())
////                System.out.println(" University Name "+u1.getUniversityName()+" College Name "+c1.getCollegeName()+" Department Name "+d.getDepartmentName() +"|| Course Name "+c2.getCourseName());
////        
//                }
//                }
//            System.out.println("----------------------------------");
//        }
//            System.out.println("**********************************");
////            System.out.println("University 1 Student Count:"+u1.getUniversityStudentDirectory().getStudentList().size());
////            System.out.println(" "+u1.getCollegeDirectory().getCollegeList().size());
////            ArrayList<College> college=u1.getCollegeDirectory().getCollegeList();
//            
//        }
//    
    
}
}
