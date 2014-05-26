package com.golflm.models;

/**
 * Amenety available at the country club premises. 
 * Ameneties have a type attribute to help identify the amenety.
 * @author quentin
 *
 */
public class Amenety implements Comparable<Amenety>{

	private final String content;
	
	private final AmenetyType type;
	private final String other;
	
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
    	
    	private final String content;
    	
    	private AmenetyType type;
    	private String other;
    	
    	/**
    	 * Builder with the required parameters. They can't be null or a nullPointerException will be throw
    	 * @param content
    	 */
        public Builder(String content){
            if (content == null) {
                throw new NullPointerException(
                        "content is null");
            }
        	this.content = content;
        }
        
    	/**
    	 * Set the type optional parameter
    	 * @param type
    	 * @return builder Builder is return for linked the optional parameters
    	 */
        public Builder type(AmenetyType type) {
        	this.type = type;
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
         * Build an Amenety from builder attributes
         * @return Amenety build with every builder parameters. 
         * Optional parameters unset will be setted with a default value
         */
        public Amenety build() {
        	return new Amenety(this);
        }
    }
    
    /**
     * A builder is necessary for instantiate this object. 
     * @param builder
     */
    private Amenety(Builder builder) {
    	this.content = builder.content;
    	this.type = builder.type;
    	this.other = builder.other;
    }
    
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @return the type
	 */
	public AmenetyType getType() {
		return type;
	}

	/**
	 * Alternate value for an attribute.
	 * @return the other
	 */
	public String getOther() {
		return other;
	}

	@Override
	public int compareTo(Amenety o) {
		int order = this.content.compareTo(o.content);
		if(order != 0) { return order;}
		order = this.type.compareTo(o.type);
		if(order != 0) { return order;}
		order = this.other.compareTo(o.other);
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
		result = prime * result + ((content == null) ? 0 : content.hashCode());
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
		Amenety other = (Amenety) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
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
		return "Amenety [content=" + content + ", type=" + type + ", other="
				+ other + "]";
	}

}
