package com.golflm.models;

import java.util.HashMap;
import java.util.Map;

/**
 * Allow an application to insert a unique identifier for a GolfML entity. 
 * Allows for serialization of surrogate keys to maintain and enforce referential integrity in databases. Several different applications can each have their own UID for a GolfML entitiy.
 * @author quentin
 *
 */
public final class UID {
	
	private final String applicationDotname;

	private final static Map<String, UID> UID_CACHE = new HashMap<String, UID>();
	
	private UID(String applicationDotname) {
		super();
		this.applicationDotname = applicationDotname;
	}

	public static UID getUID(String applicationDotname) {
		if(!UID_CACHE.containsKey(applicationDotname)) {
			UID_CACHE.put(applicationDotname, new UID(applicationDotname));
		}
		return UID_CACHE.get(applicationDotname);
	}

	public String getApplicationDotname() {
		return applicationDotname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((applicationDotname == null) ? 0 : applicationDotname
						.hashCode());
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
		UID other = (UID) obj;
		if (applicationDotname == null) {
			if (other.applicationDotname != null)
				return false;
		} else if (!applicationDotname.equals(other.applicationDotname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UID [applicationDotname=" + applicationDotname + "]";
	}
	
	
}
