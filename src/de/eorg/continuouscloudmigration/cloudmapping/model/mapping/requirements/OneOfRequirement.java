/**
 * 
 */
package de.eorg.continuouscloudmigration.cloudmapping.model.mapping.requirements;

import java.util.SortedSet;

import de.eorg.continuouscloudmigration.cloudmapping.model.mapping.IEAttribute;

/**
 * @author mugglmenzel
 * @param <T>
 *
 */
public class OneOfRequirement<T> extends Requirement<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -281977232271734055L;

	public OneOfRequirement(String name,
			IEAttribute attribute, SortedSet<IRequirementItem<T>> values) {
		super(name, RequirementType.ONEOUTOF, attribute, values);
	}

	@Override
	public boolean checkValue(T item) {
		return getValues().contains(item);
	}

}
