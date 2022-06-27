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
 * 
 * The main difference is that in State pattern internal state of an Object is one of the determining factors for selecting the
 * Strategy for change of state. Where as in Strategy pattern, client can pass some external parameter in input during method invocation that determines the
 * strategy to be used at run time. Therefore State pattern is based on the Object’s internal state, where as Strategy pattern is based on Client’s invocation.

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
