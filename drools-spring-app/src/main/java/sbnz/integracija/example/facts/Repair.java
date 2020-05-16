package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.util.Date;

public class Repair implements Serializable{
	
	private Long id;
	private String name;
	private Date date;
	private Double price;
	
	public Repair(Long id, String name, Date date, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.price = price;
	}

	public Repair() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
