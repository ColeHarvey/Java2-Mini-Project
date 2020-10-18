package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bikes")
public class ListBike {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="BIKE_ID")
	private int id;
	@Column(name="MAKE")
	private String make;
	@Column(name="MODEL")
	private String model;
	@Column(name="YEAR")
	private int year;
	@Column(name="CONDITION")
	private String condition;
	@Column(name="PRICE")
	private int price;

	
	public ListBike() {
		
	}

	public  ListBike(String make, String model, int year, String condition, int price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.condition = condition;
		this.price = price;
	}
	
	public String returnBikeDetails() {
		return make + ", " + model + " , " + year + " , " + condition + " , " + price;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

}
