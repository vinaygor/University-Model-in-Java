/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.university;

import business.college.CollegeDirectory;
import business.userdata.Address;

/**
 *
 * @author ayush
 */
public class University {
    private String universityName;
    private String universityId;
    private Address universityAddress;
    private CollegeDirectory collegeDirectory;
    private UniversityStudentDirectory universityStudentDirectory;

    public University() {
        this.universityAddress = new Address();
        this.collegeDirectory = new CollegeDirectory();
        this.universityStudentDirectory = new UniversityStudentDirectory(collegeDirectory);
    }
    
    

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public Address getUniversityAddress() {
        return universityAddress;
    }

    public void setUniversityAddress(Address universityAddress) {
        this.universityAddress = universityAddress;
    }

    public CollegeDirectory getCollegeDirectory() {
        return collegeDirectory;
    }

    public void setCollegeDirectory(CollegeDirectory collegeDirectory) {
        this.collegeDirectory = collegeDirectory;
    }

    public UniversityStudentDirectory getUniversityStudentDirectory() {
        return universityStudentDirectory;
    }

    public void setUniversityStudentDirectory(UniversityStudentDirectory universityStudentDirectory) {
        this.universityStudentDirectory = universityStudentDirectory;
    }
    
    
    
}
