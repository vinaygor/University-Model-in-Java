/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.department;

import business.Student.Student;
import business.college.CollegeStudentDirectory;
import business.university.UniversityStudentDirectory;
import java.util.ArrayList;

/**
 *
 * @author vinay
 */
public class DepartmentStudentDirectory {
     private ArrayList<Student> studentListDept;
    
    public DepartmentStudentDirectory(){
        this.studentListDept = new ArrayList<Student>();   
    }

    public ArrayList<Student> getstudentListDept() {
        return studentListDept;
    }

    public void setstudentListDept(ArrayList<Student> studentListDept) {
        this.studentListDept = studentListDept;
    }
    
    public Student addDepartmentStudent(Student student)
    {
       studentListDept.add(student);
       return student;
       
    }
    
}
