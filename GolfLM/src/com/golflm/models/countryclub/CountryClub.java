package com.golflm.models.countryclub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.management.ImmutableDescriptor;

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
public class CountryClub {

    protected String name;
    protected Address address;
    protected List<GolfCourse> golfCourses;

    // Optional parameters

    protected UID uid;
    protected CountryClubType ownershipType;
    protected Contact contact;
    protected Amenety amenety;
    protected Note note;
    protected Media media;
    protected Version version;
    
    /**
     * Construct a CountryClub with a minimum of parameters
     * 
     * @param name
     *            Name of the country club.
     * @param address
     *            Address of the country club or golf course.
     * @param golfCourses
     *            Description of golf courses at the country club
     *            WARNING : This list will be copied in another one.

     * @throws IllegalArgumentException if the specified parameters non optional is at null
     */
    public CountryClub(String name, Address address,
            List<GolfCourse> golfCourses) {
        super();
        if (name == null | address == null | golfCourses == null) {
            throw new IllegalArgumentException(
                    "Some of the required parameters are null. Please check the javadoc");
        }
        this.name = name;
        this.address = address;
        this.golfCourses = new ArrayList<GolfCourse>(golfCourses);
    }
    
    /**
     * Construct a CountryClub with all parameters possible. 
     * Optional parameters labelled with 'OPTIONAL' could be set a null.
     * 
     * @param name
     *            Name of the country club.
     * @param address
     *            Address of the country club or golf course.
     * @param golfCourses
     *            Description of golf courses at the country club.
     *            WARNING : This list will be copied in another one.
     * @param uid
     *            Unique identifier for an application. OPTIONAL
     * @param ownershipType
     *            Name of the country club.
     * @param contact
     *            Contact for the golf course
     * @param amenety
     *            Amenety available at the country club
     * @param note
     *            Note about the country club.
     * @param media
     *            Media for the country club
     * @param version
     *            version of this instance
     * @throws IllegalArgumentException if the specified parameters non optional is at null
     */
    public CountryClub(String name, Address address,
            List<GolfCourse> golfCourses, UID uid,
            CountryClubType ownershipType, Contact contact, Amenety amenety,
            Note note, Media media, Version version) {
        this(name, address, golfCourses);

        this.uid = uid;
        this.ownershipType = ownershipType;
        this.contact = contact;
        this.amenety = amenety;
        this.note = note;
        this.media = media;
        this.version = version;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * @return the golfCourses
     */
    public List<GolfCourse> getGolfCourses() {
        return this.golfCourses;
    }

    /**
     * @param golfCourse
     *            the golfCourses to set
     */
    public void setGolfCourses(List<GolfCourse> golfCourse) {
        this.golfCourses = golfCourse;
    }

    /**
     * @return the uid
     */
    public UID getUid() {
        return uid;
    }

    /**
     * @param uid
     *            the uid to set
     */
    public void setUid(UID uid) {
        this.uid = uid;
    }

    /**
     * @return the ownershipType
     */
    public CountryClubType getOwnershipType() {
        return ownershipType;
    }

    /**
     * @param ownershipType
     *            the ownershipType to set
     */
    public void setOwnershipType(CountryClubType ownershipType) {
        this.ownershipType = ownershipType;
    }

    /**
     * @return the contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * @param contact
     *            the contact to set
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * @return the amenety
     */
    public Amenety getAmenety() {
        return amenety;
    }

    /**
     * @param amenety
     *            the amenety to set
     */
    public void setAmenety(Amenety amenety) {
        this.amenety = amenety;
    }

    /**
     * @return the note
     */
    public Note getNote() {
        return note;
    }

    /**
     * @param note
     *            the note to set
     */
    public void setNote(Note not) {
        this.note = not;
    }

    /**
     * @return the media
     */
    public Media getMedia() {
        return media;
    }

    /**
     * @param media
     *            the media to set
     */
    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * @return the version
     */
    public Version getVersion() {
        return version;
    }

    /**
     * @param version
     *            the version to set
     */
    public void setVersion(Version version) {
        this.version = version;
    }

}
