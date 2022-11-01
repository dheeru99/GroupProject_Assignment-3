/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attributes;

/**
 *
 * @author dheer
 */
public class House {
    private String patientId;
    private String houseNumber;
    private String communityId;
    private HouseHistory houseHistory;

    public House() {
        houseHistory = new HouseHistory();
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }
    
    
    
    
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public HouseHistory getHouseHistory() {
        return houseHistory;
    }

    public void setHouseHistory(HouseHistory houseHistory) {
        this.houseHistory = houseHistory;
    }

    @Override
    public String toString() {
        return "H0"+houseNumber;
    }
    
    
    
    
}
