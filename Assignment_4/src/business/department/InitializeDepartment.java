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
    
    public static ArrayList<Department> initializeDepartment()
    {
        ArrayList<Department> department = new ArrayList<Department>();
        Department d1 = new Department();
        d1.setDepartmentName("IS");
        d1.setDepartmentId("3213213");
        ArrayList<Student> s = InitializeStudent.intializeStudentDetails();
        for(int i=0;i<s.size();i++)
        {   Student s1 = s.get(i);
            d1.getDepartmentStudentDirectory().addDepartmentStudent(s1);
        }
        department.add(d1);
        
         Department d2 = new Department();
        d2.setDepartmentName("EM");
        d2.setDepartmentId("52132");
        ArrayList<Student> s2 = InitializeStudent.intializeStudentDetails();
        for(int i=0;i<s2.size();i++)
        {   Student s1 = s.get(i);
            d1.getDepartmentStudentDirectory().addDepartmentStudent(s1);
        }
        department.add(d2);
        
        return department;
        
     }
    
}
