package com.chainsys.oop.practice;

public class CarInfo {
	String carColor;
	public String getCarColor() {
		return carColor;
	}
	public CarInfo() {
		
	}
	
	
	public CarInfo(String carColor, int gearType, int maxSpeed, int mileage) {
		
		this.carColor = carColor;
		this.gearType = gearType;
		this.maxSpeed = maxSpeed;
		this.mileage = mileage;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public int getGearType() {
		return gearType;
	}
	public void setGearType(int gearType) {
		this.gearType = gearType;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return "CarInfo [carColor=" + carColor + ", gearType=" + gearType + ", maxSpeed=" + maxSpeed + ", mileage="
				+ mileage + "]";
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	int gearType;
	int maxSpeed;
	int mileage;
	

}
