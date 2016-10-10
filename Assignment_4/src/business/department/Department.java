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
      //  this.degree = new Degree();
        this.departmentCourseCatalog = new DepartmentCourseCatalog();
       this.departmentCourseSchedule = new DepartmentCourseSchedule();
      //  this.jobPosition = new JobPosition();
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

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public DepartmentCourseCatalog getDepartmentCourseCatalog() {
        return departmentCourseCatalog;
    }

    public void setDepartmentCourseCatalog(DepartmentCourseCatalog departmentCourseCatalog) {
        this.departmentCourseCatalog = departmentCourseCatalog;
    }

    public DepartmentStudentDirectory getDepartmentStudentDirectory() {
        return departmentStudentDirectory;
    }

    public void setDepartmentStudentDirectory(DepartmentStudentDirectory departmentStudentDirectory) {
        this.departmentStudentDirectory = departmentStudentDirectory;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }

    public DepartmentCourseSchedule getDepartmentCourseSchedule() {
        return departmentCourseSchedule;
    }

    public void setDepartmentCourseSchedule(DepartmentCourseSchedule departmentCourseSchedule) {
        this.departmentCourseSchedule = departmentCourseSchedule;
    }
    
    
    
}
