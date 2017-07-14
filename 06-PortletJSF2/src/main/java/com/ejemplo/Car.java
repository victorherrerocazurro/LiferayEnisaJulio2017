package com.ejemplo;

public class Car {

	private String randomId;
	private String randomBrand;
	private int randomYear;
	private String randomColor;
	private  int randomPrice;
	private boolean randomSoldState;
	
	public Car(String randomId, String randomBrand, int randomYear,
			String randomColor, int randomPrice, boolean randomSoldState) {
		super();
		this.randomId = randomId;
		this.randomBrand = randomBrand;
		this.randomYear = randomYear;
		this.randomColor = randomColor;
		this.randomPrice = randomPrice;
		this.randomSoldState = randomSoldState;
	}

	public String getRandomId() {
		return randomId;
	}

	public void setRandomId(String randomId) {
		this.randomId = randomId;
	}

	public String getRandomBrand() {
		return randomBrand;
	}

	public void setRandomBrand(String randomBrand) {
		this.randomBrand = randomBrand;
	}

	public int getRandomYear() {
		return randomYear;
	}

	public void setRandomYear(int randomYear) {
		this.randomYear = randomYear;
	}

	public String getRandomColor() {
		return randomColor;
	}

	public void setRandomColor(String randomColor) {
		this.randomColor = randomColor;
	}

	public int getRandomPrice() {
		return randomPrice;
	}

	public void setRandomPrice(int randomPrice) {
		this.randomPrice = randomPrice;
	}

	public boolean isRandomSoldState() {
		return randomSoldState;
	}

	public void setRandomSoldState(boolean randomSoldState) {
		this.randomSoldState = randomSoldState;
	}
	
	
	
}
