/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.university;

import business.Student.Student;
import java.util.ArrayList;

/**
 *
 * @author vinay
 */
public class UniversityStudentDirectory {
    private ArrayList<Student> studentList;
    
    public UniversityStudentDirectory(){
        this.studentList = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    
    
}
