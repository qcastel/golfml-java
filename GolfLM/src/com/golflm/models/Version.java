package com.golflm.models;

import java.util.Date;

/**
 * Allow for version tracking on a single element with meta-data. 
 * Element content should consists of version comments.
 * @author quentin
 *
 */
public final class Version implements Comparable<Version>{

	private final static String DEFAULT_VERSION = "1.0";
	
	private final Date created;
	private final Date updated;
	private final String version;
	
    /**
     * Use this builder for creating a Version instance.
     * Required parameters are in the constructor and optional have a dedicated method.
     * 
     * Example of use : 
     * Version v = Version.Builder().version("1.2b").build();
     * @author quentin
     *
     */
    public static class Builder {
    	
    	private Date created = new Date();
    	private Date updated = new Date();
    	private String version = DEFAULT_VERSION;
    	
    	/**
    	 * Builder for version.
    	 * Created and Updated attributed will be set at the current time. 
    	 * You can override their value by using the appropriate setter.
    	 */
    	public Builder() {
    	}
    	
    	/**
    	 * Set the created optional parameter
    	 * @param created
    	 * @return builder Builder is return for linked the optional parameters
    	 */
        public Builder created(Date created) {
        	this.created = created;
        	return this;
        }
        
        /**
    	 * Set the updated optional parameter
    	 * @param updated
    	 * @return builder Builder is return for linked the optional parameters
    	 */
        public Builder updated(Date updated) {
        	this.updated = updated;
        	return this;
        }
        
        /**
    	 * Set the version optional parameter
    	 * @param version
    	 * @return builder Builder is return for linked the optional parameters
    	 */
        public Builder version(String version) {
        	this.version = version;
        	return this;
        }
        
        /**
         * Build an Version from builder attributes
         * @return Version build with every builder parameters. 
         * Optional parameters unset will be setted with a default value
         */
        public Version build() {
        	return new Version(this);
        }
    }
    
    /**
     * A builder is necessary for instantiate this object. 
     * @param builder
     */
	private Version(Builder builder) {
		super();
		this.created = new Date(builder.created.getTime());
		this.updated = new Date(builder.updated.getTime());
		this.version = builder.version;
	}

	/**
	 * @return the created
	 */
	public Date getCreated() {
		return new Date(created.getTime());
	}

	/**
	 * @return the updated
	 */
	public Date getUpdated() {
		return new Date(updated.getTime());
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	@Override
	public int compareTo(Version o) {
		int order = this.version.compareTo(o.version);
		if(order != 0) { return order;}
		order = this.created.compareTo(o.created);
		if(order != 0) { return order;}
		order = this.updated.compareTo(o.updated);
		if(order != 0) { return order;}
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((updated == null) ? 0 : updated.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Version other = (Version) obj;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (updated == null) {
			if (other.updated != null)
				return false;
		} else if (!updated.equals(other.updated))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Version [created=" + created + ", updated=" + updated
				+ ", version=" + version + "]";
	}

}
