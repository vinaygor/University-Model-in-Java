/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.university;

import business.Student.Student;
import business.college.College;
import business.college.CollegeDirectory;
import business.department.Department;
import business.department.DepartmentDirectory;
import java.util.ArrayList;

/**
 *
 * @author vinay
 */
public class UniversityStudentDirectory {
    private ArrayList<Student> studentList;
    private CollegeDirectory collegeDirectory;
    
    
    public UniversityStudentDirectory(CollegeDirectory collegeDirectory){
        this.studentList = new ArrayList<Student>();
        this.collegeDirectory = collegeDirectory;  
    }

    public ArrayList<Student> getStudentList() {
        ArrayList<Student> student = new ArrayList<>();
        for(College college: collegeDirectory.getCollegeList())
        {
            for(Department d : college.getDepartmentDirectory().getDepartmentList())
            {
                for(Student s:d.getDepartmentStudentDirectory().getstudentListDept())
                student.add(s);
                
            }
        }
        return student;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    
    public ArrayList<Student> addUniversityStudent(College college)
    {
        ArrayList<Student> student = new ArrayList<>();
        for(College c : collegeDirectory.getCollegeList())
            {
                for(Student s:c.getCollegeStudentDirectory().getStudentListCollege())
                student.add(s);
                
            } 
        
        return student;
        
    }
    
    
}
