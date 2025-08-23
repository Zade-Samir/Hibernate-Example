package zade.samir.Hibernate_Example;

import java.util.List;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

//@Embeddable //join two tables with pojo classes
@Entity
public class Laptop {
	
	@Id
	private int lid;
	private String brand;
	private String model;
	private int ram;
////	@ManyToOne //The Laptop class has the actual foreign key column (alien_id or similar).
//	private List<Alien> alien;
	@ManyToMany(mappedBy = "laptops")
	private List<Alien> aliens;
	
	
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
	public List<Alien> getAliens() {
		return aliens;
	}
	public void setAliens(List<Alien> aliens) {
		this.aliens = aliens;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + ", model=" + model + ", ram=" + ram + ", aliens=" + (aliens != null ? aliens.size() : 0) + "]";
	}

	
	
	
	
	
	

}
