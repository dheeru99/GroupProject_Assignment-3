/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attributes;

/**
 *
 * @author dheer
 */
public class SystemAdmin {
    private DoctorDirectory doctorDirectory;
    private PatientDirectory patientDirectory;
    private PersonDirectory personDirectory;
    private CommunityAdminDirectory communityAdminDirectory;
    public SystemAdmin() {
        this.doctorDirectory = new DoctorDirectory();
        this.patientDirectory = new PatientDirectory();
        this.personDirectory= new PersonDirectory();
        this.communityAdminDirectory = new CommunityAdminDirectory();
    }
    
    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public CommunityAdminDirectory getCommunityAdminDirectory() {
        return communityAdminDirectory;
    }

    public void setCommunityAdminDirectory(CommunityAdminDirectory communityAdminDirectory) {
        this.communityAdminDirectory = communityAdminDirectory;
    }
    
    
    
    
}
