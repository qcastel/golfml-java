package com.golflm.models.media;

/**
 * Skeleton : useful for implementing the Media interface. It help you for factoring codes for
 * the basic attributes of a Media
 * @author quentin
 *
 */
public abstract class MediaSkeleton implements Media {
	
	private final String name;
	private final String contentType;
	private final String other;
	private final MediaType type;
	private final String description;

	public static abstract class Builder {
		
		private final String name;
		private String contentType;
		private String other;
		private MediaType type;
		private String description;

		/**
    	 * Builder with the required parameters. They can't be null or a nullPointerException will be throw
		 * @param name
		 */
		public Builder(String name) {
			this.name = name;
		}
		
    	/**
    	 * Set the contentType optional parameter
    	 * @param contentType
    	 * @return builder Builder is return for linked the optional parameters
    	 */
		public Builder contentType(String contentType) {
			this.contentType = contentType;
			return this;
		}
		
    	/**
    	 * Set the other optional parameter
    	 * @param other
    	 * @return builder Builder is return for linked the optional parameters
    	 */
		public Builder other(String other) {
			this.other = other;
			return this;
		}
		
    	/**
    	 * Set the type optional parameter
    	 * @param type
    	 * @return builder Builder is return for linked the optional parameters
    	 */
		public Builder type(MediaType type) {
			this.type = type;
			return this;
		}
		
    	/**
    	 * Set the description optional parameter
    	 * @param description
    	 * @return builder Builder is return for linked the optional parameters
    	 */
		public Builder description(String description) {
			this.description = description;
			return this;
		}
		
		public abstract Media build();
	}
	
    /**
     * A builder is necessary for instantiate this object. 
     * @param builder
     */
	protected MediaSkeleton(Builder builder) {
		this.name = builder.name;
		this.contentType = builder.contentType;
		this.other = builder.other;
		this.type = builder.type;
		this.description = builder.description;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the contentType
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * @return the other
	 */
	public String getOther() {
		return other;
	}

	/**
	 * @return the type
	 */
	public MediaType getType() {
		return type;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((contentType == null) ? 0 : contentType.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((other == null) ? 0 : other.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		MediaSkeleton other = (MediaSkeleton) obj;
		if (contentType == null) {
			if (other.contentType != null)
				return false;
		} else if (!contentType.equals(other.contentType))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (this.other == null) {
			if (other.other != null)
				return false;
		} else if (!this.other.equals(other.other))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MediaSkeleton [name=" + name + ", contentType=" + contentType
				+ ", other=" + other + ", type=" + type + ", description="
				+ description + "]";
	}

	@Override
	public int compareTo(Media o) {
		return 0;
	}
}
