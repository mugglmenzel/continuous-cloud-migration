/**
 * 
 */
package de.eorg.continuouscloudmigration.cloudmapping.model.mapping;

import de.eorg.continuouscloudmigration.cloudmapping.model.ahp.configuration.Alternative;

/**
 * @author mugglmenzel
 *
 */
public class ApplianceAlternative extends Alternative {

	/**
	 * @uml.property  name="appl"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Appliance appl;
	
	public ApplianceAlternative(Appliance appl, String name) {
		this.setAppl(appl);
		setName(name);
	}

	/**
	 * @param appl  the appl to set
	 * @uml.property  name="appl"
	 */
	public void setAppl(Appliance appl) {
		this.appl = appl;
	}

	/**
	 * @return  the appl
	 * @uml.property  name="appl"
	 */
	public Appliance getAppl() {
		return appl;
	}
}
