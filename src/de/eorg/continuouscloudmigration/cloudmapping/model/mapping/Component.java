package de.eorg.continuouscloudmigration.cloudmapping.model.mapping;

import java.util.HashSet;
import java.util.Set;

public class Component {

	/**
	 * @uml.property  name="name"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="de.eorg.cumulusgenius.shared.cloudmapping.model.mapping.Component"
	 */
	private String name;
	
	/**
	 * @uml.property  name="connectedComponents"
	 */
	private Set<Component> connectedComponents;
	
	//public Set<Attribute> attributes;
	

	public Component(String name) {
		this(name, new HashSet<Component>());
	}
	
	/**
	 * @param name
	 */
	public Component(String name, Set<Component> connected) {
		super();
		this.name = name;
		this.setConnectedComponents(connected);
	}

	/**
	 * @return  the name
	 * @uml.property  name="name"
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name  the name to set
	 * @uml.property  name="name"
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getName();
	}

	/**
	 * @param requiredComponents the requiredComponents to set
	 */
	public void setConnectedComponents(Set<Component> requiredComponents) {
		this.connectedComponents = requiredComponents;
	}

	/**
	 * @return the requiredComponents
	 */
	public Set<Component> getConnectedComponents() {
		return connectedComponents != null ? connectedComponents : new HashSet<Component>();
	}
	
	
	
}
