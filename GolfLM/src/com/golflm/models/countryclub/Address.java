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

    protected Country country;
    protected String postalCode;
    protected String municipality;
    protected String region;
    protected String street;
    protected GPSPoint gpsPoint;

    /**
     * Create an Address with a minimum of parameters
     * 
     * @param country
     *            Country of address
     * @param postalCode
     *            Postal code of the address
     * 
     * 
     * @throws IllegalArgumentException
     *             if the specified parameters non optional is at null
     */
    public Address(Country country, String postalCode) {
        super();
        if (country == null | postalCode == null) {
            throw new IllegalArgumentException(
                    "Some of the required parameters are null. Please check the javadoc");
        }

        this.country = country;
        this.postalCode = postalCode;
    }

    /**
     * Create an Address with all parameters possible
     * 
     * Optional parameters labelled with 'OPTIONAL' could be set a null.
     * 
     * @param country
     *            Country of address
     * @param postalCode
     *            Postal code of the address
     * @param municipality
     *            Municipality of address . OPTIONAL
     * @param region
     *            Region of an address. OPTIONAL
     * @param street
     *            Street name and number of address. OPTIONAL
     * @param gpsPoint
     *            Street name and number of address. OPTIONAL
     * 
     * @throws IllegalArgumentException
     *             if the specified parameters non optional is at null
     */
    public Address(Country country, String postalCode, String municipality,
            String region, String street, GPSPoint gpsPoint) {
        this(country, postalCode);

        this.municipality = municipality;
        this.region = region;
        this.street = street;
        this.gpsPoint = gpsPoint;
    }

    /**
     * @return the country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * @param country
     *            the country to set
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * @return the municipality
     */
    public String getMunicipality() {
        return municipality;
    }

    /**
     * @param municipality
     *            the municipality to set
     */
    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode
     *            the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region
     *            the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street
     *            the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the gpsPoint
     */
    public GPSPoint getGpsPoint() {
        return gpsPoint;
    }

    /**
     * @param gpsPoint
     *            the gpsPoint to set
     */
    public void setGpsPoint(GPSPoint gpsPoint) {
        this.gpsPoint = gpsPoint;
    }

}
