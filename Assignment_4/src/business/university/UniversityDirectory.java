/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.university;

import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class UniversityDirectory {
    
     private ArrayList<University> universityList;

    public UniversityDirectory() {
        this.universityList = new ArrayList<University>();
    }

    public ArrayList<University> getUniversityList() {
        return universityList;
    }

    public void setUniversityList(ArrayList<University> universityList) {
        this.universityList = universityList;
    }
    
    public University addUniversity()
    {
        University university = new University();
        universityList.add(university);
        return university;
        
    }
}
