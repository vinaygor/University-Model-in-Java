/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Student;

import business.college.Transcript;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import static java.lang.String.valueOf;

/**
 *
 * @author ayush
 */
public class InitializeStudent {
    
    public static int count1=1;
    
    public ArrayList<Student> intializeStudentDetails(String deptId,Transcript transcript,int number)
    {
        //UniversityStudentDirectory universityStudentDirectory = new UniversityStudentDirectory();
        Alumni alumni = new Alumni();
        ArrayList<Student> studentList = new ArrayList<Student>();
        switch(number){
            
            case 1:
        
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
        student.setTranscript(transcript);
        
        if(student.getIsGraduated().equals("Yes"))
            alumni.getAlumniList().add(student);
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
        
        student1.setAdmissionYear(2014);
        student1.setSemesterName("Spring");
        student1.setDepartmentId(deptId);
        student1.setTranscript(transcript);
        
        if(student1.getIsGraduated().equals("Yes"))
            alumni.getAlumniList().add(student1);
        studentList.add(student1);
        break;
            case 2:
        Student student2 = new Student();
        student2.getStudentData().setFirstName("Vinay");
        student2.getStudentData().setLastName("Gor");
        student2.getStudentData().setPersonID("123");
        student2.getStudentData().setGender("Male");
        student2.getStudentData().setDateOfBirth("123");
        student2.getStudentData().getAddress().setCity("Boston");
        student2.getStudentData().getAddress().setStreet1("Saint Germain");
        student2.getStudentData().getAddress().setStreet2("Clearway");
        student2.getStudentData().getAddress().setState("MA");
        student2.getStudentData().getAddress().setPinNumber("321324");
        student2.setStudentId(valueOf(count1++));
        student2.setIsGraduated("No");
        student2.setEmailAddress("vinaugor@gmail.com");
       
        student2.setAdmissionYear(2014);
        student2.setSemesterName("Spring");
        student2.setDepartmentId(deptId);
        student2.setTranscript(transcript);
        
        if(student2.getIsGraduated().equals("Yes"))
            alumni.getAlumniList().add(student2);
        studentList.add(student2);
        
        
        Student student4 = new Student();
        student4.getStudentData().setFirstName("Vinay");
        student4.getStudentData().setLastName("Gor");
        student4.getStudentData().setPersonID("123");
        student4.getStudentData().setGender("Male");
        student4.getStudentData().setDateOfBirth("123");
        student4.getStudentData().getAddress().setCity("Boston");
        student4.getStudentData().getAddress().setStreet1("Saint Germain");
        student4.getStudentData().getAddress().setStreet2("Clearway");
        student4.getStudentData().getAddress().setState("MA");
        student4.getStudentData().getAddress().setPinNumber("321324");
        student4.setStudentId(valueOf(count1++));
        student4.setIsGraduated("No");
        student4.setEmailAddress("vinaugor@gmail.com");
        
        student4.setAdmissionYear(2014);
        student4.setSemesterName("Spring");
        student4.setDepartmentId(deptId);
        student4.setTranscript(transcript);
        
        if(student4.getIsGraduated().equals("Yes"))
            alumni.getAlumniList().add(student4);
        studentList.add(student4);
        
            
        }
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
