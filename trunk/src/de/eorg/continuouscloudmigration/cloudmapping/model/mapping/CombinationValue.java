/**
 * 
 */
package de.eorg.continuouscloudmigration.cloudmapping.model.mapping;

/**
 * @author mugglmenzel
 * 
 */
public class CombinationValue extends AbstractAttributedItem {

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
	 * @uml.property  name="applianceValue"
	 */
	private Double applianceValue = 0D;

	/**
	 * @uml.property  name="serviceValue"
	 */
	private Double serviceValue = 0D;

	public CombinationValue(Appliance appliance, ComputeService service,
			Double applianceValue, Double serviceValue) {
		super();
		this.appliance = appliance;
		this.service = service;
		this.applianceValue = applianceValue;
		this.serviceValue = serviceValue;
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
	 * @return  the applianceValue
	 * @uml.property  name="applianceValue"
	 */
	public Double getApplianceValue() {
		return applianceValue;
	}

	/**
	 * @param applianceValue  the applianceValue to set
	 * @uml.property  name="applianceValue"
	 */
	public void setApplianceValue(Double applianceValue) {
		this.applianceValue = applianceValue;
	}

	/**
	 * @return  the serviceValue
	 * @uml.property  name="serviceValue"
	 */
	public Double getServiceValue() {
		return serviceValue;
	}

	/**
	 * @param serviceValue  the serviceValue to set
	 * @uml.property  name="serviceValue"
	 */
	public void setServiceValue(Double serviceValue) {
		this.serviceValue = serviceValue;
	}

	public Double getOverallValue() {
		return 0.5 * (getApplianceValue() == null ? 0 : getApplianceValue())
				+ 0.5 * (getServiceValue() == null ? 0 : getServiceValue());
	}

	@Override
	public int compareTo(IAttributedItem o) {
		return o == null ? (this == null ? 0 : 1)
				: ((o instanceof CombinationValue) ? getOverallValue()
						.compareTo(((CombinationValue) o).getOverallValue())
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
				+ "), " + getOverallValue() + "]";
	}

}
