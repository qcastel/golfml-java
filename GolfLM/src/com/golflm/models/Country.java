package com.golflm.models;

/**
 * Country name in address element.
 *  A country element must include an unambiguous country ISO 3166 2 letter code.
 * @author castel
 * @version 1.0
 *
 */
public class Country {

    protected ISO3166CountryCode code;

    /**
     * Constructor with a unique code, based on ISO 3166
     * @param code 2 letter code
     */
    public Country(ISO3166CountryCode code) {
        super();
        this.code = code;
    }

    /**
     * @return the code
     */
    public ISO3166CountryCode getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(ISO3166CountryCode code) {
        this.code = code;
    }
    

}
