package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * Larry Paucar - Lpaucar
 * CIS175 -Spring 2024
 * Mar 28, 2024
 */
@Entity
public class Computers {
	
	@Id
	@GeneratedValue
	private long id;
	private String brand;
	private String model;
	private String processor;
	private int ram;
	private double storage;
	@Autowired
	private OperatingSystem operatingSystem;
	
	public Computers() {
		super();
		this.model = "XPS15";
	}

	public Computers(String brand) {
		super();
		this.brand = brand;
	}

	public Computers(String brand, String model, String processor, int ram, double storage) {
		super();
		this.brand = brand;
		this.model = model;
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
	}

	public Computers(long id, String brand, String model, String processor, int ram, double storage) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getStorage() {
		return storage;
	}

	public void setStorage(double storage) {
		this.storage = storage;
	}

	public OperatingSystem getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(OperatingSystem operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	@Override
	public String toString() {
		return "Computers [id=" + id + ", brand=" + brand + ", model=" + model + ", processor=" + processor + ", ram="
				+ ram + ", storage=" + storage + ", operatingSystem=" + operatingSystem + "]";
	}
	
}
