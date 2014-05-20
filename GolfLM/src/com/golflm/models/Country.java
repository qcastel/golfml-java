package com.golflm.models;

/**
 * Country name in address element.
 *  A country element must include an unambiguous country ISO 3166 2 letter code.
 * @author castel
 * @version 1.0
 *
 */
public class Country implements Comparable<Country>{

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

	@Override
	public int compareTo(Country o) {
		return code.compareTo(o.code);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
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
		Country other = (Country) obj;
		if (code != other.code)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + "]";
	}

    
}
