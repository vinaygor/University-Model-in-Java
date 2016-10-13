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
import static java.lang.String.valueOf;
import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class InitializeDepartment {
    
    private InitializeCourse initializeCourse;
    public static int count2=1;
   
    public InitializeDepartment(){
        
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
        d1.setDepartmentId(valueOf(count2++));
        ArrayList<Course> deptCourseCatalog1 = initializeCourse.initializeCourse(1);
        DepartmentCourseCatalog dc = new DepartmentCourseCatalog();
        dc.setCourseCatalog(deptCourseCatalog1);
        dc.setDepartmentId(d1.getDepartmentId());
               // System.out.println("Department id "+dc.getDepartmentId());
        
        for(int i=0;i<deptCourseCatalog1.size();i++)
        {   Course course1 = deptCourseCatalog1.get(i);
            d1.getDepartmentCourseCatalog().addCourse(course1);
           
            
        }
         d1.setDepartmentCourseCatalog(dc);
       // d1.getDepartmentCourseCatalog().setDepartmentId(d1.getDepartmentId());
        
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
        d2.setDepartmentId(valueOf(count2++));
        ArrayList<Course> deptCourseCatalog2 = initializeCourse.initializeCourse(2);
        DepartmentCourseCatalog dc2 = new DepartmentCourseCatalog();
        dc2.setCourseCatalog(deptCourseCatalog2);
        dc2.setDepartmentId(d2.getDepartmentId());
//        ArrayList<Student> s2 = initializeStudent.intializeStudentDetails(d2.getDepartmentId());
//        for(int i=0;i<s2.size();i++)
//        {   Student s1 = s2.get(i);
//            d2.getDepartmentStudentDirectory().addDepartmentStudent(s1);
//        }
        for(int i=0;i<deptCourseCatalog2.size();i++)
        {   Course course2 = deptCourseCatalog2.get(i);
            d2.getDepartmentCourseCatalog().addCourse(course2);
                        
        }
        d2.setDepartmentCourseCatalog(dc2);
        //d2.getDepartmentCourseCatalog().setDepartmentId(d2.getDepartmentId());
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
        d3.setDepartmentId(valueOf(count2++));
        ArrayList<Course> deptCourseCatalog3 = initializeCourse.initializeCourse(2);
        DepartmentCourseCatalog dc3 = new DepartmentCourseCatalog();
        dc3.setCourseCatalog(deptCourseCatalog3);
        dc3.setDepartmentId(d3.getDepartmentId());
//        ArrayList<Student> s3 = initializeStudent.intializeStudentDetails(d3.getDepartmentId());
//        for(int i=0;i<s3.size();i++)
//        {   Student s1 = s3.get(i);
//            d3.getDepartmentStudentDirectory().addDepartmentStudent(s1);
//        }
        for(int i=0;i<deptCourseCatalog3.size();i++)
        {   Course course2 = deptCourseCatalog3.get(i);
            d3.getDepartmentCourseCatalog().addCourse(course2);
        }
        d3.setDepartmentCourseCatalog(dc3);
        //d3.getDepartmentCourseCatalog().setDepartmentId(d3.getDepartmentId());
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
        d4.setDepartmentId(valueOf(count2++));
        ArrayList<Course> deptCourseCatalog4 = initializeCourse.initializeCourse(2);
        DepartmentCourseCatalog dc4 = new DepartmentCourseCatalog();
        dc4.setCourseCatalog(deptCourseCatalog4);
        dc4.setDepartmentId(d4.getDepartmentId());
//        ArrayList<Student> s4 = initializeStudent.intializeStudentDetails(d4.getDepartmentId());
//        for(int i=0;i<s4.size();i++)
//        {   Student s1 = s4.get(i);
//            d4.getDepartmentStudentDirectory().addDepartmentStudent(s1);
//        }
        for(int i=0;i<deptCourseCatalog4.size();i++)
        {   Course course2 = deptCourseCatalog4.get(i);
            d4.getDepartmentCourseCatalog().addCourse(course2);
        }
        d4.setDepartmentCourseCatalog(dc4);
        //d4.getDepartmentCourseCatalog().setDepartmentId(d4.getDepartmentId());
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
        d5.setDepartmentId(valueOf(count2++));
        ArrayList<Course> deptCourseCatalog5 = initializeCourse.initializeCourse(2);
        DepartmentCourseCatalog dc5 = new DepartmentCourseCatalog();
        dc5.setCourseCatalog(deptCourseCatalog5);
        dc5.setDepartmentId(d5.getDepartmentId());
//        ArrayList<Student> s5 = initializeStudent.intializeStudentDetails(d5.getDepartmentId());
//        for(int i=0;i<s5.size();i++)
//        {   Student s1 = s5.get(i);
//            d5.getDepartmentStudentDirectory().addDepartmentStudent(s1);
//        }
        for(int i=0;i<deptCourseCatalog5.size();i++)
        {   Course course2 = deptCourseCatalog5.get(i);
            d5.getDepartmentCourseCatalog().addCourse(course2);
        }
        d5.setDepartmentCourseCatalog(dc5);
        //d5.getDepartmentCourseCatalog().setDepartmentId(d5.getDepartmentId());
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
//        teacher1.getJobPosition().setJobId("2");
//        teacher1.getJobPosition().setJobRole("Faculty");
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
        teacher1.setEducationQualification("MS");
        teacher1.setExperience("20");
        jp.getTeacherdirectory().add(teacher1);
        //teacherDirectory.addTeacher(teacher1);
        
        Teacher teacher2 = new Teacher();
//        teacher2.getJobPosition().setJobId("2");
//        teacher2.getJobPosition().setJobRole("Faculty");
        teacher2.getPerson().setFirstName("ABC");
        teacher2.getPerson().setLastName("PQR");
        teacher2.getPerson().setPersonID("003");
        teacher2.getPerson().setGender("Male");
        teacher2.getPerson().setDateOfBirth("01/01/1980");
        teacher2.getPerson().getAddress().setCity("Boston");
        teacher2.getPerson().getAddress().setStreet1("Huntington Avenue");
        teacher2.getPerson().getAddress().setStreet2("Clearway");
        teacher2.getPerson().getAddress().setState("MA");
        teacher2.getPerson().getAddress().setPinNumber("32132");
        teacher2.setEducationQualification("BE");
        teacher2.setExperience("10");
        jp.getTeacherdirectory().add(teacher2);
        
        Teacher teacher3 = new Teacher();
//        teacher3.getJobPosition().setJobId("2");
//        teacher3.getJobPosition().setJobRole("Faculty");
        teacher3.getPerson().setFirstName("QPR");
        teacher3.getPerson().setLastName("SAWQQ");
        teacher3.getPerson().setPersonID("004");
        teacher3.getPerson().setGender("Male");
        teacher3.getPerson().setDateOfBirth("01/01/1980");
        teacher3.getPerson().getAddress().setCity("Boston");
        teacher3.getPerson().getAddress().setStreet1("Huntington Avenue");
        teacher3.getPerson().getAddress().setStreet2("Clearway");
        teacher3.getPerson().getAddress().setState("MA");
        teacher3.getPerson().getAddress().setPinNumber("32132");
        teacher3.setEducationQualification("Ms");
        teacher3.setExperience("15");
        jp.getTeacherdirectory().add(teacher3);
        
        
        Teacher teacher4 = new Teacher();
//        teacher4.getJobPosition().setJobId("2");
//        teacher4.getJobPosition().setJobRole("Faculty");
        teacher4.getPerson().setFirstName("EFG");
        teacher4.getPerson().setLastName("LMNOP");
        teacher4.getPerson().setPersonID("005");
        teacher4.getPerson().setGender("Male");
        teacher4.getPerson().setDateOfBirth("01/01/1980");
        teacher4.getPerson().getAddress().setCity("Boston");
        teacher4.getPerson().getAddress().setStreet1("Huntington Avenue");
        teacher4.getPerson().getAddress().setStreet2("Clearway");
        teacher4.getPerson().getAddress().setState("MA");
        teacher4.getPerson().getAddress().setPinNumber("32132");
        teacher4.setEducationQualification("MS");
        teacher4.setExperience("20");
        jp.getTeacherdirectory().add(teacher4);
        
        
        Teacher teacher5 = new Teacher();
//        teacher5.getJobPosition().setJobId("2");
//        teacher5.getJobPosition().setJobRole("Faculty");
        teacher5.getPerson().setFirstName("KMLN");
        teacher5.getPerson().setLastName("QPOP");
        teacher5.getPerson().setPersonID("006");
        teacher5.getPerson().setGender("Male");
        teacher5.getPerson().setDateOfBirth("01/01/1980");
        teacher5.getPerson().getAddress().setCity("Boston");
        teacher5.getPerson().getAddress().setStreet1("Huntington Avenue");
        teacher5.getPerson().getAddress().setStreet2("Clearway");
        teacher5.getPerson().getAddress().setState("MA");
        teacher5.getPerson().getAddress().setPinNumber("32132");
        teacher5.setEducationQualification("MS");
        teacher5.setExperience("10");
        jp.getTeacherdirectory().add(teacher5);
        
        
        
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
        teacher2.getPerson().setPersonID("007");
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
//        teacher3.getJobPosition().setJobId("2");
//        teacher3.getJobPosition().setJobRole("Faculty");
        teacher3.getPerson().setFirstName("Ben");
        teacher3.getPerson().setLastName("Haris");
        teacher3.getPerson().setPersonID("008");
        teacher3.getPerson().setGender("Male");
        teacher3.getPerson().setDateOfBirth("01/01/1975");
        teacher3.getPerson().getAddress().setCity("Boston");
        teacher3.getPerson().getAddress().setStreet1("Huntington Avenue");
        teacher3.getPerson().getAddress().setStreet2("Mass Ave");
        teacher3.getPerson().getAddress().setState("MA");
        teacher3.getPerson().getAddress().setPinNumber("32132");
        teacher3.setEducationQualification("MS");
        teacher3.setExperience("20");
        jp1.getTeacherdirectory().add(teacher3);
        //teacherDirectory1.addTeacher(teacher3);
        
         Teacher teacher24 = new Teacher();
//        teacher2.getJobPosition().setJobId("2");
//        teacher2.getJobPosition().setJobRole("Faculty");
        teacher24.getPerson().setFirstName("ABC12");
        teacher24.getPerson().setLastName("PQR2");
        teacher24.getPerson().setPersonID("009");
        teacher24.getPerson().setGender("Male");
        teacher24.getPerson().setDateOfBirth("01/01/1980");
        teacher24.getPerson().getAddress().setCity("Boston");
        teacher24.getPerson().getAddress().setStreet1("Huntington Avenue");
        teacher24.getPerson().getAddress().setStreet2("Clearway");
        teacher24.getPerson().getAddress().setState("MA");
        teacher24.getPerson().getAddress().setPinNumber("32132");
        teacher24.setEducationQualification("BE");
        teacher24.setExperience("10");
        jp1.getTeacherdirectory().add(teacher24);
        
        Teacher teacher31 = new Teacher();
//        teacher3.getJobPosition().setJobId("2");
//        teacher3.getJobPosition().setJobRole("Faculty");
        teacher31.getPerson().setFirstName("QPR123");
        teacher31.getPerson().setLastName("SAW123");
        teacher31.getPerson().setPersonID("010");
        teacher31.getPerson().setGender("Male");
        teacher31.getPerson().setDateOfBirth("01/01/1980");
        teacher31.getPerson().getAddress().setCity("Boston");
        teacher31.getPerson().getAddress().setStreet1("Huntington Avenue");
        teacher31.getPerson().getAddress().setStreet2("Clearway");
        teacher31.getPerson().getAddress().setState("MA");
        teacher31.getPerson().getAddress().setPinNumber("32132");
        teacher31.setEducationQualification("MS");
        teacher31.setExperience("15");
        jp1.getTeacherdirectory().add(teacher31);
        
        
        Teacher teacher41 = new Teacher();
//        teacher4.getJobPosition().setJobId("2");
//        teacher4.getJobPosition().setJobRole("Faculty");
        teacher41.getPerson().setFirstName("EFG123");
        teacher41.getPerson().setLastName("LMNOP124");
        teacher41.getPerson().setPersonID("011");
        teacher41.getPerson().setGender("Male");
        teacher41.getPerson().setDateOfBirth("01/01/1980");
        teacher41.getPerson().getAddress().setCity("Boston");
        teacher41.getPerson().getAddress().setStreet1("Huntington Avenue");
        teacher41.getPerson().getAddress().setStreet2("Clearway");
        teacher41.getPerson().getAddress().setState("MA");
        teacher41.getPerson().getAddress().setPinNumber("32132");
        teacher41.setEducationQualification("MS");
        teacher41.setExperience("20");
        jp1.getTeacherdirectory().add(teacher41);
        
        
        Teacher teacher51 = new Teacher();
//        teacher5.getJobPosition().setJobId("2");
//        teacher5.getJobPosition().setJobRole("Faculty");
        teacher51.getPerson().setFirstName("KMLN123");
        teacher51.getPerson().setLastName("QPOP123");
        teacher51.getPerson().setPersonID("012");
        teacher51.getPerson().setGender("Female");
        teacher51.getPerson().setDateOfBirth("01/01/1980");
        teacher51.getPerson().getAddress().setCity("Boston");
        teacher51.getPerson().getAddress().setStreet1("Huntington Avenue");
        teacher51.getPerson().getAddress().setStreet2("Clearway");
        teacher51.getPerson().getAddress().setState("MA");
        teacher51.getPerson().getAddress().setPinNumber("32132");
        teacher51.setEducationQualification("MS");
        teacher51.setExperience("10");
        jp1.getTeacherdirectory().add(teacher51);
        
        
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
