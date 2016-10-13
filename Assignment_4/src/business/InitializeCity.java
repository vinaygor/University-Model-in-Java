/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Student.Student;
import business.college.College;
import business.course.Course;
import business.course.CourseOffering;
import business.department.Department;
import business.department.DepartmentCourseCatalog;
import business.university.InitializeUniversity;
import business.university.University;
import java.util.ArrayList;
import java.util.Scanner;

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
        System.out.println("Welcome to Boston City University System");
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("**********************************************");
            System.out.println("1. City Level Details");
            System.out.println("2. University Level Details");
            System.out.println("3. College Level Details");
            System.out.println("4. Department Level Details");
            System.out.println("5. Alumni Performance Report");
            System.out.println("6. Exit");
            System.out.println("Enter the choice:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                {
                    System.out.println("City Name : "+c.getCityName());
                    for(int i=0;i<u.size();i++)
                    {
                        University u1 = u.get(i);
                        System.out.println("University Name : "+u1.getUniversityName());
                        System.out.println("Total Number of Students in University : " +u1.getUniversityStudentDirectory().getStudentList().size());
                        System.out.println("----------------------------------------------------------");
                    }
                  
                    
                    break;  
                }
                    
                case 2:
                 {
                     for(int i=0;i<u.size();i++)
                    {
                        University u1 = u.get(i);
                        int totalSeatLeft=0;
                        System.out.println("University Name : "+u1.getUniversityName());
                        for(int q=0;q<u1.getUniversityStudentDirectory().getStudentList().size();q++){
                            Student s1 = u1.getUniversityStudentDirectory().getStudentList().get(q);
                            s1.getTranscript().getTranscript(s1);
                            totalSeatLeft = s1.getTranscript().getSeatCount(s1);
                            
                        }
                        System.out.println("Total number of Seats forall Courses : 5400");
                        System.out.println("Total nmber of seats left for all the courses :"+totalSeatLeft);
                        System.out.println("----------------------------------------------------------");
                    }
                     for(int j=0;j<u.size();j++)
                     {
                         University u2 = u.get(j);
                         System.out.println("----------------------------------------------------------");
                         System.out.println("University Name : "+u2.getUniversityName());
                     int facultySize = 0;
                         for(College c1: u2.getCollegeDirectory().getCollegeList())
                        {
            
                         for(Department d :c1.getDepartmentDirectory().getDepartmentList())
                         {
                             
                             facultySize = facultySize + d.getJobPosition().size();
                             
                         }
                        System.out.println("College Name :"+c1.getCollegeName()+"  ------ Faculty Student Ratio (College Level)- "+facultySize+":"+c1.getCollegeStudentDirectory().getStudentListCollege().size());
//                       
                        }
                         
                     
                     
                     }   
                  break;  
                }
                case 3:
                 {
                     for(int j=0;j<u.size();j++)
                     {
                         University u2 = u.get(j);
                         System.out.println("----------------------------------------------------------");
                         System.out.println("University Name : "+u2.getUniversityName());
                   
                         for(College c1: u2.getCollegeDirectory().getCollegeList())
                        {
            
                            System.out.println("Number of Departments in College :"+c1.getCollegeName());
                            System.out.println(" "+c1.getDepartmentDirectory().getDepartmentList().size());
                            System.out.println("Number of Students in College :"+c1.getCollegeName());
                            System.out.println(" "+c1.getCollegeStudentDirectory().getStudentListCollege().size());
                            System.out.println("----------------------------------------------------------");
                        //System.out.println("College Name :"+c1.getCollegeName()+"  ------ Faculty Student Ratio (College Level)- "+facultySize+":"+c1.getCollegeStudentDirectory().getStudentListCollege().size());
//                       
                        }
                     }  
                  break;  
                
                 }
                case 4:
                 {
                     int z=0;
                    for(int j=0;j<u.size();j++)
                     {
                         University u2 = u.get(j);
                         System.out.println("----------------------------------------------------------");
                         System.out.println("Courses offered at each Department : ");
                         System.out.println("University Name : "+u2.getUniversityName());
                         for(College c1: u2.getCollegeDirectory().getCollegeList()) 
                         {
                             System.out.println("College Name : "+c1.getCollegeName());
                             for(Department d :c1.getDepartmentDirectory().getDepartmentList())
                             {
                                 System.out.println("----------------------------------------------------------");
                                 System.out.println("Department Name : "+d.getDepartmentName());
                                 
                                 for(Course course:d.getDepartmentCourseCatalog().getCourseCatalog())
                                 {
                                     System.out.println("Course Name : " +course.getCourseName());
                                 }
                             }
                         }
                     }
                    
                    for(int j=0;j<u.size();j++)
                     {
                         University u2 = u.get(j);
                         //System.out.println("----------------------------------------------------------");
                         //System.out.println("Courses offered at each Department : ");
                         //System.out.println("University Name : "+u2.getUniversityName());
                         for(College c1: u2.getCollegeDirectory().getCollegeList()) 
                         {
                            // System.out.println("College Name : "+c1.getCollegeName());
                             for(Department d :c1.getDepartmentDirectory().getDepartmentList())
                             {
                                 System.out.println("----------------------------------------------------------");
                                 System.out.println("Department Name : "+d.getDepartmentName());
                                 
                                 for(Semester semester:d.getDepartmentCourseSchedule().getSemester())
                                 {
                                     System.out.println("Semester Name : " +semester.getSemesterName());
                                     for(CourseOffering courseOffering:semester.getCourseOffering())
                                     {
                                         
                                         for(Course course :courseOffering.getCourseList().getCourseCatalog())
                                         {
                                             System.out.println("Teacher Name : " +courseOffering.getTeacher().getPerson().getFirstName());
                                                                                                                                                                                                                                                    
                                             
                                        }
//                                         break;
                                        
                                     }
                                 }
                             }
                         }
                     }
                     
                  break;  
                }
                case 5:
                 {
                  break;  
                }
                case 6:
                     {
                  break;  
                }
                default:
                    System.out.println("Please enter valid input");
                    
                                
            }
            
        }
        
//        int count=0;
//        for(int i =0;i<u.size();i++){
//           University u1 = u.get(i);
//          //  System.out.println(" University "+u1.getUniversityName()+" "+u1.getUniversityStudentDirectory().getStudentList().size());
//        
//        //   System.out.println("University Name :"+u1.getUniversityName());
//        for(Student s1: u1.getUniversityStudentDirectory().getStudentList())
//        {
//            s1.getTranscript().getTranscript(s1);
//            break;
//        }
//        for(College c1: u1.getCollegeDirectory().getCollegeList())
//        {
//            //System.out.println("College Name :"+c1.getCollegeName());
//            for(Department d :c1.getDepartmentDirectory().getDepartmentList())
//            {
//                //System.out.println("Department Name :"+d.getDepartmentName());
//                for(int k =0 ;k<d.getDepartmentCourseCatalog().getCourseCatalog().size();k++)
//                {
//                    Course tempc = d.getDepartmentCourseCatalog().getCourseCatalog().get(k);
//                    if(tempc.getCourseName().equals("AED")){
//                        count++;
//                    }
//                  //  System.out.println("Course ID: "+tempc.getCourseId()+" Course Name :"+tempc.getCourseName());
//                }
        
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
//        }
//            
//}}
//      //  System.out.println("Count students of AED : "+count);
//    }
//}
