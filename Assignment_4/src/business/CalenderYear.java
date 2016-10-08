/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author ayush
 */
public class CalenderYear {
    
    private String year;
    private DateInfo date;

    public CalenderYear() {
        this.date = new DateInfo();
    }
    

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    
}
