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
public class HouseHistory {
    ArrayList<House> houseHistory;

    public HouseHistory() {
        houseHistory= new ArrayList<House>();

    }
    
    public ArrayList<House> getHouseHistory() {
        return houseHistory;
    }

    public void setHouseHistory(ArrayList<House> houseHistory) {
        this.houseHistory = houseHistory;
    }

   
    
     public House addHouse(){
        House d =new House();
        houseHistory.add(d);
        return d;
    }
    public void delete(House doc){
        houseHistory.remove(doc);
        
    }
    
}
