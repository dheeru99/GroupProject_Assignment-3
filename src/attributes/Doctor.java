/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attributes;

import java.util.Date;

/**
 *
 * @author dheer
 */
public class Doctor {
    private String doctorName;
    private String doctorId;
    private String hosiptalId;
    private Date joiningDate;
    private int experience;
    private VitalSign vitalSign;
    private HospitalDirectory hospitalDirectory;
    private PatientDirectory patientDirectory;
    public Doctor() {
        this.vitalSign = new VitalSign();
        this.hospitalDirectory= new HospitalDirectory();
        this.patientDirectory= new PatientDirectory();
    }
    
    

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public String getHosiptalId() {
        return hosiptalId;
    }

    public void setHosiptalId(String hosiptalId) {
        this.hosiptalId = hosiptalId;
    }
    
    
    

    

    @Override
    public String toString() {
        return ("D00"+doctorId);
    }
    
    
    
    
    
    
}
