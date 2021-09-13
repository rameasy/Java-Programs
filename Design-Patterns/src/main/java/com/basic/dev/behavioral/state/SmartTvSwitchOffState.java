package com.basic.dev.behavioral.state;

public class SmartTvSwitchOffState implements SmartTvState {
	@Override
	public void switchOnOffSmartTv() {
		System.out.println("Smart TV is Switched OFf");
	}
}