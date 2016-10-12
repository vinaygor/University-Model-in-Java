/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.course;

import business.Semester;
import java.util.ArrayList;

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
    
}
