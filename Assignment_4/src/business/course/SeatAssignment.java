/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.course;

/**
 *
 * @author vinay
 */
public class SeatAssignment {
    private String gpaScore;
    private Seat seat;

    public SeatAssignment() {
        this.seat = new Seat();
    }

    public String getGpaScore() {
        return gpaScore;
    }

    public void setGpaScore(String gpaScore) {
        this.gpaScore = gpaScore;
    }
    
    
}
