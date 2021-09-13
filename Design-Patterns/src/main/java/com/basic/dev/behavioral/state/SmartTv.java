package com.basic.dev.behavioral.state;

public class SmartTv implements SmartTvState {

	private SmartTvState smartTvState;

	public SmartTvState getSmartTvState() {
		return smartTvState;
	}

	public void setSmartTvState(SmartTvState smartTvState) {
		this.smartTvState = smartTvState;

	}

	@Override
	public void switchOnOffSmartTv() {
		System.out.println("Current state Of Smart Tv : " + smartTvState.getClass().getName());
		smartTvState.switchOnOffSmartTv();

	}

}