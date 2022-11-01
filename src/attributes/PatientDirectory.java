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
public class PatientDirectory {
    private ArrayList<Patient> patientDirectory;

    public PatientDirectory() {
        patientDirectory= new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    public Patient addPatient(){
        Patient info =new Patient();
        patientDirectory.add(info);
        return info;
    }
    public void delete(Patient patient){
        patientDirectory.remove(patient);
        
    }
}

