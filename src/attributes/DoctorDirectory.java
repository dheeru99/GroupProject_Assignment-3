/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attributes;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author dheer
 */
public class DoctorDirectory {
     private List<Doctor> doctorDirectory;
     private Doctor doctor;
     private PatientDirectory patientDirectory;
     
     
    public DoctorDirectory() {
        this.doctorDirectory = new ArrayList<Doctor>();
        this.doctor=new Doctor();
        this.patientDirectory =new PatientDirectory();
        
    }

    public List<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(List<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    

   
    public Doctor addDoctor(){
        Doctor d =new Doctor();
        doctorDirectory.add(d);
        return d;
    }
    public void delete(Doctor doc){
        doctorDirectory.remove(doc);
        
    }

    
    
     
     
}
