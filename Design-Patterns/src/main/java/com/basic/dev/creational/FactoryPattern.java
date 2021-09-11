package com.basic.dev.creational;

import com.basic.dev.creational.factory.CurrencyFactory;
import com.basic.dev.creational.factory.FiatCurrency;

/*
 * Factory design pattern is used to create objects or Class in Java and it provides loose coupling and high cohesion. 
 * Factory pattern encapsulate object creation logic which makes it easy to change it later when you change how object 
 * gets created or you can even introduce new object with just change in one class.
 */

/* When to use the Factory design pattern in Java?
 * Static Factory methods are common in frameworks where library code needs to create objects of types which may be sub classed by applications using the framework.        
 * Some or all concrete products can be created in multiple ways, or we want to leave open the option that in the future there may be new ways to create the concrete product.
 * Factory method is used when Products don't need to know how they are created.
 * We  can use factory pattern where we have to create an object of any one of sub-classes depending on the data provided
 */
/*
 * Examples Integer.valueOf(10)
 * Calendar.getInstance()
 * java.sql.DriverManager.getConnection()
 * java.lang.Class.newInstance(), java.lang.Class.forName() 
 */
public class FactoryPattern {
	public static void main(String args[]) {
        String country = "US";
        FiatCurrency rupee = CurrencyFactory.createCurrency(country);
        System.out.println(rupee.getSymbol());
 }
}
