/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.course;

import business.Semester;
import business.Student.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author vinay
 */
public class CourseLoad {
    private ArrayList<SeatAssignment> seatAssignment;
    private ArrayList<Semester> semester;
    
    public CourseLoad(){
        
        this.seatAssignment = new ArrayList<SeatAssignment>();
        this.semester = new ArrayList<Semester>();
    }

    public ArrayList<SeatAssignment> getSeatAssignment() {
        return seatAssignment;
    }

    public void setSeatAssignment(ArrayList<SeatAssignment> seatAssignment) {
        this.seatAssignment = seatAssignment;
    }

    

    public ArrayList<Semester> getSemester() {
        return semester;
    }

    public void setSemester(ArrayList<Semester> semester) {
        this.semester = semester;
    }
    
    public Map studentCourseLoad(String semesterName,Student student)
    {
        String studId = student.getStudentId();
        String admissionSemester = student.getSemesterName();
        int admissionYear = student.getAdmissionYear();
        String departmentId = student.getDepartmentId();
        String c1,c2,c3,c4,c5,c6;
       String g1,g2,g3,g4,g5,g6;
        int courseCount=0;
       
        Map transcriptCourse = new HashMap();
        if(admissionSemester.equals("Spring"))
        {
            do{
        for(int i=0; i<semester.size();i++)
        {           
            
            ArrayList<CourseOffering> co = semester.get(i).getCourseOffering();
                for(int j =0;j<co.size();j++)
                {
                   // System.out.println("Values "+co.get(j).getCourseList());
                if(co.get(j).getCourseList().getDepartmentId().equals(departmentId))
                        {
                            c1 = co.get(j).getCourseList().getCourseCatalog().get(0).getCourseId();
                            c2 = co.get(j).getCourseList().getCourseCatalog().get(1).getCourseId();
                            c3 = co.get(j).getCourseList().getCourseCatalog().get(2).getCourseId();
                            c4 = co.get(j).getCourseList().getCourseCatalog().get(3).getCourseId();
                            c5 = co.get(j).getCourseList().getCourseCatalog().get(4).getCourseId();
                            c6 = co.get(j).getCourseList().getCourseCatalog().get(5).getCourseId();
                            for(int a = 0;a<seatAssignment.size();a++){
                                SeatAssignment sa  = seatAssignment.get(a);
                                
                                if(sa.seatAssignment.containsKey(c1)) 
                                {
                                g1 = sa.seatAssignment.get(c1).toString();
                                int count = Integer.parseInt(sa.seatCount.get(c1).toString());
                                sa.seatCount.put(c1,count-1);
                                
                                transcriptCourse.put(c1, g1);
                                }
                                if (sa.seatAssignment.containsKey(c2))
                                { 
                                g2 = sa.seatAssignment.get(c2).toString();
                                int count1 = Integer.parseInt(sa.seatCount.get(c2).toString());
                                sa.seatCount.put(c2,count1-1);
                                
                                transcriptCourse.put(c2, g2);
                                }
                                
                                if (sa.seatAssignment.containsKey(c3))
                                { 
                                g3 = sa.seatAssignment.get(c3).toString();
                                int count1 = Integer.parseInt(sa.seatCount.get(c3).toString());
                                sa.seatCount.put(c2,count1-1);
                                
                                transcriptCourse.put(c3, g3);
                                }
                                
                                if (sa.seatAssignment.containsKey(c4))
                                { 
                                g4 = sa.seatAssignment.get(c4).toString();
                                int count1 = Integer.parseInt(sa.seatCount.get(c4).toString());
                                sa.seatCount.put(c4,count1-1);
                                
                                transcriptCourse.put(c4, g4);
                                }
                                
                                 if (sa.seatAssignment.containsKey(c5))
                                { 
                                g5 = sa.seatAssignment.get(c5).toString();
                                int count1 = Integer.parseInt(sa.seatCount.get(c5).toString());
                                sa.seatCount.put(c5,count1-1);
                                
                                transcriptCourse.put(c5, g5);
                                }
                                
                                if (sa.seatAssignment.containsKey(c6))
                                { 
                                g6 = sa.seatAssignment.get(c6).toString();
                                int count1 = Integer.parseInt(sa.seatCount.get(c6).toString());
                                sa.seatCount.put(c6,count1-1);
                                
                                transcriptCourse.put(c6, g6);
                                }
                             }
                            courseCount = courseCount + 2;
                            break;
                        }
                
            }
        }
       
            } while(courseCount<8) ;
         }
        else if(admissionSemester.equals("Fall"))
        {
            Semester temp = semester.get(0);
            Semester temp2 = semester.get(1);
            semester.set(0, temp2);
            semester.set(1, temp);
            for(int i=semester.size()-1; i>=0;i--)
        {
            if(semester.get(i).getSemesterName().equals(admissionSemester))
            {
            ArrayList<CourseOffering> co = semester.get(i).getCourseOffering();
                for(int j =0;j<co.size();j++)
                {
                if(co.get(j).getCourseList().getDepartmentId().equals(departmentId))
                        {
                            if(student.getAdmissionYear()==2016){
                            c1 = co.get(j).getCourseList().getCourseCatalog().get(0).getCourseId();
                            c2 = co.get(j).getCourseList().getCourseCatalog().get(1).getCourseId();
                            for(int a = 0;a<seatAssignment.size();a++){
                                SeatAssignment sa  = seatAssignment.get(a);
                                
                                if(sa.seatAssignment.containsKey(c1)) 
                                {
                                g1 = sa.seatAssignment.get(c1).toString();
                                int count = Integer.parseInt(sa.seatCount.get(c1).toString());
                                sa.seatCount.put(c1,count-1);
                                
                                transcriptCourse.put(c1, g1);
                                }
                                if (sa.seatAssignment.containsKey(c2))
                                { 
                                g2 = sa.seatAssignment.get(c2).toString();
                                int count1 = Integer.parseInt(sa.seatCount.get(c2).toString());
                                sa.seatCount.put(c2,count1-1);
                                
                                transcriptCourse.put(c2, g2);
                                }
                                courseCount = courseCount + 2;
                            break;
                                
                        }
                            }
                            else{
                             c1 = co.get(j).getCourseList().getCourseCatalog().get(0).getCourseId();
                            c2 = co.get(j).getCourseList().getCourseCatalog().get(1).getCourseId();    
                            c3 = co.get(j).getCourseList().getCourseCatalog().get(2).getCourseId();
                            c4 = co.get(j).getCourseList().getCourseCatalog().get(3).getCourseId();
                            c5 = co.get(j).getCourseList().getCourseCatalog().get(4).getCourseId();
                            c6 = co.get(j).getCourseList().getCourseCatalog().get(5).getCourseId();
                            
                            for(int a = 0;a<seatAssignment.size();a++){
                                SeatAssignment sa  = seatAssignment.get(a);
                                
                                if(sa.seatAssignment.containsKey(c1)) 
                                {
                                g1 = sa.seatAssignment.get(c1).toString();
                                int count = Integer.parseInt(sa.seatCount.get(c1).toString());
                                sa.seatCount.put(c1,count-1);
                                
                                transcriptCourse.put(c1, g1);
                                }
                                if (sa.seatAssignment.containsKey(c2))
                                { 
                                g2 = sa.seatAssignment.get(c2).toString();
                                int count1 = Integer.parseInt(sa.seatCount.get(c2).toString());
                                sa.seatCount.put(c2,count1-1);
                                
                                transcriptCourse.put(c2, g2);
                                }
                                
                                 if (sa.seatAssignment.containsKey(c3))
                                { 
                                g3 = sa.seatAssignment.get(c3).toString();
                                int count1 = Integer.parseInt(sa.seatCount.get(c3).toString());
                                sa.seatCount.put(c2,count1-1);
                                
                                transcriptCourse.put(c3, g3);
                                }
                                
                                if (sa.seatAssignment.containsKey(c4))
                                { 
                                g4 = sa.seatAssignment.get(c4).toString();
                                int count1 = Integer.parseInt(sa.seatCount.get(c4).toString());
                                sa.seatCount.put(c4,count1-1);
                                
                                transcriptCourse.put(c4, g4);
                                }
                                
                                if (sa.seatAssignment.containsKey(c5))
                                { 
                                g5 = sa.seatAssignment.get(c5).toString();
                                int count1 = Integer.parseInt(sa.seatCount.get(c5).toString());
                                sa.seatCount.put(c5,count1-1);
                                
                                transcriptCourse.put(c5, g5);
                                }
                                
                                if (sa.seatAssignment.containsKey(c6))
                                { 
                                g6 = sa.seatAssignment.get(c6).toString();
                                int count1 = Integer.parseInt(sa.seatCount.get(c6).toString());
                                sa.seatCount.put(c6,count1-1);
                                
                                transcriptCourse.put(c6, g6);
                                }
                                
            
                            }
                            courseCount = courseCount + 2;
                            
                            break;
                        }
                        }    
                        }
                }
            }
        }
            
        
         
        
        
        return transcriptCourse;
    }
    
    

    
}
