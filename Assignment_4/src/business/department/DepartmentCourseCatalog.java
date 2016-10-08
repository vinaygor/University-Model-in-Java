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

    public DepartmentCourseCatalog() 
    {
        this.courseCatalog = new ArrayList<Course>();
    }
        
}
