package com.cjss.model;

public class LocationModel {
    private int locationId;
    private String locationName;
    private String locationCountry;

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }

    @Override
    public String toString() {
        return "LocationModel{" +
                "locationId=" + locationId +
                ", locationName='" + locationName + '\'' +
                ", locationCountry='" + locationCountry + '\'' +
                '}';
    }
}
