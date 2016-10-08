/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.department;

import business.course.Course;

/**
 *
 * @author ayush
 */
public class Degree {
    
    private String degreeName;
    private String degreeYear;
    private String degreeeAffiliatedBy;
    private Course course;

    public Degree() {
        this.course = new Course();
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getDegreeYear() {
        return degreeYear;
    }

    public void setDegreeYear(String degreeYear) {
        this.degreeYear = degreeYear;
    }

    public String getDegreeeAffiliatedBy() {
        return degreeeAffiliatedBy;
    }

    public void setDegreeeAffiliatedBy(String degreeeAffiliatedBy) {
        this.degreeeAffiliatedBy = degreeeAffiliatedBy;
    }
    
    
    
    
}
