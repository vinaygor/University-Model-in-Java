/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.department;

import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class JobPosition {
    
    private String jobRole;
    private String jobId;
    private ArrayList<Teacher> teacherdirectory ;
    
    public JobPosition()
    {
        this.teacherdirectory = new ArrayList<Teacher>();
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ArrayList<Teacher> getTeacherdirectory() {
        return teacherdirectory;
    }

    public void setTeacherdirectory(ArrayList<Teacher> teacherdirectory) {
        this.teacherdirectory = teacherdirectory;
    }
    
    
    
}
