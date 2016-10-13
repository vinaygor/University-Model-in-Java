/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Student;

/**
 *
 * @author ayush
 */
public class Alumni {
    
    private String employedStatus;
    private int yearsOfExperience;
    private String jobLevel;

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    
    private Student alumni;

    public Student getAlumni() {
        return alumni;
    }

    public void setAlumni(Student alumni) {
        this.alumni = alumni;
    }
    

  
    public Alumni(){
        alumni = new Student();
    }
    public String getEmployedStatus() {
        return employedStatus;
        
    }

    public void setEmployedStatus(String employedStatus) {
        this.employedStatus = employedStatus;
    }
    
    
}
