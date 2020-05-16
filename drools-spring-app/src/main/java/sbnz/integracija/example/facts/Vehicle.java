package sbnz.integracija.example.facts;

import java.io.Serializable;

public class Vehicle implements Serializable{
	
	private Long id;
	private String name;
	private String malfunction;
	private Long price;
	private Long discount;
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(Long id, String name, String malfunction, Long price, Long discount) {
		super();
		this.id = id;
		this.name = name;
		this.malfunction = malfunction;
		this.price = price;
		this.discount = discount;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMalfunction() {
		return malfunction;
	}
	
	public void setMalfunction(String malfunction) {
		this.malfunction = malfunction;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getPrice() {
		return price;
	}
	
	public void setPrice(Long price) {
		this.price = price;
	}
	
	public Long getDiscount() {
		return discount;
	}
	
	public void setDiscount(Long discount) {
		this.discount = discount;
	}

}
