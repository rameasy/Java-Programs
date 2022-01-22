package com.coding.general;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The Interface CustomMethodAnnotation.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CustomMethodAnnotation {
	
	/**
	 * Method value.
	 *
	 * @return the string
	 */
	public String methodValue() default "default method value";
}
