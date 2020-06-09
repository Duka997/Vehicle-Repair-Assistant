package sbnz.integracija.example.facts;

import java.io.Serializable;
import java.util.Objects;

import sbnz.integracija.example.facts.Item.Category;

public class Vehicle implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String malfunction;
	private String symptoms;
	private Double price;
	private Double discount;
	private VehicleCategory category;
	private Double timesRepaired;
	private String solution;
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(Long id, String name, VehicleCategory category, String malfunction, String symptoms, Double price, Double timesReapired) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.malfunction = malfunction;
		this.price = price;
		this.timesRepaired = timesReapired;
		this.symptoms = symptoms;
	}
	
	

	public VehicleCategory getCategory() {
		return category;
	}

	public void setCategory(VehicleCategory category) {
		this.category = category;
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
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getDiscount() {
		return discount;
	}
	
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	
	public Double getTimesRepaired() {
		return timesRepaired;
	}

	public void setTimesRepaired(Double timesRepaired) {
		this.timesRepaired = timesRepaired;
	}
	
	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	
	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	@Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.category);
        hash = 59 * hash + Objects.hashCode(this.malfunction);
        hash = 59 * hash + Objects.hashCode(this.price);
        hash = 59 * hash + Objects.hashCode(this.discount);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehicle other = (Vehicle) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.category != other.category) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", name=" + name + ", category=" + category + '}';
    }

}
