package com.golflm.models;

import java.util.HashMap;
import java.util.Map;


/**
 * The rating type defines a standard, generic, evaluation criteria for golfml entities.
 * Rating is limited to 0 to 5 "stars". Decimal faction allowed.
 * @author quentin
 *
 */
public class Rating implements Comparable<Rating>{
	
	private final static int UPPER_BOUND = 5;
	private static Map<Float, Rating> CACHE_RATINGS = new HashMap<Float, Rating>();
	
	static {
		//Initialize a rating cache with the most common rating.
		float ratingValue = 0;
		
		while(ratingValue <= UPPER_BOUND) {
			
			CACHE_RATINGS.put(ratingValue, new Rating(ratingValue));
			ratingValue += 0.5;
		}
	}
		
	private final float rating;
	
	
	/**
	 * Create a rate. Rate should respect this regular expression : [0-5]{0,1}(\.[0-9]{1,1})?
	 * NB : Rate will be check and round 
	 * @param rate
	 */
	public static Rating createRating(float rating) {
		
		if(rating < 0 | UPPER_BOUND < rating) {
			throw new IllegalArgumentException("rate should be comprise in [0, " + UPPER_BOUND + "]");
		}
		rating = Math.round(rating * 10) / 10;
		
		if(CACHE_RATINGS.containsKey(rating)) {
			return CACHE_RATINGS.get(rating);
		}
		return new Rating(rating);
	}
	
	private Rating(float rating) {
		this.rating = rating;
	}

	/**
	 * @return the rate
	 */
	public float getRating() {
		return rating;
	}

	@Override
	public int compareTo(Rating o) {
		return Float.compare(rating, o.rating);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(rating);
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
		Rating other = (Rating) obj;
		if (Float.floatToIntBits(rating) != Float.floatToIntBits(other.rating))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rating [rating=" + rating + "]";
	}
	
}
