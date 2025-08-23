package zade.samir.Hibernate_Example;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
public class Alien {
	
	@Id
	private int aid;
	private String aname;
	private String tech;
	//The Alien class is not responsible for managing the relationship.
//	@OneToMany(mappedBy = "alien", cascade = CascadeType.ALL)
//	private List<Laptop> laptop;
	@ManyToMany
	private List<Laptop> laptops;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public List<Laptop> getLaptop() {
		return laptops;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptops = laptop;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + ", laptop=" + (laptops != null ? laptops.size() : 0) + "]";
	}
	
	
	
	

}
