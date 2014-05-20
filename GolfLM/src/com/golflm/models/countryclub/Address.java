package com.golflm.models.countryclub;

import com.golflm.models.Country;
import com.golflm.models.GPSPoint;

/**
 * Address type for country-club and players. Country and postal-code must
 * always be present as they are part of primary keys. If there is no
 * postal-code for a place, the municipality should be copied over to the
 * postal-code element.
 * 
 * @author castel
 * @version 1.0
 * 
 */
public class Address {

	private static final String DEFAULT_MUNICIPALITY = "";
	private static final String DEFAULT_REGION = "";
	private static final String DEFAULT_STREET = "";
	private static final GPSPoint DEFAULT_GPSPOINT = new GPSPoint(0.0, 0.0);
	
    private final Country country;
    private final String postalCode;
    private final String municipality;
    private final String region;
    private final String street;
    private final GPSPoint gpsPoint;

    /**
     * Use this builder for creating an Address instance.
     * Required parameters are in the constructor and optional have a dedicated method.
     * 
     * Example of use : 
     * Address a = Address.Builder("France", "86000").region("Poitou-Charente).build();
     * @author quentin
     *
     */
    public static class Builder {
    	
        private final Country country;
        private final String postalCode;
        private String municipality = DEFAULT_MUNICIPALITY;
        private String region = DEFAULT_REGION;
        private String street = DEFAULT_STREET;
        private GPSPoint gpsPoint = DEFAULT_GPSPOINT;
        
        public Builder(Country country, String postalCode){
            if (country == null | postalCode == null) {
                throw new NullPointerException(
                        "One or more parameters are null");
            }

            this.country = country;
            this.postalCode = postalCode;
        }
        
        public Builder municipality(String municipality) {
        	this.municipality = municipality;
        	return this;
        }
        
        public Builder region(String region) {
        	this.region = region;
        	return this;
        }
        
        public Builder street(String street) {
        	this.street = street;
        	return this;
        }
        
        public Builder gpsPoint(GPSPoint gpsPoint) {
        	this.gpsPoint = gpsPoint;
        	return this;
        }
        
        public Address build() {
        	return new Address(this);
        }
    }
    
    /**
     * A builder is necessary for instantiate this object. 
     * @param builder
     */
    private Address(Builder builder) {
        this.country = builder.country;
        this.postalCode = builder.postalCode;
        this.municipality = builder.municipality;
        this.region = builder.region;
        this.street = builder.street;
        this.gpsPoint = builder.gpsPoint;
    }
   

    /**
     * @return the country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * @return the municipality
     */
    public String getMunicipality() {
        return municipality;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @return the gpsPoint
     */
    public GPSPoint getGpsPoint() {
        return gpsPoint;
    }

}
