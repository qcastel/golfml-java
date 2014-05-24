package com.golflm.models.countryclub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.management.ImmutableDescriptor;

import com.golflm.models.Amenety;
import com.golflm.models.Contact;
import com.golflm.models.Country;
import com.golflm.models.Media;
import com.golflm.models.Note;
import com.golflm.models.UID;
import com.golflm.models.Version;
import com.golflm.models.countryclub.Address.Builder;

/**
 * A country-club is a place where we can find one or more golf courses at the
 * same location. Examples are your municipal golf course, a 9 hole pitch and
 * putt, a 36 or more hole golf courses, golf resorts, etc.
 * 
 * @author castel
 * @version 1.0
 * 
 */
public final class CountryClub {
	
	private final static UID DEFAULT_UID = null;
	private final static CountryClubType DEFAULT_OWNER_SHIP = null;
	private final static Contact DEFAULT_CONTACT = null;
	private final static Amenety DEFAULT_AMENETY = null;
	private final static Note DEFAULT_NOTE = null;
	private final static Media DEFAULT_MEDIA = null;
	private final static Version DEFAULT_VERSION = null;
	
	private final String name;
	private final Address address;
	private final List<GolfCourse> golfCourses;

    // Optional parameters

	private final UID uid;
	private final CountryClubType ownershipType;
	private final Contact contact;
	private final Amenety amenety;
	private final Note note;
	private final Media media;
	private final Version version;
	
    public static class Builder {
    	
    	private final String name;
    	private final Address address;
    	private final List<GolfCourse> golfCourses;

        // Optional parameters

    	private UID uid = DEFAULT_UID;
    	private CountryClubType ownershipType = DEFAULT_OWNER_SHIP;
    	private Contact contact = DEFAULT_CONTACT;
    	private Amenety amenety = DEFAULT_AMENETY;
    	private Note note = DEFAULT_NOTE;
    	private Media media = DEFAULT_MEDIA;
    	private Version version = DEFAULT_VERSION;
    	
    	public Builder(String name, Address address, List<GolfCourse> golfCourses){
    		if (name == null | address == null | golfCourses == null) {
                throw new NullPointerException(
                        "One or more parameters are null");
            }

            this.name = name;
            this.address = address;
            this.golfCourses = Collections.unmodifiableList(golfCourses);
        }

		public void uid(UID uid) {
			this.uid = uid;
		}

		public void ownershipType(CountryClubType ownershipType) {
			this.ownershipType = ownershipType;
		}

		public void contact(Contact contact) {
			this.contact = contact;
		}

		public void amenety(Amenety amenety) {
			this.amenety = amenety;
		}

		public void note(Note note) {
			this.note = note;
		}

		public void media(Media media) {
			this.media = media;
		}

		public void version(Version version) {
			this.version = version;
		}
        
    }

    /**
     * A builder is necessary for instantiate this object. 
     * @param builder
     */
    private CountryClub(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.golfCourses = builder.golfCourses;
        this.uid = builder.uid;
        this.ownershipType = builder.ownershipType;
        this.contact = builder.contact;
        this.amenety = builder.amenety;
        this.note = builder.note;
        this.media = builder.media;
        this.version = builder.version;
    }
   

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @return the golfCourses
     */
    public List<GolfCourse> getGolfCourses() {
        return this.golfCourses;
    }

    /**
     * @return the uid
     */
    public UID getUid() {
        return uid;
    }


    /**
     * @return the ownershipType
     */
    public CountryClubType getOwnershipType() {
        return ownershipType;
    }

    /**
     * @return the contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * @return the amenety
     */
    public Amenety getAmenety() {
        return amenety;
    }

    /**
     * @return the note
     */
    public Note getNote() {
        return note;
    }

    /**
     * @return the media
     */
    public Media getMedia() {
        return media;
    }

    /**
     * @return the version
     */
    public Version getVersion() {
        return version;
    }
}
