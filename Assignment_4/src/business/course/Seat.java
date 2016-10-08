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
public class Seat {
    
    private String totalString;
    private String availableNoOfSeats;
    private String unAvailableNoOfSeats;

    public String getTotalString() {
        return totalString;
    }

    public void setTotalString(String totalString) {
        this.totalString = totalString;
    }

    public String getAvailableNoOfSeats() {
        return availableNoOfSeats;
    }

    public void setAvailableNoOfSeats(String availableNoOfSeats) {
        this.availableNoOfSeats = availableNoOfSeats;
    }

    public String getUnAvailableNoOfSeats() {
        return unAvailableNoOfSeats;
    }

    public void setUnAvailableNoOfSeats(String unAvailableNoOfSeats) {
        this.unAvailableNoOfSeats = unAvailableNoOfSeats;
    }
    
    
}
