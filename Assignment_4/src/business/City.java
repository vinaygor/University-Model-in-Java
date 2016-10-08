/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.university.UniversityDirectory;

/**
 *
 * @author ayush
 */
public class City {
    
    private String cityName;
    private String cityStateName;
    private UniversityDirectory universityDirectory;

    public City() 
    {
        this.universityDirectory = new UniversityDirectory();
    }
    
    

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityStateName() {
        return cityStateName;
    }

    public void setCityStateName(String cityStateName) {
        this.cityStateName = cityStateName;
    }
    
    
}
