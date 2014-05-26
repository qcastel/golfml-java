package com.golflm.models;

import java.util.Date;

/**
 * Generic type for addition of comments and/or rating. 
 * The text of the note is localised to a language.
 * @author quentin
 *
 */
public class Note implements Comparable<Note> {

	private static final Rating DEFAULT_RATING = null;
	
	private final LocalisedText comment;

	private final Date date;
	private final Rating rating;
	
	/**
     * Use this builder for creating an Note instance.
     * Required parameters are in the constructor and optional have a dedicated method.
     * 
     * Example of use : 
     * Note n = Note.Builder("Superb !").rating(5.0).build();
     * @author quentin
     *
     */
	public static class Builder {
		
		private final LocalisedText comment;

		private Date date;
		private Rating rating;
		
		/**
    	 * Builder with the required parameters. 
    	 * They can't be null or a nullPointerException will be throw
    	 * The optional date parameter will be set to the current date
    	 * but could be overridden with the appropriate setter.
		 * @param comment
		 */
		public Builder(LocalisedText comment) {
			if (comment == null) {
				throw new NullPointerException(
						"comment is null");
			}

			this.comment = comment;
			this.date = new Date();
			this.rating = DEFAULT_RATING;
		}

    	/**
    	 * Set the date optional parameter
    	 * @param date
    	 * @return builder Builder is return for linked the optional parameters
    	 */
		public Builder date(Date date) {
			this.date = new Date(date.getTime());
			return this;
		}

    	/**
    	 * Set the rating optional parameter
    	 * @param rating
    	 * @return builder Builder is return for linked the optional parameters
    	 */
		public Builder rating(Rating rating) {
			this.rating = rating;
			return this;
		}
		
	    /**
         * Build a Note from builder attributes
         * @return Note builds with every builder parameters. 
         * Optional parameters unset will be setted with a default value
         */
		public Note build() {
			return new Note(this);
		}
	}
	
    /**
     * A builder is necessary for instantiate this object. 
     * @param builder
     */
	private Note(Builder builder){
		
		this.comment = builder.comment;
		this.date = builder.date;
		this.rating = builder.rating;
	}

	/**
	 * Localised, textual comment about the parent entitiy.
	 * @return the comment
	 */
	public LocalisedText getComment() {
		return comment;
	}

	/**
	 * Date of issue of the comment.
	 * @return the date
	 */
	public Date getDate() {
		return new Date(this.date.getTime());
	}

	/**
	 * Simple rating of the parent entitiy
	 * @return the rating
	 */
	public Rating getRating() {
		return rating;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
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
		Note other = (Note) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Note [comment=" + comment + ", date=" + date + ", rating="
				+ rating + "]";
	}

	@Override
	public int compareTo(Note o) {
		int order = this.rating.compareTo(o.rating);
		if(order != 0) { return order;}
		order = this.date.compareTo(o.date);
		if(order != 0) { return order;}
		order = this.comment.compareTo(o.comment);
		return 0;
	}

}
