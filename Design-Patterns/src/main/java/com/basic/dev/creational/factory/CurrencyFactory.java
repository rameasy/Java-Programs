package com.basic.dev.creational.factory;

import com.basic.dev.creational.factory.currencies.Dollar;
import com.basic.dev.creational.factory.currencies.Pound;
import com.basic.dev.creational.factory.currencies.Rupee;

public class CurrencyFactory {

	public static FiatCurrency createCurrency(String country) {
		if (country.equalsIgnoreCase("India")) {
			return new Rupee();
		} else if (country.equalsIgnoreCase("UK")) {
			return new Pound();
		} else if (country.equalsIgnoreCase("US")) {
			return new Dollar();
		}
		throw new IllegalArgumentException("No such currency");
	}
}