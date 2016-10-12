/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.course;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vinay
 */
public class SeatAssignment {
   Map seatAssignment = new HashMap();
   private Seat seat;
   private String gpa;
   Map seatCount = new HashMap();

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }
   
    public Map getSeatAssignment() {
        return seatAssignment;
    }

    public void setSeatAssignment(int courseId, int count) {
        if(courseId%2==0)
        seatAssignment.put(courseId, "3.6");
        else
        seatAssignment.put(courseId, "3.7");    
        
        seatCount.put(courseId,count);
    }
   
    public void getCourseId(Seat seat){
     
    }
    
    
}
