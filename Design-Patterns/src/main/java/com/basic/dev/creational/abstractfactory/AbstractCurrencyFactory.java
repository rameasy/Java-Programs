package com.basic.dev.creational.abstractfactory;

public class AbstractCurrencyFactory implements Currency {

	public CurrencyType create(String currencyType) {
		if (currencyType.equalsIgnoreCase("fiat")) {
			return new FiatCurrencyFactory();
		} else if (currencyType.equalsIgnoreCase("crypto")) {
			return new CryptoCurrencyFactory();
		}
		throw new IllegalArgumentException("No such currencyType available");
	}
}