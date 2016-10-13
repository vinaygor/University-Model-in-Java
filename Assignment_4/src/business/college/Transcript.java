/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college;

import business.Student.Student;
import business.course.CourseLoad;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author vinay
 */
public class Transcript {
 
    private CourseLoad courseLoad;
    public Transcript(){
     this.courseLoad = new CourseLoad();
    }

    public CourseLoad getCourseLoad() {
        return courseLoad;
    }

    public void setCourseLoad(CourseLoad courseLoad) {
        this.courseLoad = courseLoad;
    }
    
    public void getTranscript(Student student)
    {
           
        double totalgrade=0;
        double totalcourse=0;
        
        Map transcript = this.courseLoad.studentCourseLoad(student.getSemesterName(),student);
        Iterator<Map.Entry> entries = transcript.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry entry = entries.next();
            //System.out.println("Course Id = "+entry.getKey()+ ", Grade = "+entry.getValue());
            totalgrade=Double.parseDouble(entry.getValue().toString()) + totalgrade;
            totalcourse++;
        }
        //System.out.println("Total GPA of the Student is :"+(totalgrade/totalcourse));
       // System.out.println("Transcript Size" +transcript.size());
        
    }
    
    public int getSeatCount(Student s){
        int totalSeatLeft=0;
        int totalCourses = 0;
        for(int i=0;i<this.courseLoad.getSeatAssignment().size();i++){
        Map transcript = this.courseLoad.getSeatAssignment().get(i).getSeatCount();
        Iterator<Map.Entry> entries = transcript.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry entry = entries.next();
            //System.out.println("Course Id = "+entry.getKey()+ ", Grade = "+entry.getValue());
            totalSeatLeft=Integer.parseInt(entry.getValue().toString()) + totalSeatLeft;
            totalCourses++;
        }
        }
        
        
        
        return totalSeatLeft;
    }
    
}
