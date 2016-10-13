/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author vinay
 */
public class InitializeSemester {

public ArrayList<Semester> initializeSemester(){
    
    ArrayList<Semester> semesterList = new ArrayList<Semester>();
    ArrayList<CalenderYear> calenderList = new ArrayList<CalenderYear>();
    
    for(int i=0;i<1;i++){
        CalenderYear calender  = new CalenderYear();
        calender.setYear(valueOf(2006+i));
        calenderList.add(calender);
       
    }
    
    for(int i = 0; i<1; i++){
    
    Semester sem1 = new Semester();
    sem1.setSemesterName("Spring");
    sem1.getCalenderYear().setYear(calenderList.get(i).getYear());
    sem1.getDateInfo().setStartDate("January");
    sem1.getDateInfo().setEndDate("April");
    semesterList.add(sem1);
    
    Semester sem2 = new Semester();
    sem2.setSemesterName("Summer");
    sem2.getCalenderYear().setYear(calenderList.get(i).getYear());
    sem2.getDateInfo().setStartDate("May");
    sem2.getDateInfo().setEndDate("August");
    semesterList.add(sem2);
    
    Semester sem = new Semester();
    sem.setSemesterName("Fall");
    sem.getCalenderYear().setYear(calenderList.get(i).getYear());
    sem.getDateInfo().setStartDate("August");
    sem.getDateInfo().setEndDate("December");
    semesterList.add(sem);
    
    
    }
//    for(int i=0;i<semesterList.size();i++)
//    {
//        System.out.println(""+semesterList.get(i).getSemesterName());
//        System.out.println(""+semesterList.get(i).getCalenderYear().getYear());
//    }
    
    return semesterList;
}    
}
