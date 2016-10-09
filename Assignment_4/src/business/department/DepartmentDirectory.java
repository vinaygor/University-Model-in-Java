/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.department;

import java.util.ArrayList;

/**
 *
 * @author ayush
 */
public class DepartmentDirectory {
    
    private ArrayList<Department> departmentList;
    DepartmentDirectory departmentDirectory;

    public DepartmentDirectory(DepartmentDirectory departmentDirectory) {
        this.departmentList = new ArrayList<Department>();
        this.departmentDirectory = departmentDirectory;
    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<Department> departmentList) {
        this.departmentList = departmentList;
    }
    
    
    public Department addDepartment(Department d)
    {
        departmentList.add(d);
        return d;
    }
    
    
}
