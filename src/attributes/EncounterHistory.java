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
public class EncounterHistory {
    ArrayList<Encounter> encounterHistory;
    private Patient patient;
    

    public EncounterHistory() {
        encounterHistory= new ArrayList<Encounter>();
        patient = new Patient();
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public Encounter addEncounter(){
        Encounter d =new Encounter();
        encounterHistory.add(d);
        return d;
    }
    public void delete(Encounter encounter){
        encounterHistory.remove(encounter);

        
    }
    
    
}
