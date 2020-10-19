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
	@Column(name="bike_Id")
	private int bike_Id;
	@Column(name="MAKE")
	private String make;
	@Column(name="MODEL")
	private String model;
	@Column(name="YEAR")
	private int year;
	@Column(name="QUALITY")
	private String quality;
	@Column(name="PRICE")
	private int price;

	
	public ListBike() {
		super();
	}
	
	public  ListBike(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}

	public  ListBike(String make, String model, int year, String quality, int price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.quality = quality;
		this.price = price;
	}
	
	public String returnBikeDetails() {
		return make + ", " + model + " , " + year + " , " + quality + " , " + price;
	}
	public int getBike_Id() {
		return bike_Id;
	}

	public void setBike_Id(int bike_Id) {
		this.bike_Id = bike_Id;
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

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
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
