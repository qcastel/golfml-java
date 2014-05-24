package com.golflm.models;

/**
 * GPS point is an geographic coordinate system representation,
 *  representing by a couple of two double (latitude, longitude)
 * @author castel
 *
 */
public final class GPSPoint implements Comparable<GPSPoint>{

	private final double latitude;
    private final double longitude;
    
    /**
     * GPS point in a geographic system
     * @param latitude
     * @param longitude
     */
    public GPSPoint(double latitude, double longitude) {
        super();
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * @return the latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * @return the longitude
     */
    public double getLongitude() {
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
		long temp;
		temp = Double.doubleToLongBits(latitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (Double.doubleToLongBits(latitude) != Double
				.doubleToLongBits(other.latitude))
			return false;
		if (Double.doubleToLongBits(longitude) != Double
				.doubleToLongBits(other.longitude))
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
