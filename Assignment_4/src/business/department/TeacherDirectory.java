/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.department;

import java.util.ArrayList;

/**
 *
 * @author vinay
 */
public class TeacherDirectory {
    
    private ArrayList<Teacher> teacherDirectory;
    
    public TeacherDirectory(){
        this.teacherDirectory = new ArrayList<Teacher>();
    }

    public ArrayList<Teacher> getTeacherDirectory() {
        return teacherDirectory;
    }

    public void setTeacherDirectory(ArrayList<Teacher> teacherDirectory) {
        this.teacherDirectory = teacherDirectory;
    }
    
}
