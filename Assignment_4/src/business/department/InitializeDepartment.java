/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.department;

import business.Student.InitializeStudent;
import business.Student.Student;
import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class InitializeDepartment {
    private InitializeStudent initializeStudent;
    public InitializeDepartment(){
        initializeStudent = new InitializeStudent();
    }
    public ArrayList<Department> initializeDepartment(String collegeId)
    {
        int id = Integer.parseInt(collegeId);
        switch(id)
        {
            case 1:
        ArrayList<Department> department = new ArrayList<Department>();
        Department d1 = new Department();
        d1.setDepartmentName("IS");
        d1.setDepartmentId("1");
        ArrayList<Student> s = initializeStudent.intializeStudentDetails();
        for(int i=0;i<s.size();i++)
        {   Student s1 = s.get(i);
            d1.getDepartmentStudentDirectory().addDepartmentStudent(s1);
        }
        department.add(d1);
        
         Department d2 = new Department();
        d2.setDepartmentName("EM");
        d2.setDepartmentId("2");
        ArrayList<Student> s2 = initializeStudent.intializeStudentDetails();
        for(int i=0;i<s2.size();i++)
        {   Student s1 = s.get(i);
            d2.getDepartmentStudentDirectory().addDepartmentStudent(s1);
        }
        department.add(d2);
        
        return department;
        
        case 2:
        ArrayList<Department> department2 = new ArrayList<Department>();
        Department d3 = new Department();
        d3.setDepartmentName("IS");
        d3.setDepartmentId("3");
        ArrayList<Student> s3 = initializeStudent.intializeStudentDetails();
        for(int i=0;i<s3.size();i++)
        {   Student s1 = s3.get(i);
            d3.getDepartmentStudentDirectory().addDepartmentStudent(s1);
        }
        department2.add(d3);
        
         Department d4 = new Department();
        d4.setDepartmentName("EM");
        d4.setDepartmentId("4");
        ArrayList<Student> s4 = initializeStudent.intializeStudentDetails();
        for(int i=0;i<s4.size();i++)
        {   Student s1 = s4.get(i);
            d4.getDepartmentStudentDirectory().addDepartmentStudent(s1);
        }
        department2.add(d4);
        
        Department d5 = new Department();
        d5.setDepartmentName("TSM");
        d5.setDepartmentId("5");
        ArrayList<Student> s5 = initializeStudent.intializeStudentDetails();
        for(int i=0;i<s5.size();i++)
        {   Student s1 = s5.get(i);
            d5.getDepartmentStudentDirectory().addDepartmentStudent(s1);
        }
        department2.add(d5);
        
        return department2;
    
    }
        
        return null;
        
     }
    
}
