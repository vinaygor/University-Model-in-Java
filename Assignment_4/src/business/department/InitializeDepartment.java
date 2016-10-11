/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.department;

import business.Semester;
import business.Student.InitializeStudent;
import business.Student.Student;
import business.course.Course;
import business.course.CourseOffering;
import business.course.InitializeCourse;
import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class InitializeDepartment {
    private InitializeStudent initializeStudent;
    private InitializeCourse initializeCourse;
   
    public InitializeDepartment(){
        initializeStudent = new InitializeStudent();
        initializeCourse = new InitializeCourse();
    }
    public ArrayList<Department> initializeDepartment(String collegeId)
    {
        int id = Integer.parseInt(collegeId);
        switch(id)
        {
            case 1:
        ArrayList<Department> department = new ArrayList<Department>();
        Department d1 = new Department();
        d1.setDepartmentName("IS");
        d1.setDepartmentId("1");
        ArrayList<Course> deptCourseCatalog1 = initializeCourse.initializeCourse(1);
        ArrayList<Student> s = initializeStudent.intializeStudentDetails();
        for(int i=0;i<s.size();i++)
        {   Student s1 = s.get(i);
            d1.getDepartmentStudentDirectory().addDepartmentStudent(s1);
        }
        for(int i=0;i<deptCourseCatalog1.size();i++)
        {   Course course1 = deptCourseCatalog1.get(i);
            d1.getDepartmentCourseCatalog().addCourse(course1);
        }
        
        ArrayList<JobPosition> jobPosition = initializeTeacher(1);
        //initializeCourse.getDepartmentCourseCatalog(d1.getDepartmentCourseCatalog());
        //initializeCourse.getTeacherCatalog(teacherDirectory);
        d1.setJobPosition(jobPosition);
        ArrayList<Semester> semester1 =initializeCourse.initializeCourseOffering(d1);
        DepartmentCourseSchedule dcs1=initializeDepartCourseSchedule(semester1);
        d1.setDepartmentCourseSchedule(dcs1);
        department.add(d1);
        
        Department d2 = new Department();
        d2.setDepartmentName("EM");
        d2.setDepartmentId("2");
        ArrayList<Course> deptCourseCatalog2 = initializeCourse.initializeCourse(2);
        ArrayList<Student> s2 = initializeStudent.intializeStudentDetails();
        for(int i=0;i<s2.size();i++)
        {   Student s1 = s2.get(i);
            d2.getDepartmentStudentDirectory().addDepartmentStudent(s1);
        }
        for(int i=0;i<deptCourseCatalog2.size();i++)
        {   Course course2 = deptCourseCatalog2.get(i);
            d2.getDepartmentCourseCatalog().addCourse(course2);
        }
        
        ArrayList<JobPosition> jobPosition1 = initializeTeacher(2);
        //initializeCourse.getDepartmentCourseCatalog(d2.getDepartmentCourseCatalog());
        //initializeCourse.getTeacherCatalog(teacherDirectory2);
        d2.setJobPosition(jobPosition1);
        ArrayList<Semester> semester2 =initializeCourse.initializeCourseOffering(d2);
        DepartmentCourseSchedule dcs2=initializeDepartCourseSchedule(semester2);
        d2.setDepartmentCourseSchedule(dcs2);
        department.add(d2);
        
        return department;
        
        case 2:
        ArrayList<Department> department2 = new ArrayList<Department>();
        Department d3 = new Department();
        d3.setDepartmentName("IS");
        d3.setDepartmentId("3");
        ArrayList<Course> deptCourseCatalog3 = initializeCourse.initializeCourse(2);
        ArrayList<Student> s3 = initializeStudent.intializeStudentDetails();
        for(int i=0;i<s3.size();i++)
        {   Student s1 = s3.get(i);
            d3.getDepartmentStudentDirectory().addDepartmentStudent(s1);
        }
        for(int i=0;i<deptCourseCatalog3.size();i++)
        {   Course course2 = deptCourseCatalog3.get(i);
            d3.getDepartmentCourseCatalog().addCourse(course2);
        }
        
        ArrayList<JobPosition> jobPosition2 = initializeTeacher(1);
        //initializeCourse.getDepartmentCourseCatalog(d3.getDepartmentCourseCatalog());
        //initializeCourse.getTeacherCatalog(teacherDirectory3);
        d3.setJobPosition(jobPosition2);
        ArrayList<Semester> semester3 =initializeCourse.initializeCourseOffering(d3);
        DepartmentCourseSchedule dcs3=initializeDepartCourseSchedule(semester3);
        d3.setDepartmentCourseSchedule(dcs3);
        department2.add(d3);
        
        Department d4 = new Department();
        d4.setDepartmentName("EM");
        d4.setDepartmentId("4");
        ArrayList<Course> deptCourseCatalog4 = initializeCourse.initializeCourse(2);
        ArrayList<Student> s4 = initializeStudent.intializeStudentDetails();
        for(int i=0;i<s4.size();i++)
        {   Student s1 = s4.get(i);
            d4.getDepartmentStudentDirectory().addDepartmentStudent(s1);
        }
        for(int i=0;i<deptCourseCatalog4.size();i++)
        {   Course course2 = deptCourseCatalog4.get(i);
            d4.getDepartmentCourseCatalog().addCourse(course2);
        }
        
        
        ArrayList<JobPosition> jobPosition3 = initializeTeacher(2);
        //initializeCourse.getDepartmentCourseCatalog(d4.getDepartmentCourseCatalog());
        //initializeCourse.getTeacherCatalog(teacherDirectory4);
        d4.setJobPosition(jobPosition3);
        ArrayList<Semester> semester4 =initializeCourse.initializeCourseOffering(d4);
        DepartmentCourseSchedule dcs4=initializeDepartCourseSchedule(semester4);
        d4.setDepartmentCourseSchedule(dcs4);
        department2.add(d4);
        
        
        Department d5 = new Department();
        d5.setDepartmentName("TSM");
        d5.setDepartmentId("5");
        ArrayList<Course> deptCourseCatalog5 = initializeCourse.initializeCourse(2);
        ArrayList<Student> s5 = initializeStudent.intializeStudentDetails();
        for(int i=0;i<s5.size();i++)
        {   Student s1 = s5.get(i);
            d5.getDepartmentStudentDirectory().addDepartmentStudent(s1);
        }
        for(int i=0;i<deptCourseCatalog5.size();i++)
        {   Course course2 = deptCourseCatalog5.get(i);
            d5.getDepartmentCourseCatalog().addCourse(course2);
        }
        
        ArrayList<JobPosition> jobPosition4 = initializeTeacher(1);
       // initializeCourse.getDepartmentCourseCatalog(d5.getDepartmentCourseCatalog());
        //initializeCourse.getTeacherCatalog(teacherDirectory5);
        d5.setJobPosition(jobPosition4);
        ArrayList<Semester> semester5 =initializeCourse.initializeCourseOffering(d5);
        DepartmentCourseSchedule dcs5=initializeDepartCourseSchedule(semester5);
        d5.setDepartmentCourseSchedule(dcs5);
        department2.add(d5);
        
  //      System.out.println(" Department teacher "+d5.getJobPosition().get(0).getTeacherdirectory().get(1).getPerson().getFirstName());
        return department2;
    
    }
        
        return null;
        
     }
    
    public  ArrayList<JobPosition> initializeTeacher(int deptId)
    {
        
        switch(deptId)
        {
            
        case 1:
        {
        ArrayList<JobPosition> jobPositionList = new ArrayList<JobPosition>();
        JobPosition jp = new JobPosition();
        Teacher teacher = new Teacher();
        jp.setJobId("1");
        jp.setJobRole("Faculty");
        
        teacher.getPerson().setFirstName("Kal");
        teacher.getPerson().setLastName("Bugrara");
        teacher.getPerson().setPersonID("001");
        teacher.getPerson().setGender("Male");
        teacher.getPerson().setDateOfBirth("01/01/1975");
        teacher.getPerson().getAddress().setCity("Boston");
        teacher.getPerson().getAddress().setStreet1("Longwood");
        teacher.getPerson().getAddress().setStreet2("Clearway");
        teacher.getPerson().getAddress().setState("MA");
        teacher.getPerson().getAddress().setPinNumber("32132");
        teacher.setEducationQualification("Phd");
        teacher.setExperience("20");
        jp.getTeacherdirectory().add(teacher);
        //teacherDirectory.addTeacher(teacher);
        
        Teacher teacher1 = new Teacher();
        teacher1.getJobPosition().setJobId("2");
        teacher1.getJobPosition().setJobRole("Faculty");
        teacher1.getPerson().setFirstName("Yusuf");
        teacher1.getPerson().setLastName("Ozbek");
        teacher1.getPerson().setPersonID("002");
        teacher1.getPerson().setGender("Male");
        teacher1.getPerson().setDateOfBirth("01/01/1980");
        teacher1.getPerson().getAddress().setCity("Boston");
        teacher1.getPerson().getAddress().setStreet1("Huntington Avenue");
        teacher1.getPerson().getAddress().setStreet2("Clearway");
        teacher1.getPerson().getAddress().setState("MA");
        teacher1.getPerson().getAddress().setPinNumber("32132");
        teacher1.setEducationQualification("Phd");
        teacher1.setExperience("20");
        jp.getTeacherdirectory().add(teacher1);
        //teacherDirectory.addTeacher(teacher1);
        
        JobPosition jp1 = new JobPosition();
        jp1.setJobId("2");
        jp1.setJobRole("Staff");
        
        jobPositionList.add(jp);
        jobPositionList.add(jp1);
        return jobPositionList;
        
        }
        case 2:
        {
        ArrayList<JobPosition> jobPositionList = new ArrayList<JobPosition>();
        JobPosition jp1 = new JobPosition();
       // TeacherDirectory teacherDirectory1 = new TeacherDirectory();
        Teacher teacher2 = new Teacher();
        jp1.setJobId("1");
        jp1.setJobRole("Faculty");
        teacher2.getPerson().setFirstName("Steve");
        teacher2.getPerson().setLastName("Klosterman");
        teacher2.getPerson().setPersonID("003");
        teacher2.getPerson().setGender("Male");
        teacher2.getPerson().setDateOfBirth("01/01/1975");
        teacher2.getPerson().getAddress().setCity("Boston");
        teacher2.getPerson().getAddress().setStreet1("Huntington Avenue");
        teacher2.getPerson().getAddress().setStreet2("Clearway");
        teacher2.getPerson().getAddress().setState("MA");
        teacher2.getPerson().getAddress().setPinNumber("32132");
        teacher2.setEducationQualification("Phd");
        teacher2.setExperience("20");
        jp1.getTeacherdirectory().add(teacher2);
        //teacherDirectory1.addTeacher(teacher2);
        
        
        Teacher teacher3 = new Teacher();
        teacher3.getJobPosition().setJobId("2");
        teacher3.getJobPosition().setJobRole("Faculty");
        teacher3.getPerson().setFirstName("Ben");
        teacher3.getPerson().setLastName("Haris");
        teacher3.getPerson().setPersonID("004");
        teacher3.getPerson().setGender("Male");
        teacher3.getPerson().setDateOfBirth("01/01/1975");
        teacher3.getPerson().getAddress().setCity("Boston");
        teacher3.getPerson().getAddress().setStreet1("Huntington Avenue");
        teacher3.getPerson().getAddress().setStreet2("Mass Ave");
        teacher3.getPerson().getAddress().setState("MA");
        teacher3.getPerson().getAddress().setPinNumber("32132");
        teacher3.setEducationQualification("Phd");
        teacher3.setExperience("20");
        jp1.getTeacherdirectory().add(teacher3);
        //teacherDirectory1.addTeacher(teacher3);
        
            JobPosition jp2 = new JobPosition();
            jp2.setJobId("2");
            jp2.setJobRole("Staff");
            
            jobPositionList.add(jp1);
            jobPositionList.add(jp2);
        return jobPositionList;
        }
        }
        return null;
        
        
    }
    
    public DepartmentCourseSchedule initializeDepartCourseSchedule(ArrayList<Semester> semester)
    {
        DepartmentCourseSchedule dcs = new DepartmentCourseSchedule();
        dcs.setSemester(semester);
        for(int i=0; i<semester.size();i++)
        {
            
            dcs.setCourseOffering(semester.get(i).getCourseOffering());    
            
        }
        return dcs;
        
        
        
    }
}
