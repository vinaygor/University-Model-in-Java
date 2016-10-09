/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Student;

import business.college.Transcript;
import business.userdata.Person;

/**
 *
 * @author ayush
 */
public class Student {
    
    private String studentId;
    private String emailAddress;
    private String isGraduated;
    private Person studentData;
    private StudentAccount studentAccount;
    private Transcript transcript;
    
    public Student ()
    {
        this.studentData = new Person();
       // this.studentAccount = new StudentAccount();
       // this.transcript = new Transcript();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getIsGraduated() {
        return isGraduated;
    }

    public void setIsGraduated(String isGraduated) {
        this.isGraduated = isGraduated;
    }

    public Person getStudentData() {
        return studentData;
    }

    public void setStudentData(Person studentData) {
        this.studentData = studentData;
    }

    public StudentAccount getStudentAccount() {
        return studentAccount;
    }

    public void setStudentAccount(StudentAccount studentAccount) {
        this.studentAccount = studentAccount;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }
    
      
}
