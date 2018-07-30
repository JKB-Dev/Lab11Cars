package com.car;

public class Car {
	//private int num;
	private String make;
	private String model;
	private int year;
	private double price;
	
	
	public Car() {
		//this.num = 0;
		this.make = null;
		this.model = null;
		this.year = 0;
		this.price = 0.0;
	}


	public Car(String make, String model, int year, double price) {
		//this.num = num;
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
//	public int getNum() {
//		return num;
//	}
//	
//	public void setNum(int num) {
//		this.num = num;
//	}

	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
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


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return String.format("%-10s %-10s %-10s" + "$" + "%-10s", make, model, year, price);
	}
	
	
	
	
}
