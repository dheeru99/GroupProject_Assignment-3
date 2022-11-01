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
public class VitalSign {
    private String id;
    private String doctorId;
    private String patientId;
    private Double bloodPressure;
    private Double temperature;
    private int pulse;
    private Date vistingDate;
    private VitalSignDirectory vitalSignDirectory;
    private Encounter encounter;
    public VitalSign() {
        this.vitalSignDirectory = new VitalSignDirectory();
        this.encounter= new Encounter();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    
    
    
    
    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }
    
    
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public Double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(Double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public Date getVistingDate() {
        return vistingDate;
    }

    public void setVistingDate(Date vistingDate) {
        this.vistingDate = vistingDate;
    }

    public VitalSignDirectory getVitalSignDirectory() {
        return vitalSignDirectory;
    }

    public void setVitalSignDirectory(VitalSignDirectory vitalSignDirectory) {
        this.vitalSignDirectory = vitalSignDirectory;
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }
    
    
    
    
}
