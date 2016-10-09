/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college;

import business.department.DepartmentDirectory;
import business.userdata.Address;

/**
 *
 * @author ayush
 */
public class College {
    
    private String collegeName;
    private String collegeId;
    private Address collegeAddress;
    private DepartmentDirectory departmentDirectory;
    private CollegeStudentDirectory collegeStudentDirectory;

    public College() {
        this.collegeAddress = new Address();
        this.departmentDirectory = new DepartmentDirectory(departmentDirectory);
        this.collegeStudentDirectory = new CollegeStudentDirectory(departmentDirectory);
    }
    
    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    public Address getCollegeAddress() {
        return collegeAddress;
    }

    public void setCollegeAddress(Address collegeAddress) {
        this.collegeAddress = collegeAddress;
    }

    public DepartmentDirectory getDepartmentDirectory() {
        return departmentDirectory;
    }

    public void setDepartmentDirectory(DepartmentDirectory departmentDirectory) {
        this.departmentDirectory = departmentDirectory;
    }

    public CollegeStudentDirectory getCollegeStudentDirectory() {
        return collegeStudentDirectory;
    }

    public void setCollegeStudentDirectory(CollegeStudentDirectory collegeStudentDirectory) {
        this.collegeStudentDirectory = collegeStudentDirectory;
    }
    
    
    
}
