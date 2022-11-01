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
public class CityHistory {
    ArrayList<City> cityHistory;
    
    public CityHistory() {
       cityHistory = new  ArrayList<City>();
    }

    public ArrayList<City> getCityHistory() {
        return cityHistory;
    }

    public void setCityHistory(ArrayList<City> cityHistory) {
        this.cityHistory = cityHistory;
    }
     public City addCity(){
        City d =new City();
        cityHistory.add(d);
        return d;
    }
    public void delete(City doc){
        cityHistory.remove(doc);
        
    }
    
}
