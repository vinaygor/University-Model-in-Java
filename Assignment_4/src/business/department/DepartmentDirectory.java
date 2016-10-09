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

    public DepartmentDirectory() {
        this.departmentList = new ArrayList<Department>();
    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<Department> departmentList) {
        this.departmentList = departmentList;
    }
    
    
    public Department addDepartment()
    {
        Department department = new Department();
        departmentList.add(department);
        return department;
    }
    
    
}
