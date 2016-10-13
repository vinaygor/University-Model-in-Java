/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college;

import business.Student.Student;
import business.course.CourseLoad;
import java.util.ArrayList;
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
           
        
        Map transcript = this.courseLoad.studentCourseLoad(student.getSemesterName(),student);
        System.out.println("Transcript Size" +transcript.size());
        
    }
    
}
