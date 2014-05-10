package com.golflm.models;

/**
 * GPS point is an geographic coordinate system representation,
 *  representing by a couple of two double (latitude, longitude)
 * @author castel
 *
 */
public class GPSPoint {

    protected Double latitude;
    protected Double longitude;
    
    /**
     * GPS point in a geographic system
     * @param latitude
     * @param longitude
     */
    public GPSPoint(Double latitude, Double longitude) {
        super();
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * @return the latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    
    
}
