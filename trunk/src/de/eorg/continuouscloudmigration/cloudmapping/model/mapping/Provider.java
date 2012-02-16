/**
 * 
 */
package de.eorg.continuouscloudmigration.cloudmapping.model.mapping;

/**
 * @author mugglmenzel
 *
 */
public class Provider {

	/**
	 * @uml.property  name="name"
	 */
	private String name;
	
	/**
	 * @param name
	 */
	public Provider(String name) {
		super();
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
	 * @param name  the name to set
	 * @uml.property  name="name"
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
