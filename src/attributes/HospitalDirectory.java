/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attributes;

import java.util.ArrayList;

/**
 *
 * @author dheer
 */
public class HospitalDirectory {
    ArrayList<Hospital> hospitalDirectory;
    private City city;
    public HospitalDirectory() {
        hospitalDirectory= new  ArrayList<Hospital>();
        city= new City();
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
      public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    public Hospital addHospital(){
        Hospital d =new Hospital();
        hospitalDirectory.add(d);
        return d;
    }
    public void delete(Hospital doc){
        hospitalDirectory.remove(doc);
        
    }

  
    
    
    
}
