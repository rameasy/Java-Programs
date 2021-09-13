package com.basic.dev.structural.bridge;

/* Abstraction (abstract class) */
public abstract class Vehicle {
	Gear gear;

	public Vehicle(Gear gear) {
		this.gear = gear;
	}

	public abstract void addGear();
}