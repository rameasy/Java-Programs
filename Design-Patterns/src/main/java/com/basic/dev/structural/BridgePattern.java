package com.basic.dev.structural;

/*
 * Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary independently. 
 * 
 */
import com.basic.dev.structural.bridge.AutomaticGear;
import com.basic.dev.structural.bridge.Car;
import com.basic.dev.structural.bridge.Gear;
import com.basic.dev.structural.bridge.ManualGear;
import com.basic.dev.structural.bridge.Truck;
import com.basic.dev.structural.bridge.Vehicle;

/* When to use the Bridge design pattern in Java?
 * Bridge is a structural design pattern that divides business logic or huge class into separate class hierarchies that can be developed independently.
 * It is mostly used in those places where changes are made in the implementation does not affect the clients.
 */
/*
 * Examples : 
 * The JDBC API (a set of interfaces such as DataSource, PooledConnection, RowSet etc.) is typically considered as a bridge, which allows independent implementations for different databases (such as Sybase, Oracle or other ODBC databases) http://docstore.mik.ua/orelly/java-ent/servlet/ch09_02.htm
 * SLF4J, as hinted by its name (the Simple Logging Facade for Java), serves more as a facade than a bridge since you can still use java.util.logging, logback, log4j without SLF4J (but this is not the case for a bridge: an ODBC database can't be accessed directly without going through the JDBC interfaces);
 * 
 * javax.swing.GroupLayout.Group#addComponent().
 */
public class BridgePattern {
	public static void main(String args[]) {
		Gear gear = new ManualGear();
		Vehicle vehicle = new Car(gear);
		vehicle.addGear();

		gear = new AutomaticGear();
		vehicle = new Car(gear);
		vehicle.addGear();

		gear = new ManualGear();
		vehicle = new Truck(gear);
		vehicle.addGear();

		gear = new AutomaticGear();
		vehicle = new Truck(gear);
		vehicle.addGear();
	}
}
