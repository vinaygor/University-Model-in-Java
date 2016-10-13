/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.department;

import business.course.Course;
import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class DepartmentCourseCatalog {
    
    private ArrayList<Course> courseCatalog;
     private String departmentId;
   

    public DepartmentCourseCatalog() 
    {
        this.courseCatalog = new ArrayList<Course>();
    }

    public ArrayList<Course> getCourseCatalog() {
        return courseCatalog;
    }

    public void setCourseCatalog(ArrayList<Course> courseCatalog) {
        this.courseCatalog = courseCatalog;
    }
        
    public Course addCourse(Course c){
        courseCatalog.add(c);
        return c;
    }
    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
   
    
}
