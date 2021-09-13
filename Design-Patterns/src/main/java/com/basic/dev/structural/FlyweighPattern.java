package com.basic.dev.structural;

import com.basic.dev.structural.flyweigh.Pen;
import com.basic.dev.structural.flyweigh.PenFactory;

/*
 * The Flyweight pattern is used to minimize the memory usage by sharing as much data as possible with other similar objects.
 * The Flyweight pattern provides a way to reduce the number of objects created and to decrease memory footprint and increase performance.
 */

/* When to use the Flyweigh design pattern in Java?
 * To improve the performance when large number of objects need to be created.
 * When we need a large number of similar objects that are unique in terms of only a few parameters and most of the stuffs are common in general.
 * We need to control the memory consumption by large number of objects – by creating fewer objects and sharing them across.
 */
/*
 * Examples : java.lang.Integer#valueOf(int) (also Boolean, Byte, Character, Short, Long and BigDecimal)
 * java.lang.String constants as flyweight objects. All strings are stored in string pool and if we need a string with 
 * certain content then runtime return the reference to already existing string constant from the pool – if available.
 */
/*
 * Suppose we have a pen which can exist with/without refill. 
 * A refill can be of any color thus a pen can be used to create drawings having N number of colors.
 * Here Pen can be flyweight object with refill as extrinsic attribute. 
 * All other attributes such as pen body, pointer etc. can be intrinsic attributes which will be common to all pens. 
 * A pen will be distinguished by its refill color only, nothing else. All application modules which need to access 
 * a red pen – can use the same instance of red pen (shared object). 
 * Only when a different color pen is needed, application module will ask for another pen from flyweight factory.
*/
public class FlyweighPattern {
	public static void main(String args[]) {
		Pen yellowThinPen1 = PenFactory.getThickPen("YELLOW"); // created new pen
		yellowThinPen1.draw("Hello World !!");

		Pen yellowThinPen2 = PenFactory.getThickPen("YELLOW"); // pen is shared
		yellowThinPen2.draw("Hello World !!");

		Pen blueThinPen = PenFactory.getThickPen("BLUE"); // created new pen
		blueThinPen.draw("Hello World !!");

		Pen redThinPen = PenFactory.getThickPen("RED"); // created new pen
		redThinPen.draw("Hello World !!");
		Pen redThinPen2 = PenFactory.getThickPen("RED"); // pen new pen
		redThinPen.draw("Hello World !!");

		System.out.println(yellowThinPen1.hashCode());
		System.out.println(yellowThinPen2.hashCode());

		System.out.println(blueThinPen.hashCode());
		System.out.println(redThinPen.hashCode());
		System.out.println(redThinPen2.hashCode());
	}
}
