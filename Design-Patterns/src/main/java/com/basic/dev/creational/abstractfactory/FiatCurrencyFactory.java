package com.basic.dev.creational.abstractfactory;

import com.basic.dev.creational.factory.FiatCurrency;
import com.basic.dev.creational.factory.currencies.Dollar;
import com.basic.dev.creational.factory.currencies.Pound;
import com.basic.dev.creational.factory.currencies.Rupee;

public class FiatCurrencyFactory implements CurrencyType {
	public String getCurrencyName() {
		return "Fiat";
	}

	public FiatCurrencyFactory getCurrency() {
		return this;
	}
	public FiatCurrency getCurrency(String currencyCode) {
		if (currencyCode.equalsIgnoreCase("India")) {
			return new Rupee();
		} else if (currencyCode.equalsIgnoreCase("UK")) {
			return new Pound();
		} else if (currencyCode.equalsIgnoreCase("US")) {
			return new Dollar();
		}
		throw new IllegalArgumentException("No such Fiat currency");
	}
}
