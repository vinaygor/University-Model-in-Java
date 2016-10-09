/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Student;

import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class EmployedStudentDirectory {
    
    private ArrayList<EmployedStudent> employedStudentList;
    
    public EmployedStudentDirectory()
    {
        this.employedStudentList = new ArrayList<EmployedStudent>();
    }
    
    public EmployedStudent addEmployedStudent()
    {
        EmployedStudent employedStudent = new EmployedStudent();
        employedStudentList.add(employedStudent);
        return employedStudent;
    }
    
}
