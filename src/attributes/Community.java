/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attributes;

/**
 *
 * @author dheer
 */
public class Community {
    
   private String communityId;
   private String communityName;
   private String cityId;
   private String patientId;
   private String patientName;
   private String address;
   private String postalCode;
   private String hospitalName;
   private CommunityHistory communityHistory;
   private House house;
   private CommunityAdminDirectory communityAdminDirectory;

    public Community() {
   communityHistory= new CommunityHistory();
   house= new House();
   communityAdminDirectory= new CommunityAdminDirectory();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
    
    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    
    
    
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
   
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public CommunityHistory getCommunityHistory() {
        return communityHistory;
    }

    public void setCommunityHistory(CommunityHistory communityHistory) {
        this.communityHistory = communityHistory;
    }

    public CommunityAdminDirectory getCommunityAdminDirectory() {
        return communityAdminDirectory;
    }

    public void setCommunityAdminDirectory(CommunityAdminDirectory communityAdminDirectory) {
        this.communityAdminDirectory = communityAdminDirectory;
    }

    
    
    @Override
    public String toString() {
        return "CM0"+communityId;
    }
    
    
   
}
