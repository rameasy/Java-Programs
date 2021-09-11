package com.basic.dev.creational.abstractfactory;

import com.basic.dev.creational.factory.FiatCurrency;
import com.basic.dev.creational.factory.currencies.Bitcoin;
import com.basic.dev.creational.factory.currencies.Matic;
import com.basic.dev.creational.factory.currencies.Stellar;

public class CryptoCurrencyFactory implements CurrencyType {
	public String getCurrencyName() {
		return "Crypto";
	}

	public CryptoCurrencyFactory getCurrency() {
		return this;
	}

	public FiatCurrency getCurrency(String currencyCode) {
		if (currencyCode.equalsIgnoreCase("Bitcoin")) {
			return new Bitcoin();
		} else if (currencyCode.equalsIgnoreCase("ZRX")) {
			return new Stellar();
		} else if (currencyCode.equalsIgnoreCase("Matic")) {
			return new Matic();
		}
		throw new IllegalArgumentException("No such Crypto currency");
	}
}
