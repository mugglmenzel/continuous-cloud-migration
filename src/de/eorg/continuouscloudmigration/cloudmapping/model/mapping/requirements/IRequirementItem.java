/**
 * 
 */
package de.eorg.continuouscloudmigration.cloudmapping.model.mapping.requirements;

/**
 * @author mugglmenzel
 * @param <T>
 * 
 */
public interface IRequirementItem<T> extends Comparable<T> {

	public Comparable<T> getValue();

}
