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
public class VitalSignDirectory {
    ArrayList<VitalSign> vitalSignDirectory;
    
    public VitalSignDirectory() {
        vitalSignDirectory= new ArrayList<VitalSign>();
    }

    public ArrayList<VitalSign> getVitalSignDirectory() {
        return vitalSignDirectory;
    }

    public void setVitalSignDirectory(ArrayList<VitalSign> vitalSignDirectory) {
        this.vitalSignDirectory = vitalSignDirectory;
    }
    public VitalSign addVitalSign(){
        VitalSign d =new VitalSign();
        vitalSignDirectory.add(d);
        return d;
    }
    public void delete(VitalSign vitalSign){
        vitalSignDirectory.remove(vitalSign);
        
    }
    
    
}
