/**
 * 
 */
package de.eorg.continuouscloudmigration.cloudmapping.model.mapping;

/**
 * @author mugglmenzel
 * 
 */
public class CombinationTotalValue extends AbstractAttributedItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5416572223175191060L;

	/**
	 * @uml.property  name="appliance"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Appliance appliance;

	/**
	 * @uml.property  name="service"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private ComputeService service;

	/**
	 * @uml.property  name="totalValue"
	 */
	private Double totalValue = 0D;

	public CombinationTotalValue(Appliance appliance, ComputeService service,
			Double totalValue) {
		super();
		this.appliance = appliance;
		this.service = service;
		this.setTotalValue(totalValue);
	}

	/**
	 * @return  the appliance
	 * @uml.property  name="appliance"
	 */
	public Appliance getAppliance() {
		return appliance;
	}

	/**
	 * @param appliance  the appliance to set
	 * @uml.property  name="appliance"
	 */
	public void setAppliance(Appliance appliance) {
		this.appliance = appliance;
	}

	/**
	 * @return  the service
	 * @uml.property  name="service"
	 */
	public ComputeService getService() {
		return service;
	}

	/**
	 * @param service  the service to set
	 * @uml.property  name="service"
	 */
	public void setService(ComputeService service) {
		this.service = service;
	}

	
	
	/**
	 * @return  the totalValue
	 * @uml.property  name="totalValue"
	 */
	public Double getTotalValue() {
		return totalValue;
	}

	/**
	 * @param totalValue  the totalValue to set
	 * @uml.property  name="totalValue"
	 */
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	@Override
	public int compareTo(IAttributedItem o) {
		return o == null ? (this == null ? 0 : 1)
				: ((o instanceof CombinationTotalValue) ? getTotalValue()
						.compareTo(((CombinationTotalValue) o).getTotalValue())
						: super.compareTo(o));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[(" + getAppliance().getName() + ", " + getService().getName()
				+ "), " + getTotalValue() + "]";
	}

}
