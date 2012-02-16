/**
 * 
 */
package de.eorg.continuouscloudmigration.cloudmapping.model.mapping;

import de.eorg.continuouscloudmigration.cloudmapping.model.ahp.configuration.Alternative;

/**
 * @author mugglmenzel
 * 
 */
public class ComputeServiceAlternative extends Alternative {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6431007114719302435L;
	
	/**
	 * @uml.property  name="computeService"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private ComputeService computeService;

	public ComputeServiceAlternative(ComputeService cs, String name) {
		setComputeService(cs);
		setName(name);
	}

	/**
	 * @return  the computeService
	 * @uml.property  name="computeService"
	 */
	public ComputeService getComputeService() {
		return computeService;
	}

	/**
	 * @param computeService  the computeService to set
	 * @uml.property  name="computeService"
	 */
	public void setComputeService(ComputeService computeService) {
		this.computeService = computeService;
	}

}
