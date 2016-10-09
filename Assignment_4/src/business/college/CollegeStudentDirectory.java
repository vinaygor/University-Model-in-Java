/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college;

import business.Student.Student;
import business.department.Department;
import business.department.DepartmentDirectory;
import business.university.UniversityStudentDirectory;
import java.util.ArrayList;

/**
 *
 * @author vinay
 */
public class CollegeStudentDirectory {
    private ArrayList<Student> studentListCollege;
    private DepartmentDirectory departmentDirectory;
    
    public CollegeStudentDirectory(DepartmentDirectory departmentDirectory){
        this.studentListCollege = new ArrayList<Student>();
        this.departmentDirectory = departmentDirectory;
    }

    public ArrayList<Student> getStudentListCollege() {
        ArrayList<Student> student = new ArrayList<>();
        for(Department d : departmentDirectory.getDepartmentList())
            {
                for(Student s:d.getDepartmentStudentDirectory().getstudentListDept())
                student.add(s);
                
            }    
        return student;
        
    }

    public void setStudentListCollege(ArrayList<Student> studentListCollege) {
        this.studentListCollege = studentListCollege;
    }
    
     public ArrayList<Student> addCollegeStudent(Department department)
    {
      
                for(Student s:department.getDepartmentStudentDirectory().getstudentListDept())
                studentListCollege.add(s);
                
      
        return studentListCollege;
        
    }
    
    
    
    
    
    
}
