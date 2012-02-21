/**
 * 
 */
package de.eorg.continuouscloudmigration.cloudmapping.model.mapping;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mugglmenzel
 * 
 */
public abstract class Appliance implements IAttributedItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5718934871710445135L;

	/**
	 * @uml.property  name="name"
	 */
	private String name;

	/**
	 * @uml.property  name="attributes"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="de.eorg.cumulusgenius.shared.cloudmapping.model.mapping.Attribute"
	 */
	private Set<Attribute<?>> attributes = new HashSet<Attribute<?>>();

	public Appliance(String name) {
		super();
		this.name = name;
	}

	public Appliance(String name, Set<Attribute<?>> attributes) {
		super();
		this.name = name;
		this.attributes = attributes;
	}

	public void setAttributes(Set<Attribute<?>> attributes) {
		this.attributes = attributes;
	}

	/**
	 * @param name  the name to set
	 * @uml.property  name="name"
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return  the name
	 * @uml.property  name="name"
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the attributes
	 */
	public Set<Attribute<?>> getAttributes() {
		return attributes;
	}

	public Attribute<?> getAttribute(IEAttribute attributeName) {
		for (Attribute<?> a : getAttributes())
			if (a.getName().equals(attributeName))
				return a;
		return null;
	}

	public int compareTo(IAttributedItem o) {
		return ((o.getAttributes() != null && o.getAttributes() != null) ? getAttributes()
				.size() - o.getAttributes().size()
				: (getAttributes() != null ? 1 : -1));
	}

}
