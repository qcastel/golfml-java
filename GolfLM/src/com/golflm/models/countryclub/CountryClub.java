package com.golflm.models.countryclub;

import java.util.Collections;
import java.util.List;

import com.golflm.models.Amenety;
import com.golflm.models.Contact;
import com.golflm.models.Media;
import com.golflm.models.Note;
import com.golflm.models.UID;
import com.golflm.models.Version;

/**
 * A country-club is a place where we can find one or more golf courses at the
 * same location. Examples are your municipal golf course, a 9 hole pitch and
 * putt, a 36 or more hole golf courses, golf resorts, etc.
 * 
 * @author castel
 * @version 1.0
 * 
 */
public final class CountryClub implements Comparable<CountryClub>{
	
	//TODO Maybe having better default values will be great
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
	
    /**
     * Use this builder for creating a CountryClub instance.
     * Required parameters are in the constructor and optional have a dedicated method.
     * 
     * Example of use : 
     * CountryClub c = CountryClub.Builder("Chipping Sodbury", chipSodAddress, chipSodGolfCourses).contact(chipSodContact).build();
     * @author quentin
     *
     */
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
    	
    	/**
    	 * Builder with the required parameters. They can't be null or a nullPointerException will be throw
    	 * @param name
    	 * @param address
    	 * @param golfCourses
    	 */
    	public Builder(String name, Address address, List<GolfCourse> golfCourses){
    		if (name == null | address == null | golfCourses == null) {
                throw new NullPointerException(
                        "One or more parameters are null");
            }

            this.name = name;
            this.address = address;
            this.golfCourses = Collections.unmodifiableList(golfCourses);
        }

    	/**
    	 * Set the UID optional parameter
    	 * @param uid
    	 * @return builder Builder is return for linked the optional parameters
    	 */
		public Builder uid(UID uid) {
			this.uid = uid;
			return this;
		}
		
    	/**
    	 * Set the ownershipType optional parameter
    	 * @param ownershipType
    	 * @return builder Builder is return for linked the optional parameters
     	 */
		public Builder ownershipType(CountryClubType ownershipType) {
			this.ownershipType = ownershipType;
			return this;
		}

		/**
    	 * Set the contact optional parameter
		 * @param contact
    	 * @return builder Builder is return for linked the optional parameters
		 */
		public Builder contact(Contact contact) {
			this.contact = contact;
			return this;
		}
		
		/**
    	 * Set the amenety optional parameter
		 * @param amenety
    	 * @return builder Builder is return for linked the optional parameters
		 */
		public Builder amenety(Amenety amenety) {
			this.amenety = amenety;
			return this;
		}
		
		/**
    	 * Set the note optional parameter
		 * @param note
    	 * @return builder Builder is return for linked the optional parameters
		 */
		public Builder note(Note note) {
			this.note = note;
			return this;
		}
		
		/**
    	 * Set the media optional parameter
		 * @param media
    	 * @return builder Builder is return for linked the optional parameters
		 */
		public Builder media(Media media) {
			this.media = media;
			return this;
		}
		
		/**
    	 * Set the version optional parameter
		 * @param version
    	 * @return builder Builder is return for linked the optional parameters
		 */
		public Builder version(Version version) {
			this.version = version;
			return this;
		}
        
        /**
         * Build an CountryClub from builder attributes
         * @return CountryClub build with every builder parameters. 
         * Optional parameters unset will be setted with a default value
         */
		public CountryClub build() {
			return new CountryClub(this);
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

	@Override
	public String toString() {
		return "CountryClub [name=" + name + ", address=" + address
				+ ", golfCourses=" + golfCourses + ", uid=" + uid
				+ ", ownershipType=" + ownershipType + ", contact=" + contact
				+ ", amenety=" + amenety + ", note=" + note + ", media="
				+ media + ", version=" + version + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((amenety == null) ? 0 : amenety.hashCode());
		result = prime * result + ((contact == null) ? 0 : contact.hashCode());
		result = prime * result
				+ ((golfCourses == null) ? 0 : golfCourses.hashCode());
		result = prime * result + ((media == null) ? 0 : media.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result
				+ ((ownershipType == null) ? 0 : ownershipType.hashCode());
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryClub other = (CountryClub) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (amenety == null) {
			if (other.amenety != null)
				return false;
		} else if (!amenety.equals(other.amenety))
			return false;
		if (contact == null) {
			if (other.contact != null)
				return false;
		} else if (!contact.equals(other.contact))
			return false;
		if (golfCourses == null) {
			if (other.golfCourses != null)
				return false;
		} else if (!golfCourses.equals(other.golfCourses))
			return false;
		if (media == null) {
			if (other.media != null)
				return false;
		} else if (!media.equals(other.media))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (ownershipType != other.ownershipType)
			return false;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

	@Override
	public int compareTo(CountryClub o) {
		int order = this.name.compareTo(o.name);
		if(order != 0) { return order;}
		order = this.address.compareTo(o.address);
		if(order != 0) { return order;}
		if(this.golfCourses.size() < o.golfCourses.size()) { return -1;}
		if(this.golfCourses.size() > o.golfCourses.size()) { return 1;}
		
		for(int i = 0; i < golfCourses.size(); i++) {
			order = this.golfCourses.get(i).compareTo(o.golfCourses.get(i));
			if(order != 0) { return order;}
		}

		if(order != 0) { return order;}
		order = this.contact.compareTo(o.contact);
		if(order != 0) { return order;}
		order = this.amenety.compareTo(o.amenety);
		if(order != 0) { return order;}
		order = this.note.compareTo(o.note);
		if(order != 0) { return order;}
		order = this.media.compareTo(o.media);
		if(order != 0) { return order;}
		order = this.version.compareTo(o.version);
		if(order != 0) { return order;}
		return 0;
	}

}
