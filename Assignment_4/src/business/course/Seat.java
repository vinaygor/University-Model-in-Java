/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.course;

import java.util.ArrayList;

/**
 *
 * @author vinay
 */
public class Seat {
    
    private ArrayList<CourseOffering> courseOffering;
    
    public Seat(){
        courseOffering = new ArrayList<CourseOffering>();
    }

    public ArrayList<CourseOffering> getCourseOffering() {
        return courseOffering;
    }

    public void setCourseOffering(ArrayList<CourseOffering> courseOffering) {
        this.courseOffering = courseOffering;
    }
    
    
    
}
