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
public class CommunityHistory {
    ArrayList<Community> communityHistory;

    public CommunityHistory() {
        communityHistory= new  ArrayList<Community>();
    }

    public ArrayList<Community> getCommunityHistory() {
        return communityHistory;
    }

    public void setCommunityHistory(ArrayList<Community> communityHistory) {
        this.communityHistory = communityHistory;
    }
       public Community addCommunity(){
        Community d =new Community();
        communityHistory.add(d);
        return d;
    }
    public void delete(Community doc){
        communityHistory.remove(doc);
        
    }
    
    
}
