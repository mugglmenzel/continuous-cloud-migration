/**
 * 
 */
package de.eorg.continuouscloudmigration.cloudmapping.model.mapping;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author mugglmenzel
 * 
 */
public abstract class AbstractAttributedItem implements IAttributedItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2650872196579507357L;
	
	/**
	 * @uml.property  name="attributes"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="de.eorg.cumulusgenius.shared.cloudmapping.model.mapping.Attribute"
	 */
	private Set<Attribute<?>> attributes = new TreeSet<Attribute<?>>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(IAttributedItem o) {
		return ((o.getAttributes() != null && o.getAttributes() != null) ? getAttributes()
				.size() - o.getAttributes().size()
				: (getAttributes() != null ? 1 : -1));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.collaboration.cloudmapping.model.mapping.IAttributedItem#getAttribute
	 * (org.collaboration.cloudmapping.model.mapping.EAttribute)
	 */
	public Attribute<?> getAttribute(IEAttribute attributeName) {
		for (Attribute<?> a : getAttributes())
			if (a.getName().equals(attributeName))
				return a;
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.collaboration.cloudmapping.model.mapping.IAttributedItem#getAttributes
	 * ()
	 */
	public Set<Attribute<?>> getAttributes() {
		return attributes;
	}

}
