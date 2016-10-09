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
    private InitializeCollege initializeCollege;
    
    public InitializeUniversity(){
        initializeCollege = new InitializeCollege();
    }
    public ArrayList<University> initializeUniversity()
    {
    ArrayList<University> universityList = new ArrayList<University>();
    
    University u1 = new University();
    u1.setUniversityId("1");
    u1.setUniversityName("NEU");
    u1.getUniversityAddress().setCity("Boston");
    u1.getUniversityAddress().setStreet1("");
    u1.getUniversityAddress().setStreet2("Clearway");
    u1.getUniversityAddress().setState("MA");
    u1.getUniversityAddress().setPinNumber("321324");
    ArrayList<College> c1 =initializeCollege.initializeCollege(u1.getUniversityId());
    for(int i=0;i<c1.size();i++)
        {   College c = c1.get(i);
            u1.getCollegeDirectory().addCollege(c);
            u1.getUniversityStudentDirectory().addUniversityStudent(c);
        }
    universityList.add(u1);
    
    University u2 = new University();
    u2.setUniversityId("2");
    u2.setUniversityName("Boston University");
    u2.getUniversityAddress().setCity("Boston");
    u2.getUniversityAddress().setStreet1("");
    u2.getUniversityAddress().setStreet2("Mass AVE");
    u2.getUniversityAddress().setState("MA");
    u2.getUniversityAddress().setPinNumber("111002");
    ArrayList<College> c2 =initializeCollege.initializeCollege(u2.getUniversityId());
    for(int i=0;i<c2.size();i++)
        {   College c = c2.get(i);
            u2.getCollegeDirectory().addCollege(c);
            u2.getUniversityStudentDirectory().addUniversityStudent(c);
        }
    
    universityList.add(u2);
    
    return universityList;        
    }
    
}
