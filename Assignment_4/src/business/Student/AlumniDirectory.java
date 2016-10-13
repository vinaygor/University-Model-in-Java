/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Student;

import business.university.University;
import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class AlumniDirectory {
    
    private ArrayList<Alumni> alumniList;
    
    public AlumniDirectory()
    {
        this.alumniList = new ArrayList<Alumni>();
    }
    
    public Alumni addAlumni(Alumni a)
    {
        
        alumniList.add(a);
        return a;
        
    }

    public ArrayList<Alumni> getAlumniList() {
        return alumniList;
    }

    public void setAlumniList(ArrayList<Alumni> alumniList) {
        this.alumniList = alumniList;
    }
    
    
    
}
