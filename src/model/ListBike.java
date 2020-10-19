package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bike")
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
	private String year;
	@Column(name="QUALITY")
	private String quality;
	@Column(name="COST")
	private String price;

	
	public ListBike() {
		super();
	}

	public  ListBike(String make, String model, String year, String quality, String price) {
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
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

}
