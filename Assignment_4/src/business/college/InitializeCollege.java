/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college;

import business.department.Department;
import business.department.InitializeDepartment;
import java.util.ArrayList;
import javax.naming.directory.InitialDirContext;

/**
 *
 * @author ayush
 */
public class InitializeCollege {
    
    private InitializeDepartment initializeDepartment;
    public InitializeCollege(){
        initializeDepartment = new InitializeDepartment();
    }
    public ArrayList<College> initializeCollege(String universityId)
    {
    
    
    int id = Integer.parseInt(universityId);
    switch(id){
        case 1:
            ArrayList<College> collegeList = new ArrayList<College>();
    College c1 = new College();
    c1.setCollegeId("1");
    c1.setCollegeName("BUS");
    c1.getCollegeAddress().setCity("Boston");
    c1.getCollegeAddress().setStreet1("qwer");
    c1.getCollegeAddress().setStreet2("dsdsd");
    c1.getCollegeAddress().setState("MA");
    c1.getCollegeAddress().setPinNumber("123456");
    ArrayList<Department> d1= initializeDepartment.initializeDepartment("1");
    for(int i=0;i<d1.size();i++)
        {   Department d = d1.get(i);
            c1.getDepartmentDirectory().addDepartment(d);
            c1.getCollegeStudentDirectory().addCollegeStudent(d);
        }
            
    collegeList.add(c1);
    
    
    College c2 = new College();
    c2.setCollegeId("2");
    c2.setCollegeName("COE");
    c2.getCollegeAddress().setCity("Boston");
    c2.getCollegeAddress().setStreet1("qwer");
    c2.getCollegeAddress().setStreet2("dsdsd");
    c2.getCollegeAddress().setState("MA");
    c2.getCollegeAddress().setPinNumber("123456");
    ArrayList<Department> d2= initializeDepartment.initializeDepartment("2");
    for(int i=0;i<d2.size();i++)
        {   Department d = d2.get(i);
            c2.getDepartmentDirectory().addDepartment(d);
            c2.getCollegeStudentDirectory().addCollegeStudent(d);
   
        }
    collegeList.add(c2);
    
    College c3 = new College();
    c3.setCollegeId("3");
    c3.setCollegeName("ELECTRICAL");
    c3.getCollegeAddress().setCity("Boston");
    c3.getCollegeAddress().setStreet1("qwer");
    c3.getCollegeAddress().setStreet2("dsdsd");
    c3.getCollegeAddress().setState("MA");
    c3.getCollegeAddress().setPinNumber("654321");
    ArrayList<Department> d3= initializeDepartment.initializeDepartment("1");
    for(int i=0;i<d3.size();i++)
        {   Department d = d3.get(i);
            c3.getDepartmentDirectory().addDepartment(d);
            c3.getCollegeStudentDirectory().addCollegeStudent(d);
        }
    collegeList.add(c3);
    
    return collegeList;
    
    
        case 2:
            ArrayList<College> collegeList2 = new ArrayList<College>();
           
    College c4 = new College();
    c4.setCollegeId("4");
    c4.setCollegeName("PPPP");
    c4.getCollegeAddress().setCity("Boston");
    c4.getCollegeAddress().setStreet1("123");
    c4.getCollegeAddress().setStreet2("dadsad23sd");
    c4.getCollegeAddress().setState("MA");
    c4.getCollegeAddress().setPinNumber("120000");
    ArrayList<Department> d4= initializeDepartment.initializeDepartment("2");
    for(int i=0;i<d4.size();i++)
        {   Department d = d4.get(i);
            c4.getDepartmentDirectory().addDepartment(d);
            c4.getCollegeStudentDirectory().addCollegeStudent(d);
   
        }
    collegeList2.add(c4);
    
    College c5 = new College();
    c5.setCollegeId("5");
    c5.setCollegeName("MECH");
    c5.getCollegeAddress().setCity("Boston");
    c5.getCollegeAddress().setStreet1("asda");
    c5.getCollegeAddress().setStreet2("ds234");
    c5.getCollegeAddress().setState("MA");
    c5.getCollegeAddress().setPinNumber("7654");
    ArrayList<Department> d5= initializeDepartment.initializeDepartment("2");
    for(int i=0;i<d5.size();i++)
        {   Department d = d5.get(i);
            c5.getDepartmentDirectory().addDepartment(d);
            c5.getCollegeStudentDirectory().addCollegeStudent(d);
        }
    collegeList2.add(c5);
    return collegeList2;
   
    }
    
    return null;
    }
}
