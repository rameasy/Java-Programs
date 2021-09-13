package com.basic.dev.structural;

import com.basic.dev.structural.facade.WeddingPlanner;

/*
 * Facade is a structural design pattern that provides a simplified (but limited) interface to a complex system of classes, library or framework.
 * This pattern hides the complexities of the larger system and provides a simpler interface to the client.
 */

/* When to use the Facade design pattern in Java?
 * To provide a simplified interface to the overall functionality of a complex subsystem.
 * To promote subsytem independence and portability
 */
/*
 * Examples : 
 * javax.faces.context.ExternalContext uses ServletContext, HttpSession, HttpServletRequest, HttpServletResponse and others inside.
 */
public class FacadePattern {
	public static void main(String args[]) throws CloneNotSupportedException {
		WeddingPlanner weddingPlanner = new WeddingPlanner();
		weddingPlanner.organize();
	}
}
