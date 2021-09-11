package com.basic.dev.creational.factory.currencies;

import com.basic.dev.creational.factory.FiatCurrency;

public class Stellar implements FiatCurrency{

	public String getSymbol() {
		return "ZRX";
	}

}
