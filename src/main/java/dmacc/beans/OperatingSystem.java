package dmacc.beans;

import jakarta.persistence.Embeddable;

/**
 * Larry Paucar - Lpaucar
 * CIS175 -Spring 2024
 * Mar 28, 2024
 */
@Embeddable
public class OperatingSystem {
	
	private String os;
	private double version;
	private String architecture;
	
	public OperatingSystem() {
		super();
	}

	public OperatingSystem(String os, double version, String architecture) {
		super();
		this.os = os;
		this.version = version;
		this.architecture = architecture;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public String getArchitecture() {
		return architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}

	@Override
	public String toString() {
		return "OperatingSystem [os=" + os + ", version=" + version + ", architecture=" + architecture + "]";
	}
	

}
