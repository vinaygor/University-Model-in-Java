/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.course;

import business.InitializeSemester;
import business.Semester;
import business.Student.InitializeStudent;
import business.Student.Student;
import business.college.ClassRoom;
import business.college.Transcript;
import business.department.Department;
import business.department.DepartmentCourseCatalog;
import business.department.TeacherDirectory;
import static java.lang.String.valueOf;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author vinay
 */
public class InitializeCourse {
    private ArrayList<TeacherDirectory> td;
    private InitializeSemester initializeSemester;
    private ArrayList<DepartmentCourseCatalog> departmentCourseCatalog;
    private InitializeStudent initializeStudent; 
    private static int roomNo=1;
    private static int buildingNo=100;
    int i=1;
    public static int count=1;
    public static int number =0;
    public InitializeCourse(){
        initializeSemester = new InitializeSemester();
        departmentCourseCatalog= new ArrayList<DepartmentCourseCatalog>();
        td = new ArrayList<TeacherDirectory>();
        initializeStudent = new InitializeStudent();
    }
    public ArrayList<Course> initializeCourse(int number){
        
       // System.out.println("Count inside InitializeCourse :"+count);
        switch(number){
            
        case 1:
        ArrayList<Course> courseCatalog1 = new ArrayList<Course>();
        Course course = new Course();
        course.setCourseId(valueOf(count++));
        course.setCourseName("AED");
        course.setCourseType("Mandatory");
        course.setFollowUpCourse("None");
        course.setPrerequisiteCourse("None");
        courseCatalog1.add(course);
        
        Course course1 = new Course();
        course1.setCourseId(valueOf(count++));
        course1.setCourseName("Database");
        course1.setCourseType("Elective");
        course1.setFollowUpCourse("Data Warehousing");
        course1.setPrerequisiteCourse("None");
        courseCatalog1.add(course1);
        
        Course course2 = new Course();
        course2.setCourseId(valueOf(count++));
        course2.setCourseName("Web Design");
        course2.setCourseType("Elective");
        course2.setFollowUpCourse("Web Tools");
        course2.setPrerequisiteCourse("None");
        courseCatalog1.add(course2);
        
        Course course3 = new Course();
        course3.setCourseId(valueOf(count++));
        course3.setCourseName("OOPS");
        course3.setCourseType("Elective");
        course3.setFollowUpCourse("None");
        course3.setPrerequisiteCourse("None");
        courseCatalog1.add(course3);
        
        Course course4 = new Course();
        course4.setCourseId(valueOf(count++));
        course4.setCourseName("Web Design");
        course4.setCourseType("Elective");
        course4.setFollowUpCourse("Web Tools");
        course4.setPrerequisiteCourse("None");
        courseCatalog1.add(course4);
        
        Course course5 = new Course();
        course5.setCourseId(valueOf(count++));
        course5.setCourseName("OOPS");
        course5.setCourseType("Elective");
        course5.setFollowUpCourse("None");
        course5.setPrerequisiteCourse("None");
        courseCatalog1.add(course5);
        
        return courseCatalog1;
        
        case 2:
        ArrayList<Course> courseCatalog2 = new ArrayList<Course>();
        Course course8 = new Course();
        course8.setCourseId(valueOf(count++));
        course8.setCourseName("P.M.");
        course8.setCourseType("Mandatory");
        course8.setFollowUpCourse("None");
        course8.setPrerequisiteCourse("None");
        courseCatalog2.add(course8);
        
        Course course9 = new Course();
        course9.setCourseId(valueOf(count++));
        course9.setCourseName("EDM");
        course9.setCourseType("Elective");
        course9.setFollowUpCourse("None");
        course9.setPrerequisiteCourse("None");
        courseCatalog2.add(course9);
        
        Course course6 = new Course();
        course6.setCourseId(valueOf(count++));
        course6.setCourseName("CO-OP");
        course6.setCourseType("Elective");
        course6.setFollowUpCourse("None");
        course6.setPrerequisiteCourse("None");
        courseCatalog2.add(course6);
        
        Course course7 = new Course();
        course7.setCourseId(valueOf(count++));
        course7.setCourseName("Stats");
        course7.setCourseType("Elective");
        course7.setFollowUpCourse("None");
        course7.setPrerequisiteCourse("None");
        courseCatalog2.add(course7);
       
         
        Course course10 = new Course();
        course10.setCourseId(valueOf(count++));
        course10.setCourseName("EDM");
        course10.setCourseType("Elective");
        course10.setFollowUpCourse("None");
        course10.setPrerequisiteCourse("None");
        courseCatalog2.add(course10);
         
        Course course11 = new Course();
        course11.setCourseId(valueOf(count++));
        course11.setCourseName("EDM");
        course11.setCourseType("Elective");
        course11.setFollowUpCourse("None");
        course11.setPrerequisiteCourse("None");
        courseCatalog2.add(course11);
        
        
        return courseCatalog2;
        }
        return null;
    }

    public ArrayList<Semester> initializeCourseOffering(Department d){
        ArrayList<CourseOffering> courseOffering = new ArrayList<CourseOffering>();
        ArrayList<Semester> semesterList = initializeSemester.initializeSemester();
        ArrayList<SeatAssignment> seatAssignmentList = new ArrayList<SeatAssignment>();
        DepartmentCourseCatalog dcc = d.getDepartmentCourseCatalog();
       for (int k=0;k<d.getDepartmentCourseCatalog().getCourseCatalog().size();k++)
      {
        for(int i=0; i<semesterList.size();i++)
        {
            Semester s = semesterList.get(i);
            CourseOffering courseOffering1 = new CourseOffering();
           // courseOffering1.setSemester(s);
          // System.out.println(" " +s.getSemesterName());
            ArrayList<Course> tempDept=d.getDepartmentCourseCatalog().getCourseCatalog();
            DepartmentCourseCatalog dc1 = new DepartmentCourseCatalog();
            
            //System.out.println("Teacher di size"+td.size());
            if(s.getSemesterName().equals("Fall"))
            for(int j=0;j<6;j++)
            { 
                
                Course c = tempDept.get(j);
                dc1.addCourse(c);
                dc1.setDepartmentId(d.getDepartmentId());
               // courseOffering1.setDeptId(d.getDepartmentId());
                courseOffering1.setCourseList(dc1);                
                ClassRoom classRoom=initializeClassRoom();
                courseOffering1.setClassRoom(classRoom);
                //courseOffering1.setCourseList(dcc);
                courseOffering1.setTeacher(d.getJobPosition().get(0).getTeacherdirectory().get(j));
                courseOffering1.setNumberOfSeats(50);
                courseOffering.add(courseOffering1);
                
            }
            else if(s.getSemesterName().equals("Spring"))
            for(int j=0;j<6;j++)
            { 
                 Course c= tempDept.get(j);
                 int a=0;
                 dc1.addCourse(c);
                dc1.setDepartmentId(d.getDepartmentId());
               // courseOffering1.setDeptId(d.getDepartmentId());
                courseOffering1.setCourseList(dc1); 
               // courseOffering1.getCourseList().addCourse(c);
                ClassRoom classRoom=initializeClassRoom();
                courseOffering1.setClassRoom(classRoom);
                //courseOffering1.setCourseList(dcc);
                courseOffering1.setTeacher(d.getJobPosition().get(0).getTeacherdirectory().get(a));
                courseOffering1.setNumberOfSeats(50);
                courseOffering.add(courseOffering1);
                
            }
            else
                for(int j=0;j<6;j++)
            { 
                 Course c= tempDept.get(j);
                 dc1.addCourse(c);
                dc1.setDepartmentId(d.getDepartmentId());
               // courseOffering1.setDeptId(d.getDepartmentId());
                courseOffering1.setCourseList(dc1); 
              //  courseOffering1.getCourseList().addCourse(c);
                ClassRoom classRoom=initializeClassRoom();
                courseOffering1.setClassRoom(classRoom);
                //courseOffering1.setCourseList(dcc);
                courseOffering1.setTeacher(d.getJobPosition().get(0).getTeacherdirectory().get(j));
                courseOffering1.setNumberOfSeats(50);
                courseOffering.add(courseOffering1);
            }
            
            Seat seat1 = initializeSeat(courseOffering);
            s.setCourseOffering(courseOffering);   
            SeatAssignment seatAssignment = initializeSeatAssignment(seat1);
            seatAssignmentList.add(seatAssignment);
           // System.out.println(" Seat Ass "+seatAssignmentList.size() + " Sem list "+semesterList.size());
        }
      }
        
       initializeCourseLoad(semesterList, seatAssignmentList,d);
       
//       for(int b=0;b<courseOffering.size();b++)
//       {
//           CourseOffering c = courseOffering.get(b);
//           System.out.println(" Size "+c.getCourseList().getCourseCatalog().size()+" "+i++);
//       }
//        System.out.println(""+courseOffering.size());
//        System.out.println("Semester Name: "+semesterList.get(0).getSemesterName());
//        System.out.println("Semester Year: "+semesterList.get(0).getCalenderYear().getYear());
//        System.out.println("Number of courses offered in the sem: "+semesterList.get(0).getCourseOffering().get(0).getCourseList().getCourseCatalog().size());
       return semesterList;
        //semesterList.get(1).getSemesterName();
        
    }
    
    public void getTeacherCatalog(TeacherDirectory td){
        this.td.add(td);
    }
    
//    public void getDepartmentCourseCatalog(DepartmentCourseCatalog d){
//        departmentCourseCatalog.add(d);
//    }
    
    public ClassRoom initializeClassRoom()
    {
        ClassRoom classRoom = new ClassRoom();
        classRoom.setRoomNo(valueOf(roomNo));
        classRoom.setBuildingNo(valueOf(buildingNo));
        roomNo++;
        buildingNo++;
        
        return classRoom; 
        
    }
    
    public Seat initializeSeat(ArrayList<CourseOffering> courseOfferings){
        
        Seat seat = new Seat();
        seat.setCourseOffering(courseOfferings);
        return seat;
    }
    
    public SeatAssignment initializeSeatAssignment(Seat s){
        SeatAssignment seatAssignment = new SeatAssignment();    
        Seat seat = s;
        int count =0;
        for(int i =0 ; i < seat.getCourseOffering().size(); i++)
        {
            
            for(int j =0; j<seat.getCourseOffering().get(i).getCourseList().getCourseCatalog().size();j++){
               count++; 
            String courseID = seat.getCourseOffering().get(i).getCourseList().getCourseCatalog().get(j).getCourseId();
            int seatsAvailable = seat.getCourseOffering().get(i).getNumberOfSeats();
            seatAssignment.setSeatAssignment(courseID,seatsAvailable);
        }
        }
       // System.out.println("Count Seat Assignment : "+count);
        return seatAssignment;
    }
    
    public void initializeCourseLoad(ArrayList<Semester> semester, ArrayList<SeatAssignment> seatAssignment,Department d1){
        CourseLoad courseLoad = new CourseLoad();
        courseLoad.setSemester(semester);
        courseLoad.setSeatAssignment(seatAssignment);
        Transcript transcript = new Transcript();
        transcript.setCourseLoad(courseLoad);
        number++;
        int num;
        if(number%2==0)
            num=1;
        else 
            num=2;
        ArrayList<Student> s = initializeStudent.intializeStudentDetails(d1.getDepartmentId(),transcript,num);
        for(int i=0;i<s.size();i++)
        {   Student s1 = s.get(i);
            d1.getDepartmentStudentDirectory().addDepartmentStudent(s1);
        }
        //System.out.println("Semester size" +transcript.getCourseLoad().getSemester().size());
        //transcript.getTranscript(student);
//        int count=0;
////        int count1=0;
////        int co=0;
//        //System.out.println("Seat Assignment Details "+courseLoad.getSeatAssignment().getSeatAssignment().size());
//        
//        for ( int i = 0; i< courseLoad.getSemester().size();i++){
//            //System.out.println("courseLoad.getSemester().size() -- "+courseLoad.getSemester().size());
//            ArrayList<CourseOffering> tempCourseOffering = courseLoad.getSemester().get(i).getCourseOffering();
//            //count1++;
//            for(int j = 0;j<tempCourseOffering.size();j++){
//                //System.out.println("tempCourseOffering.size()  --"+tempCourseOffering.size());
//                DepartmentCourseCatalog tempD = tempCourseOffering.get(j).getCourseList();
//               // co++;
//                for(int k =0 ; k<tempD.getCourseCatalog().size();k++){
//                    //System.out.println("tempD.getCourseCatalog().size()--"+tempD.getCourseCatalog().size());
//                    Course c = tempD.getCourseCatalog().get(k);
//                    for(int l=0;l<seatAssignment.size();l++){
//                    
//                        if(seatAssignment.get(l).getSeatAssignment().containsKey(c.getCourseId())){
//                                SeatAssignment seatAssignment1 = seatAssignment.get(l);
//                                int newCount = Integer.parseInt(seatAssignment1.seatCount.get(c.getCourseId()).toString());
//                                newCount--;
//                                seatAssignment1.setSeatAssignment(c.getCourseId(), newCount);
//                         //       System.out.println("Course Changed : Course ID:"+c.getCourseId()+
//                         //               " Count :"+newCount);
//                        }
//                    }
//                }
//            }
//        }
//        // System.out.println("Department "+tempd);
//        for (Iterator it = seatAssignment.get(1).seatCount.keySet().iterator(); it.hasNext();) {
//            String name = it.next().toString();
//            String value = seatAssignment.get(1).seatCount.get(name).toString();
//            
//            
//        //    System.out.println(name+" "+value);
//        }
        
        //System.out.println("Count->"+count);
       //System.out.println(""+seatAssignment.get(0).seatAssignment.);
//        System.out.println("Seat Assignment size"+seatAssignment.size());
//       System.out.println("Size of Courses --"+count);
        
//        return null;
    }
    
}
