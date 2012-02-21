/**
 * 
 */
package de.eorg.continuouscloudmigration.cloudmapping.model.mapping.requirements;

/**
 * @author mugglmenzel
 *
 */
public class RequirementItem<T> implements IRequirementItem<T> {

	
	/**
	 * @uml.property  name="value"
	 */
	private Comparable<T> value;
	
	/**
	 * 
	 */
	public RequirementItem(Comparable<T> value) {
		super();
		this.value = value;
	}

	public int compareTo(T o) {
		return getValue().compareTo(o);
	}


	public Comparable<T> getValue() {
		return value;
	}

}
