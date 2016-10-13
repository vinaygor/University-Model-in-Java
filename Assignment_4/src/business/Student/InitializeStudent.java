/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Student;

import static java.lang.String.valueOf;
import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class InitializeStudent {
    
    public static int count1=1;
    
    public ArrayList<Student> intializeStudentDetails(String deptId)
    {
        //UniversityStudentDirectory universityStudentDirectory = new UniversityStudentDirectory();
        
        ArrayList<Student> studentList = new ArrayList<Student>();
        Student student = new Student();
        student.getStudentData().setFirstName("Vinay");
        student.getStudentData().setLastName("Gor");
        student.getStudentData().setPersonID("123");
        student.getStudentData().setGender("Male");
        student.getStudentData().setDateOfBirth("123");
        student.getStudentData().getAddress().setCity("Boston");
        student.getStudentData().getAddress().setStreet1("Saint Germain");
        student.getStudentData().getAddress().setStreet2("Clearway");
        student.getStudentData().getAddress().setState("MA");
        student.getStudentData().getAddress().setPinNumber("321324");
        student.setStudentId(valueOf(count1++));
        student.setIsGraduated("No");
        student.setEmailAddress("vinaugor@gmail.com");
        student.setAdmissionYear(2014);
        student.setSemesterName("Fall");
        student.setDepartmentId(deptId);
        
        
        studentList.add(student);
        
        
        Student student1 = new Student();
        student1.getStudentData().setFirstName("Vinay");
        student1.getStudentData().setLastName("Gor");
        student1.getStudentData().setPersonID("123");
        student1.getStudentData().setGender("Male");
        student1.getStudentData().setDateOfBirth("123");
        student1.getStudentData().getAddress().setCity("Boston");
        student1.getStudentData().getAddress().setStreet1("Saint Germain");
        student1.getStudentData().getAddress().setStreet2("Clearway");
        student1.getStudentData().getAddress().setState("MA");
        student1.getStudentData().getAddress().setPinNumber("321324");
        student1.setStudentId(valueOf(count1++));
        student1.setIsGraduated("No");
        student1.setEmailAddress("vinaugor@gmail.com");
        
        student.setAdmissionYear(2014);
        student.setSemesterName("Spring");
        student.setDepartmentId(deptId);
        
        studentList.add(student1);
        
            return studentList;
//        DepartmentStudentDirectory departmentStudentDirectory = new DepartmentStudentDirectory();
//        departmentStudentDirectory.addDepartmentStudent(student);
//        
//        CollegeStudentDirectory collegeStudentDirectory = new CollegeStudentDirectory();
//        collegeStudentDirectory.addCollegeStudent(student1);
//        
//        
//        
//        for(Student s: universityStudentDirectory.getStudentList())
//        {
//            System.out.println(s.getStudentId());
//        }
        
    }
    
}
