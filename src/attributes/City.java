/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attributes;

/**
 *
 * @author dheer
 */
public class City {
    private String id;
    private String cityId;
    private String cityName;
    private CityHistory cityHistory;
    private Community community;
    public City() {
        cityHistory= new CityHistory();
        community = new Community();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public CityHistory getCityHistory() {
        return cityHistory;
    }

    public void setCityHistory(CityHistory cityHistory) {
        this.cityHistory = cityHistory;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    @Override
    public String toString() {
        return "C00"+cityId ;
    }
    
    
    
}
