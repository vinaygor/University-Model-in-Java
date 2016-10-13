/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Student;

import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class Alumni {
    
    private String employedStatus;
    private ArrayList<Student> alumniList;

    public ArrayList<Student> getAlumniList() {
        return alumniList;
    }

    public void setAlumniList(ArrayList<Student> alumniList) {
        this.alumniList = alumniList;
    }

    public Alumni(){
        alumniList = new ArrayList<Student>();
    }
    public String getEmployedStatus() {
        return employedStatus;
        
    }

    public void setEmployedStatus(String employedStatus) {
        this.employedStatus = employedStatus;
    }
    
    
}
