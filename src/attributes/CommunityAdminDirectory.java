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
public class CommunityAdminDirectory {
    ArrayList<CommunityAdmin> communityAdminDirectory;

    public CommunityAdminDirectory() {
        communityAdminDirectory= new ArrayList<CommunityAdmin>();
    }

    
    
    public ArrayList<CommunityAdmin> getCommunityAdminDirectory() {
        return communityAdminDirectory;
    }

    public void setCommunityAdminDirectory(ArrayList<CommunityAdmin> communityAdminDirectory) {
        this.communityAdminDirectory = communityAdminDirectory;
    }
      public CommunityAdmin addCommuintyAdmin(){
        CommunityAdmin d =new CommunityAdmin();
        communityAdminDirectory.add(d);
        return d;
    }
    public void delete(CommunityAdmin doc){
        communityAdminDirectory.remove(doc);
        
    }
    
    
}
