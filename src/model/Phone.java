package model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Phone {

	private String deviceName;
	private String technology;
	private String brand;
	private String announced;
	private String status;
	private String size;
	private String resolution;
	private int price;
	
	
	public Phone(String deviceName, String technology, String brand, String announced, String status, String size,
			String resolution, int price) {
		super();
		this.deviceName = deviceName;
		this.technology = technology;
		this.brand = brand;
		this.announced = announced;
		this.status = status;
		this.size = size;
		this.resolution = resolution;
		this.price = price;
	}


	public String getDeviceName() {
		return deviceName;
	}


	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}


	public String getTechnology() {
		return technology;
	}


	public void setTechnology(String technology) {
		this.technology = technology;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getAnnounced() {
		return announced;
	}


	public void setAnnounced(String announced) {
		this.announced = announced;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getResolution() {
		return resolution;
	}


	public void setResolution(String resolution) {
		this.resolution = resolution;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	

}
