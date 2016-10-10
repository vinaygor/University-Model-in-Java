/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.course;

/**
 *
 * @author vinay
 */
public class Course {
    private String courseName;
    private String courseId;
    private String courseType;
    private String prerequisiteCourse;
    private String followUpCourse;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getPrerequisiteCourse() {
        return prerequisiteCourse;
    }

    public void setPrerequisiteCourse(String prerequisiteCourse) {
        this.prerequisiteCourse = prerequisiteCourse;
    }

    public String getFollowUpCourse() {
        return followUpCourse;
    }

    public void setFollowUpCourse(String followUpCourse) {
        this.followUpCourse = followUpCourse;
    }
    
    
    
}
