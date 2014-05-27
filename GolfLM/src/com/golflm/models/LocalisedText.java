package com.golflm.models;

import java.util.regex.Pattern;

/**
 * Simple type to add language information on comments and notes.
 * @author quentin
 *
 */
public class LocalisedText implements Comparable<LocalisedText> {

	private static final String IETF_LANG_TAG_REGEX = "[a-zA-Z]{1,8}(-[a-zA-Z0-9]{1,8})*";
	private static final Pattern IETF_LANG_TAG_PATTERN;
	static {
		IETF_LANG_TAG_PATTERN =  Pattern.compile(IETF_LANG_TAG_REGEX);
	}
	
	private final String content;
	private final String lang;
	
	/**
	 * Create a text with a language associated.
	 * Lang should respect the IETF language Tag
	 * @param lang a IETF Lang Tag
	 * @param content
	 */
	public LocalisedText(String lang, String content) {
		if(!IETF_LANG_TAG_PATTERN.matcher(lang).matches()) {
			throw new IllegalArgumentException("Lang '" + lang + "' should matches expression '" + IETF_LANG_TAG_REGEX + "'");
		}
		this.lang = lang;
		this.content = content;
	}
	
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @return the lang
	 */
	public String getLang() {
		return lang;
	}

	@Override
	public int compareTo(LocalisedText o) {
		int order = this.lang.compareTo(o.lang);
		if(order != 0) { return order;}
		order = this.content.compareTo(o.content);
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((lang == null) ? 0 : lang.hashCode());
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
		LocalisedText other = (LocalisedText) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (lang == null) {
			if (other.lang != null)
				return false;
		} else if (!lang.equals(other.lang))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LocalisedText [lang=" + lang + ", content=" + content + "]";
	}

}
