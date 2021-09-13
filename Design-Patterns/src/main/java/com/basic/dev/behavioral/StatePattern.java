package com.basic.dev.behavioral;

import com.basic.dev.behavioral.state.SmartTv;
import com.basic.dev.behavioral.state.SmartTvState;
import com.basic.dev.behavioral.state.SmartTvSwitchOffState;
import com.basic.dev.behavioral.state.SmartTvSwitchOnState;

/*
 * The main idea of State pattern is to allow the object for changing its behavior without changing its class.
 */
/* When to use the State design pattern in Java?
 * In any application, when we are dealing with an object which can be in different states during it’s life-cycle and 
 * how it processes incoming requests (or make state transitions) based on it’s present state – we can use the state pattern.
 */
/*
 * Examples : Java thread states
 * 
 */
//https://examples.javacodegeeks.com/core-java/java-state-design-pattern-example/
public class StatePattern {
	public static void main(String args[]) {
		SmartTv smartTv = new SmartTv();
		SmartTvState smartTvSwitchOnState = new SmartTvSwitchOnState();
		SmartTvState smartTvSwitchOffState = new SmartTvSwitchOffState();

		smartTv.setSmartTvState(smartTvSwitchOnState);
		smartTv.switchOnOffSmartTv();

		smartTv.setSmartTvState(smartTvSwitchOffState);
		smartTv.switchOnOffSmartTv();
	}
}
