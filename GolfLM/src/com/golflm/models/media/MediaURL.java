package com.golflm.models.media;

import java.net.URL;

/**
 * A media URL is a media with an associated URL to the content.
 * @author quentin
 *
 */
public class MediaURL extends MediaSkeleton {

	private final URL url;

	public static class Builder extends MediaSkeleton.Builder {

		private final URL url;
		
		public Builder(String name, URL url) {
			super(name);
			this.url= url;
		}

		@Override
		public MediaURL build() {
			return new MediaURL(this);
		}
		
	}
	
	private MediaURL(Builder builder) {
		super(builder);
		this.url = builder.url;
	}

	/**
	 * Location of the media.
	 * @return the content
	 */
	public URL getURL() {
		return url;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		MediaURL other = (MediaURL) obj;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MediaURL [url=" + url + ", media="
				+ super.toString() + "]";
	}


	
}
