package zade.samir.Hibernate_Example;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

//@Embeddable //join two tables with pojo classes
@Entity
public class Laptop {
	
	@Id
	private int lid;
	private String brand;
	private String model;
	private int ram;
	@ManyToOne //The Laptop class has the actual foreign key column (alien_id or similar).
	private Alien alien;
	
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
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
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	
	
	public Alien getAlien() {
		return alien;
	}
	public void setAlien(Alien alien) {
		this.alien = alien;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + ", model=" + model + ", ram=" + ram + ", alien=" + alien
				+ "]";
	}
	
	
	
	
	

}
