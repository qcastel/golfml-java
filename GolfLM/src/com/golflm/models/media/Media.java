package com.golflm.models.media;

/**
 * A media is a piece of multi-media information attached to either a country-club, a golf-course, a hole, a player, or a round of golf. Example of such media are:
 * country-club: Picture of club house, access map.
 * golf-course: scenic pictures of holes, yardage book...
 * hole: yardage page, pin placement chart...
 * player: picture, scan of official golf card...
 * round of golf: souvenir of a memorable golfing moment...
 * @author quentin
 *
 */
public interface Media extends Comparable<Media>{
	/**
	 * Name of the media.
	 * @return the name
	 */
	public String getName();
	/**
	 * Technical type of the media (MIME (Multipurpose Internet Mail Extensions) type of the media
	 * @return the contentType
	 */
	public String getContentType();
	/**
	 * Alternate value for an attribute.	
	 * @return the other
	 */
	public String getOther();
	/**
	 * Type of information conveyed by the media: Photograph, video, yardage book, scan of scorecard, scan of golf card, map...
	 * @return the type
	 */
	public MediaType getType();

	/**
	 * Description of the media.
	 * @return the description
	 */
	public String getDescription();
}
