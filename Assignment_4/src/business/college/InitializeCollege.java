/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college;

import business.department.Department;
import business.department.InitializeDepartment;
import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class InitializeCollege {
    public static ArrayList<College> initializeCollege()
    {
    
    ArrayList<College> collegeList = new ArrayList<College>();
    
    College c1 = new College();
    c1.setCollegeId("1");
    c1.setCollegeName("BUS");
    c1.getCollegeAddress().setCity("Boston");
    c1.getCollegeAddress().setStreet1("qwer");
    c1.getCollegeAddress().setStreet2("dsdsd");
    c1.getCollegeAddress().setState("MA");
    c1.getCollegeAddress().setPinNumber("123456");
    ArrayList<Department> d1= InitializeDepartment.initializeDepartment();
    for(int i=0;i<d1.size();i++)
        {   Department d = d1.get(i);
            c1.getDepartmentDirectory().addDepartment(d);
            c1.getCollegeStudentDirectory().addCollegeStudent(d);
        }
    collegeList.add(c1);
    
    
    College c2 = new College();
    c2.setCollegeId("1");
    c2.setCollegeName("COE");
    c2.getCollegeAddress().setCity("Boston");
    c2.getCollegeAddress().setStreet1("qwer");
    c2.getCollegeAddress().setStreet2("dsdsd");
    c2.getCollegeAddress().setState("MA");
    c2.getCollegeAddress().setPinNumber("123456");
    ArrayList<Department> d2= InitializeDepartment.initializeDepartment();
    for(int i=0;i<d2.size();i++)
        {   Department d = d2.get(i);
            c2.getDepartmentDirectory().addDepartment(d);
            c2.getCollegeStudentDirectory().addCollegeStudent(d);
   
        }
    collegeList.add(c2);
    
    
    
    return collegeList;
    }
}
