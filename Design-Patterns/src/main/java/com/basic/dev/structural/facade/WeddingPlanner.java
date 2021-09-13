package com.basic.dev.structural.facade;

public class WeddingPlanner {
	Hall hall;
	Restaurant restaurant;
	Vehicle vehicle;
	Photographer photographer;

	public WeddingPlanner() {
		hall = new Hall();
		restaurant = new Restaurant();
		vehicle = new Vehicle();
		photographer = new Photographer();
	}

	public void organize() {
		hall.book();
		photographer.bookPhotographer();
		vehicle.reserveVehicle();
		restaurant.orderFood();
	}
}
