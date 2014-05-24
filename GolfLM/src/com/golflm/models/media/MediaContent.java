package com.golflm.models.media;

/**
 * A media-content is a media associated with its content
 * @author quentin
 *
 */
public class MediaContent extends MediaSkeleton {

	private final String content;

	public static class Builder extends MediaSkeleton.Builder {

		private final String content;
		
		public Builder(String name, String content) {
			super(name);
			this.content= content;
		}

		@Override
		public MediaContent build() {
			return new MediaContent(this);
		}
		
	}
	
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
