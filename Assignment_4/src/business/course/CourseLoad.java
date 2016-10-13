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
        String c1,c2;
       String g1,g2;
        int courseCount=0;
       
        Map transcriptCourse = new HashMap();
        
        for(int i=0; i<semester.size();i++)
        {
            if(semester.get(i).getSemesterName().equals(admissionSemester))
            {
            ArrayList<CourseOffering> co = semester.get(i).getCourseOffering();
                for(int j =0;j<co.size();j++)
                {
                    System.out.println("Values "+co.get(j).getCourseList());
                if(co.get(j).getCourseList().getDepartmentId().equals(departmentId))
                        {
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
                            }
                            courseCount = courseCount + 2;
                            break;
                        }
                }
            }
        }
        if(courseCount<8)
        {
            for(int i=0; i<semester.size();i++)
        {
            if(semester.get(i).getSemesterName().equals(admissionSemester))
            {
            ArrayList<CourseOffering> co = semester.get(i).getCourseOffering();
                for(int j =0;j<co.size();j++)
                {
                if(co.get(j).getCourseList().getDepartmentId().equals(departmentId))
                        {
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
                            }
                            courseCount = courseCount + 2;
                            break;
                        }
                            courseCount = courseCount + 2;
                            break;
                        }
                }
            }
        }
            
        
        
        
        return transcriptCourse;
    }
    
    

    
}
