/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Student;

import business.college.Transcript;
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
        AlumniDirectory alumniDirectory = new AlumniDirectory();
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
        

        studentList.add(student);
        
        Student student5 = new Student();
        student5.getStudentData().setFirstName("Vinay");
        student5.getStudentData().setLastName("Gor");
        student5.getStudentData().setPersonID("123");
        student5.getStudentData().setGender("Male");
        student5.getStudentData().setDateOfBirth("123");
        student5.getStudentData().getAddress().setCity("Boston");
        student5.getStudentData().getAddress().setStreet1("Saint Germain");
        student5.getStudentData().getAddress().setStreet2("Clearway");
        student5.getStudentData().getAddress().setState("MA");
        student5.getStudentData().getAddress().setPinNumber("321324");
        student5.setStudentId(valueOf(count1++));
        student5.setIsGraduated("No");
        student5.setEmailAddress("vinaugor@gmail.com");
        
        student5.setAdmissionYear(2014);
        student5.setSemesterName("Fall");
        student5.setDepartmentId(deptId);
        student5.setTranscript(transcript);
        
        if(student5.getIsGraduated().equals("Yes")){
            //Alumni a = new Alumni();
            //a.setAlumn(student5);
        }
        studentList.add(student5);
        
        Student student6 = new Student();
        student6.getStudentData().setFirstName("Vinay");
        student6.getStudentData().setLastName("Gor");
        student6.getStudentData().setPersonID("123");
        student6.getStudentData().setGender("Male");
        student6.getStudentData().setDateOfBirth("123");
        student6.getStudentData().getAddress().setCity("Boston");
        student6.getStudentData().getAddress().setStreet1("Saint Germain");
        student6.getStudentData().getAddress().setStreet2("Clearway");
        student6.getStudentData().getAddress().setState("MA");
        student6.getStudentData().getAddress().setPinNumber("321324");
        student6.setStudentId(valueOf(count1++));
        student6.setIsGraduated("No");
        student6.setEmailAddress("vinaugor@gmail.com");
        
        student6.setAdmissionYear(2014);
        student6.setSemesterName("Fall");
        student6.setDepartmentId(deptId);
        student6.setTranscript(transcript);
        
        
        studentList.add(student6);
        
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
        student1.setIsGraduated("Yes");
        student1.setEmailAddress("vinaugor@gmail.com");
        
        student1.setGraduationYear(2014);
        student1.setAdmissionYear(2014);
        student1.setSemesterName("Spring");
        student1.setDepartmentId(deptId);
        student1.setTranscript(transcript);
        student1.setEmployedStatus("Yes");
        student1.setYearsOfExperience(2);
        student1.setJobLevel(2);
        if(student1.getIsGraduated().equals("Yes")){
        Alumni alumni1 = new Alumni();
        alumni1.setJobLevel("1");
        //alumni1.setEmployedStatus("Yes");
        //alumni1.setYearsOfExperience(2016-(student1.getGraduationYear()));
        alumniDirectory.addAlumni(alumni);
        studentList.add(student1);
        //alumni1.setUniversityId("2");
        }
        
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
        student4.setGraduationYear(2015);
        student4.setEmailAddress("vinaugor@gmail.com");
        
        student4.setAdmissionYear(2012);
        student4.setSemesterName("Fall");
        student4.setDepartmentId(deptId);
        student4.setTranscript(transcript);
        
        if(student4.getIsGraduated().equals("Yes")){
         Alumni a1 = new Alumni();
            //alumni.setAlumni(student4);
        a1.setJobLevel("3");
//        a1.setEmployedStatus("Yes");
      //  a1.setYearsOfExperience(2016-(student4.getGraduationYear()));
         alumniDirectory.addAlumni(alumni);
         //alumni.setUniversityId("2");
        }
        studentList.add(student4);
        
        Student student7 = new Student();
        student7.getStudentData().setFirstName("Vinay");
        student7.getStudentData().setLastName("Gor");
        student7.getStudentData().setPersonID("123");
        student7.getStudentData().setGender("Male");
        student7.getStudentData().setDateOfBirth("123");
        student7.getStudentData().getAddress().setCity("Boston");
        student7.getStudentData().getAddress().setStreet1("Saint Germain");
        student7.getStudentData().getAddress().setStreet2("Clearway");
        student7.getStudentData().getAddress().setState("MA");
        student7.getStudentData().getAddress().setPinNumber("321324");
        student7.setStudentId(valueOf(count1++));
        student7.setIsGraduated("Yes");
        student7.setGraduationYear(2015);
        student7.setEmailAddress("vinaugor@gmail.com");
        student7.setEmployedStatus("Yes");
        student7.setYearsOfExperience(2);
        student7.setJobLevel(1);
        student7.setAdmissionYear(2013);
        student7.setSemesterName("Fall");
        student7.setDepartmentId(deptId);
        student7.setTranscript(transcript);
        studentList.add(student7);
        
        if(student7.getIsGraduated().equals("Yes")){
         Alumni a2 = new Alumni();
            //a2.setAlumni(student7);
        a2.setJobLevel("2");
//        a2.setEmployedStatus("No");
     //   a2.setYearsOfExperience(2016-(student7.getGraduationYear()));
         alumniDirectory.addAlumni(a2);
         //a1.setUniversityId("1");
        }
        Student student8 = new Student();
        student8.getStudentData().setFirstName("Vinay");
        student8.getStudentData().setLastName("Gor");
        student8.getStudentData().setPersonID("123");
        student8.getStudentData().setGender("Male");
        student8.getStudentData().setDateOfBirth("123");
        student8.getStudentData().getAddress().setCity("Boston");
        student8.getStudentData().getAddress().setStreet1("Saint Germain");
        student8.getStudentData().getAddress().setStreet2("Clearway");
        student8.getStudentData().getAddress().setState("MA");
        student8.getStudentData().getAddress().setPinNumber("321324");
        student8.setStudentId(valueOf(count1++));
        student8.setIsGraduated("Yes");
        student8.setGraduationYear(2015);
        student8.setEmailAddress("vinaugor@gmail.com");
        student8.setEmployedStatus("No");
        student8.setYearsOfExperience(2);
        student8.setAdmissionYear(2014);
        student8.setSemesterName("Fall");
        student8.setDepartmentId(deptId);
        student8.setTranscript(transcript);
        student8.setJobLevel(3);

        if(student8.getIsGraduated().equals("Yes")){
                 Alumni a3=new Alumni();
            //a2.setAlumni(student8);
        a3.setJobLevel("1");
//        a3.setEmployedStatus("Yes");
   //     a3.setYearsOfExperience(2016-(student8.getGraduationYear()));
        //a2.setUniversityId("1");
         alumniDirectory.addAlumni(a3);
        }
        studentList.add(student8);
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
