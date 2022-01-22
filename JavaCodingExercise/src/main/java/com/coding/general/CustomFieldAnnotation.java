package com.coding.general;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The Interface CustomFieldAnnotation.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface CustomFieldAnnotation {
	
	/**
	 * Field value.
	 *
	 * @return the string
	 */
	public String fieldValue() default "default field value";
}
