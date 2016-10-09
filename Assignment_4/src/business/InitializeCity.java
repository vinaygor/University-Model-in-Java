/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Student.Student;
import business.college.College;
import business.college.CollegeDirectory;
import business.university.InitializeUniversity;
import business.university.University;
import java.util.ArrayList;

/**
 *
 * @author vinay
 */
public class InitializeCity {

    public static void initializeCity() {
        City c = new City();
        c.setCityName("Boston");
        c.setCityStateName("MA");
        
        InitializeUniversity initializeUniversity = new InitializeUniversity();
        ArrayList<University> u = initializeUniversity.initializeUniversity();
        for(int i =0;i<u.size();i++){
           University u1 = u.get(i);
        for(Student s: u1.getUniversityStudentDirectory().getStudentList())
        {
            
            System.out.println("Student Id: "+s.getStudentId());
        }
            System.out.println("University 1 Student Count:"+u1.getUniversityStudentDirectory().getStudentList().size());
            System.out.println(" "+u1.getCollegeDirectory().getCollegeList().size());
            ArrayList<College> college=u1.getCollegeDirectory().getCollegeList();
            
        }
    }
    
}
