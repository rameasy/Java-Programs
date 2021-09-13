package com.basic.dev.structural.bridge;

public class Truck extends Vehicle {
	public Truck(Gear gear) {
		super(gear);
		// initialize various other Truck components to make the car
	}

	@Override
	public void addGear() {
		System.out.print("Truck handles ");
		gear.handleGear();
	}
}