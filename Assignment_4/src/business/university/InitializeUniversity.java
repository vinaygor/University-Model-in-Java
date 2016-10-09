/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.university;

import business.Student.Student;
import business.college.College;
import business.college.InitializeCollege;
import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class InitializeUniversity {
    
    public static void initializeUniversity()
    {
    
    University u1 = new University();
    u1.setUniversityId("1");
    u1.setUniversityName("NEU");
    u1.getUniversityAddress().setCity("Boston");
    u1.getUniversityAddress().setStreet1("");
    u1.getUniversityAddress().setStreet2("Clearway");
    u1.getUniversityAddress().setState("MA");
    u1.getUniversityAddress().setPinNumber("321324");
    ArrayList<College> c1 =InitializeCollege.initializeCollege();
    for(int i=0;i<c1.size();i++)
        {   College c = c1.get(i);
            u1.getCollegeDirectory().addCollege(c);
            u1.getUniversityStudentDirectory().addUniversityStudent(c);
        }
    
    for(Student s: u1.getUniversityStudentDirectory().getStudentList())
        {
         
            System.out.println("Student Id: "+s.getStudentId());
        }
        
    
    
            
    }
    
}
