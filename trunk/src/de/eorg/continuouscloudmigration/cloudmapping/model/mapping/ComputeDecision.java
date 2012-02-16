/**
 * 
 */
package de.eorg.continuouscloudmigration.cloudmapping.model.mapping;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import de.eorg.continuouscloudmigration.cloudmapping.model.ahp.configuration.Alternative;
import de.eorg.continuouscloudmigration.cloudmapping.model.ahp.configuration.Decision;
import de.eorg.continuouscloudmigration.cloudmapping.model.mapping.requirements.Requirement;

/**
 * @author mugglmenzel
 * 
 */
public class ComputeDecision extends Decision {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7722924479698464974L;

	// private ComputeService computeService;

	/**
	 * @uml.property  name="fctRequirements"
	 */
	private Set<Requirement<?>> fctRequirements = new HashSet<Requirement<?>>();
	// Set<Goal> nonFctGoals;
	// Set<GoalImportance> goalImportance;
	/**
	 * @uml.property  name="computeServiceAlternatives"
	 */
	private Set<ComputeServiceAlternative> computeServiceAlternatives = new HashSet<ComputeServiceAlternative>();

	/**
	 * @uml.property  name="validMapping"
	 */
	public boolean validMapping = false;

	public ComputeDecision() {
		super();
	}

	public Set<Requirement<?>> getFctRequirements() {
		return fctRequirements;
	}

	public void setFctRequirements(Set<Requirement<?>> fctRequirements) {
		this.fctRequirements = fctRequirements;
	}

	@Deprecated
	public void setAlternatives(List<Alternative> alternatives) {
		super.setAlternatives(alternatives);
	}

	@Deprecated
	public List<Alternative> getAlternatives() {
		return super.getAlternatives();
	}

	/**
	 * @return the computeServiceAlternatives
	 */
	public Set<ComputeServiceAlternative> getComputeServiceAlternatives() {
		return computeServiceAlternatives;
	}

	/**
	 * @param computeServiceAlternatives
	 *            the computeServiceAlternatives to set
	 */
	public void setComputeServiceAlternatives(
			Set<ComputeServiceAlternative> computeServiceAlternatives) {
		this.computeServiceAlternatives = computeServiceAlternatives;
	}

	/**
	 * @return
	 * @uml.property  name="validMapping"
	 */
	public boolean isValidMapping() {
		return validMapping;
	}

	/*
	 * Die Methode reqCheck mapped die Attribute auf die Requirements und prüft
	 * diese so auf Erfüllung.
	 */
	// TODO: später als universelle Klasse/Methode einarbeiten, da
	// ApplianceDecision ebenfalls Att. auf Requ. mapped
	public void reqCheck() {

		for (Requirement r : fctRequirements)
			for (ComputeServiceAlternative a : getComputeServiceAlternatives()) {
				System.out.println("checking "
						+ a
						+ ", result: "
						+ r.checkValue(a.getComputeService()
								.getAttribute(r.getAttributeName()).getValue()));
			}
	}
}
