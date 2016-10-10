/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.department;

import business.Student.InitializeStudent;
import business.Student.Student;
import business.course.Course;
import business.course.InitializeCourse;
import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class InitializeDepartment {
    private InitializeStudent initializeStudent;
    private InitializeCourse initializeCourse;
    public InitializeDepartment(){
        initializeStudent = new InitializeStudent();
        initializeCourse = new InitializeCourse();
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
        ArrayList<Course> deptCourseCatalog1 = initializeCourse.initializeCourse(1);
        ArrayList<Student> s = initializeStudent.intializeStudentDetails();
        for(int i=0;i<s.size();i++)
        {   Student s1 = s.get(i);
            d1.getDepartmentStudentDirectory().addDepartmentStudent(s1);
        }
        for(int i=0;i<deptCourseCatalog1.size();i++)
        {   Course course1 = deptCourseCatalog1.get(i);
            d1.getDepartmentCourseCatalog().addCourse(course1);
        }
        department.add(d1);
        initializeCourse.getDepartmentCourseCatalog(d1.getDepartmentCourseCatalog());
        
        Department d2 = new Department();
        d2.setDepartmentName("EM");
        d2.setDepartmentId("2");
        ArrayList<Course> deptCourseCatalog2 = initializeCourse.initializeCourse(2);
        ArrayList<Student> s2 = initializeStudent.intializeStudentDetails();
        for(int i=0;i<s2.size();i++)
        {   Student s1 = s2.get(i);
            d2.getDepartmentStudentDirectory().addDepartmentStudent(s1);
        }
        for(int i=0;i<deptCourseCatalog2.size();i++)
        {   Course course2 = deptCourseCatalog2.get(i);
            d2.getDepartmentCourseCatalog().addCourse(course2);
        }
        department.add(d2);
        initializeCourse.getDepartmentCourseCatalog(d2.getDepartmentCourseCatalog());
        
        return department;
        
        case 2:
        ArrayList<Department> department2 = new ArrayList<Department>();
        Department d3 = new Department();
        d3.setDepartmentName("IS");
        d3.setDepartmentId("3");
        ArrayList<Course> deptCourseCatalog3 = initializeCourse.initializeCourse(2);
        ArrayList<Student> s3 = initializeStudent.intializeStudentDetails();
        for(int i=0;i<s3.size();i++)
        {   Student s1 = s3.get(i);
            d3.getDepartmentStudentDirectory().addDepartmentStudent(s1);
        }
        for(int i=0;i<deptCourseCatalog3.size();i++)
        {   Course course2 = deptCourseCatalog3.get(i);
            d3.getDepartmentCourseCatalog().addCourse(course2);
        }
        department2.add(d3);
        initializeCourse.getDepartmentCourseCatalog(d3.getDepartmentCourseCatalog());
        
        Department d4 = new Department();
        d4.setDepartmentName("EM");
        d4.setDepartmentId("4");
        ArrayList<Course> deptCourseCatalog4 = initializeCourse.initializeCourse(2);
        ArrayList<Student> s4 = initializeStudent.intializeStudentDetails();
        for(int i=0;i<s4.size();i++)
        {   Student s1 = s4.get(i);
            d4.getDepartmentStudentDirectory().addDepartmentStudent(s1);
        }
        for(int i=0;i<deptCourseCatalog4.size();i++)
        {   Course course2 = deptCourseCatalog4.get(i);
            d4.getDepartmentCourseCatalog().addCourse(course2);
        }
        department2.add(d4);
        initializeCourse.getDepartmentCourseCatalog(d4.getDepartmentCourseCatalog());
        
        Department d5 = new Department();
        d5.setDepartmentName("TSM");
        d5.setDepartmentId("5");
        ArrayList<Course> deptCourseCatalog5 = initializeCourse.initializeCourse(2);
        ArrayList<Student> s5 = initializeStudent.intializeStudentDetails();
        for(int i=0;i<s5.size();i++)
        {   Student s1 = s5.get(i);
            d5.getDepartmentStudentDirectory().addDepartmentStudent(s1);
        }
        for(int i=0;i<deptCourseCatalog5.size();i++)
        {   Course course2 = deptCourseCatalog5.get(i);
            d5.getDepartmentCourseCatalog().addCourse(course2);
        }
        department2.add(d5);
        initializeCourse.getDepartmentCourseCatalog(d5.getDepartmentCourseCatalog());
        
        return department2;
    
    }
        
        return null;
        
     }
    
        
}
