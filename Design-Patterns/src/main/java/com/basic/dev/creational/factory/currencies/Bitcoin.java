package com.basic.dev.creational.factory.currencies;

import com.basic.dev.creational.factory.FiatCurrency;

public class Bitcoin implements FiatCurrency{

	public String getSymbol() {
		return "BTC";
	}

}
