/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.course;

import java.util.HashMap;
import java.util.Iterator;
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

    public Map getSeatCount() {
        return seatCount;
    }

//    public void setSeatCount(Map seatCount) {
//        this.seatCount = seatCount;
//    }
   

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

    public void setSeatAssignment(String courseId, int count) {
        seatCount.put(courseId,count);
        //System.out.println(""+courseId);
        if(Integer.parseInt(courseId)%3==1)
        seatAssignment.put(courseId, "3.6");
        else if(Integer.parseInt(courseId)%3==2)
        seatAssignment.put(courseId, "3.7");   
        else
            seatAssignment.put(courseId, "3.3");
        
        
    }
   
    public void printSeat(){
     
//        Map transcript = seatCount;
//        Iterator<Map.Entry> entries = transcript.entrySet().iterator();
//        while(entries.hasNext()){
//            Map.Entry entry = entries.next();
//            System.out.println("Course Id = "+entry.getKey()+ ", Seats left = "+entry.getValue());
//            
        }
    }
    
    

