/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.course;

import business.InitializeSemester;
import business.Semester;
import business.college.ClassRoom;
import business.department.Department;
import business.department.DepartmentCourseCatalog;
import business.department.TeacherDirectory;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author vinay
 */
public class InitializeCourse {
    private ArrayList<TeacherDirectory> td;
    private InitializeSemester initializeSemester;
    private ArrayList<DepartmentCourseCatalog> departmentCourseCatalog;
    private static int roomNo=1;
    private static int buildingNo=100;
    int i=1;
    public InitializeCourse(){
        initializeSemester = new InitializeSemester();
        departmentCourseCatalog= new ArrayList<DepartmentCourseCatalog>();
        td = new ArrayList<TeacherDirectory>();
    }
    public ArrayList<Course> initializeCourse(int number){
        
        
        switch(number){
            
        case 1:
        ArrayList<Course> courseCatalog1 = new ArrayList<Course>();
        Course course = new Course();
        course.setCourseId("1");
        course.setCourseName("AED");
        course.setCourseType("Mandatory");
        course.setFollowUpCourse("None");
        course.setPrerequisiteCourse("None");
        courseCatalog1.add(course);
        
        Course course1 = new Course();
        course1.setCourseId("2");
        course1.setCourseName("Database");
        course1.setCourseType("Elective");
        course1.setFollowUpCourse("Data Warehousing");
        course1.setPrerequisiteCourse("None");
        courseCatalog1.add(course1);
        
        Course course2 = new Course();
        course2.setCourseId("3");
        course2.setCourseName("Web Design");
        course2.setCourseType("Elective");
        course2.setFollowUpCourse("Web Tools");
        course2.setPrerequisiteCourse("None");
        courseCatalog1.add(course2);
        
        Course course3 = new Course();
        course3.setCourseId("4");
        course3.setCourseName("OOPS");
        course3.setCourseType("Elective");
        course3.setFollowUpCourse("None");
        course3.setPrerequisiteCourse("None");
        courseCatalog1.add(course3);
        
        return courseCatalog1;
        
        case 2:
        ArrayList<Course> courseCatalog2 = new ArrayList<Course>();
        Course course4 = new Course();
        course4.setCourseId("1");
        course4.setCourseName("P.M.");
        course4.setCourseType("Mandatory");
        course4.setFollowUpCourse("None");
        course4.setPrerequisiteCourse("None");
        courseCatalog2.add(course4);
        
        Course course5 = new Course();
        course5.setCourseId("2");
        course5.setCourseName("EDM");
        course5.setCourseType("Elective");
        course5.setFollowUpCourse("None");
        course5.setPrerequisiteCourse("None");
        courseCatalog2.add(course5);
        
        Course course6 = new Course();
        course6.setCourseId("3");
        course6.setCourseName("CO-OP");
        course6.setCourseType("Elective");
        course6.setFollowUpCourse("None");
        course6.setPrerequisiteCourse("None");
        courseCatalog2.add(course6);
        
        Course course7 = new Course();
        course7.setCourseId("4");
        course7.setCourseName("Stats");
        course7.setCourseType("Elective");
        course7.setFollowUpCourse("None");
        course7.setPrerequisiteCourse("None");
        courseCatalog2.add(course7);
        
        
        return courseCatalog2;
        }
        return null;
    }

    public ArrayList<Semester> initializeCourseOffering(Department d){
        ArrayList<CourseOffering> courseOffering = new ArrayList<CourseOffering>();
        ArrayList<Semester> semesterList = initializeSemester.initializeSemester();
        
       for (int k=0;k<d.getDepartmentCourseCatalog().getCourseCatalog().size();k++)
      {
        for(int i=0; i<semesterList.size();i++)
        {
            Semester s = semesterList.get(i);
            CourseOffering courseOffering1 = new CourseOffering();
           // courseOffering1.setSemester(s);
          // System.out.println(" " +s.getSemesterName());
            ArrayList<Course> tempDept=d.getDepartmentCourseCatalog().getCourseCatalog();
            //System.out.println("Teacher di size"+td.size());
            if(s.getSemesterName().equals("Fall"))
            for(int j=0;j<2;j++)
            { 
                Course c = tempDept.get(j);
                courseOffering1.getCourseList().addCourse(c);
                ClassRoom classRoom=initializeClassRoom();
                courseOffering1.setClassRoom(classRoom);
                courseOffering1.setTeacher(d.getJobPosition().get(0).getTeacherdirectory().get(j));
                courseOffering1.setNumberOfSeats(50);
                courseOffering.add(courseOffering1);
                
            }
            else if(s.getSemesterName().equals("Spring"))
            for(int j=2;j<4;j++)
            { 
                 Course c= tempDept.get(j);
                 int a=0;
                courseOffering1.getCourseList().addCourse(c);
                ClassRoom classRoom=initializeClassRoom();
                courseOffering1.setClassRoom(classRoom);
                courseOffering1.setTeacher(d.getJobPosition().get(0).getTeacherdirectory().get(a));
                courseOffering1.setNumberOfSeats(50);
                courseOffering.add(courseOffering1);
                
            }
            else
                for(int j=0;j<2;j++)
            { 
                 Course c= tempDept.get(j);
                courseOffering1.getCourseList().addCourse(c);
                ClassRoom classRoom=initializeClassRoom();
                courseOffering1.setClassRoom(classRoom);
                courseOffering1.setTeacher(d.getJobPosition().get(0).getTeacherdirectory().get(j));
                courseOffering1.setNumberOfSeats(50);
                courseOffering.add(courseOffering1);
            }
            
            Seat seat1 = initializeSeat(courseOffering);
            s.setCourseOffering(courseOffering);   
            SeatAssignment seatAssignment = initializeSeatAssignment(seat1);
            initializeCourseLoad(semesterList, seatAssignment);
        }
      }
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
            int courseID = Integer.parseInt(seat.getCourseOffering().get(i).getCourseList().getCourseCatalog().get(j).getCourseId());
            int seatsAvailable = seat.getCourseOffering().get(i).getNumberOfSeats();
            seatAssignment.setSeatAssignment(courseID,seatsAvailable);
        }
        }
        System.out.println("Count Seat Assignment : "+count);
        return seatAssignment;
    }
    
    public String initializeCourseLoad(ArrayList<Semester> semester, SeatAssignment seatAssignment){
        CourseLoad courseLoad = new CourseLoad();
        courseLoad.setSemester(semester);
        courseLoad.setSeatAssignment(seatAssignment);
        int count=0;
        int count1=0;
        int co=0;
        System.out.println("Seat Assignment Details "+courseLoad.getSeatAssignment().getSeatAssignment().size());
        
        for ( int i = 0; i< courseLoad.getSemester().size();i++){
            //System.out.println("courseLoad.getSemester().size() -- "+courseLoad.getSemester().size());
            ArrayList<CourseOffering> tempCourseOffering = courseLoad.getSemester().get(i).getCourseOffering();
            count1++;
            for(int j = 0;j<tempCourseOffering.size();j++){
                //System.out.println("tempCourseOffering.size()  --"+tempCourseOffering.size());
                DepartmentCourseCatalog tempD = tempCourseOffering.get(j).getCourseList();
                co++;
                for(int k =0 ; k<tempD.getCourseCatalog().size();k++){
                    //System.out.println("tempD.getCourseCatalog().size()--"+tempD.getCourseCatalog().size());
                    Course c = tempD.getCourseCatalog().get(k);
                    count++;
//                    System.out.println(" Semester Year"+courseLoad.getSemester().get(i).getCalenderYear().getYear());
//                    System.out.println("Course ID and Name: "+c.getCourseId()+" --"+c.getCourseName());
                      
                     
                    
                }
            }
        }
        System.out.println("Size of Courses --"+count+"  "+co+"  "+count1);
        
        return null;
    }
}
