package com.chainsys.oop.practice;

public class Car extends CarInfo{
    

public void start() {
	System.out.println("Engine Starts");
}
public void start(boolean isBrakePressed) {
	if(isBrakePressed) {
		System.out.println("Engine starts alon with brake press");
	}else  {
		System.out.println("Please press brake to start");
	}
}
public void stop() {
	System.out.println("engine stop");
}


}