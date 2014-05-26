package com.golflm.models.media;

/**
 * A media-content is a media associated with its content
 * @author quentin
 *
 */
public class MediaContent extends MediaSkeleton {

	private final String content;

    /**
     * Use this builder for creating an MediaContent instance.
     * Required parameters are in the constructor and optional have a dedicated method.
     * 
     * Example of use : 
     * Address a = MediaContent.Builder("file name", "content...").type(MediaType.VIDEO).build();
     * @author quentin
     *
     */
	public static class Builder extends MediaSkeleton.BuilderSkeleton {

		private final String content;
		
		/**
    	 * Builder with the required parameters. 
    	 * They can't be null or a nullPointerException will be throw
		 * @param name
		 * @param content
		 */
		public Builder(String name, String content) {
			super(name);
            if (content == null) {
                throw new NullPointerException(
                        "content is null");
            }
			this.content= content;
		}

		@Override
		public MediaContent build() {
			return new MediaContent(this);
		}
		
	}
	
    /**
     * A builder is necessary for instantiate this object. 
     * @param builder
     */
	private MediaContent(Builder builder) {
		super(builder);
		this.content = builder.content;
	}

	/**
	 * Base64-coded content of the media
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		MediaContent other = (MediaContent) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MediaContent [content=" + content + ", media="
				+ super.toString() + "]";
	}


	
}
