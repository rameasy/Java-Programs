package com.basic.dev.structural;

import com.basic.dev.structural.decorator.BubbleLights;
import com.basic.dev.structural.decorator.ChristmasTreeImpl;
import com.basic.dev.structural.decorator.Garland;

/*
 * A Decorator pattern can be used to attach additional responsibilities to an object either statically or dynamically. 
 */

/* When to use the Decorator design pattern in Java?
 * To dynamically  change the functionality of an object at runtime without impacting the existing functionality of the objects
 * To add functinoalities that may be withrdrawn later.
 * To combine multiple functinalities where it is impractical to create a subclass for every possible combination.
 * 
 */
/*
 * Examples :
 * All subclasses of java.io.InputStream, OutputStream, Reader and Writer have constructors that accept objects of their own type.
 * java.util.Collections, methods checkedXXX(), synchronizedXXX() and unmodifiableXXX().
 * javax.servlet.http.HttpServletRequestWrapper and HttpServletResponseWrapper
 * 
 */
public class DecoratorPattern {
	public static void main(String args[]) {
		System.out.println(new Garland(new ChristmasTreeImpl()).decorate());
		System.out.println(new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl()))).decorate());
	}
}
