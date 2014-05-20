package com.golflm.models;

/**
 * GPS point is an geographic coordinate system representation,
 *  representing by a couple of two double (latitude, longitude)
 * @author castel
 *
 */
public class GPSPoint implements Comparable<GPSPoint>{

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
     * @return the longitude
     */
    public Double getLongitude() {
        return longitude;
    }

	@Override
	public int compareTo(GPSPoint o) {
		int order = Double.compare(latitude, o.latitude);
		if(order != 0) { return order;} 
		order = Double.compare(longitude, o.longitude);
		if(order != 0) { return order;} 
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result
				+ ((longitude == null) ? 0 : longitude.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GPSPoint other = (GPSPoint) obj;
		if (latitude == null) {
			if (other.latitude != null)
				return false;
		} else if (!latitude.equals(other.latitude))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		return true;
	}

	/**
	 * Return a description of a GPS Point.
	 * The string consists of two double represented like a couple.
	 * The first double will be the latitude and the second one the longitude.
	 * "(X, Y)" where X is latitude, Y is longitude.
	 * This two doubles will have a precision maximum of 3 digits.
	 * Example : "(46.585, 0.344)"
	 * 
	 */
	@Override
	public String toString() {
		return String.format("(%3f, %3f)", latitude, longitude);
	}
    
    
}
