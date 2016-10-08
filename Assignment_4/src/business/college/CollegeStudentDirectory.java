/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college;

import business.Student.Student;
import java.util.ArrayList;

/**
 *
 * @author vinay
 */
public class CollegeStudentDirectory {
    private ArrayList<Student> studentListCollege;
    
    public CollegeStudentDirectory(){
        this.studentListCollege = new ArrayList<Student>();
        
    }

    public ArrayList<Student> getStudentListCollege() {
        return studentListCollege;
    }

    public void setStudentListCollege(ArrayList<Student> studentListCollege) {
        this.studentListCollege = studentListCollege;
    }
    
}
