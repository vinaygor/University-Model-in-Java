/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.department;

/**
 *
 * @author ayush
 */
public class Department {
    
    private String departmentName;
    private String departmentId;
    private Degree degree;
    private DepartmentCourseCatalog departmentCourseCatalog;
    private DepartmentCourseSchedule departmentCourseSchedule;
    private DepartmentStudentDirectory departmentStudentDirectory;
    private JobPosition jobPosition;

    public Department() {
        this.degree = new Degree();
        this.departmentCourseCatalog = new DepartmentCourseCatalog();
        this.departmentCourseSchedule = new DepartmentCourseSchedule();
        this.jobPosition = new JobPosition();
        this.departmentStudentDirectory = new DepartmentStudentDirectory();
    }
    
    

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
    
    
}
