package com.coding.general;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * The Class CustomAnnotationTest.
 */
public class CustomAnnotationTest {
	
	/** The my field 1 that has the field value set when loading the field variable. */
	@CustomFieldAnnotation(fieldValue = "update field value")
	public String myField1;

	/** The my field 2 that has the default field value set when loading the field variable. */
	@CustomFieldAnnotation()
	public String myField2;

	/**
	 * My method 1 that has the method value set when loading the method. 
	 */
	@CustomMethodAnnotation(methodValue = "updated method value")
	public void myMethod1() {
		System.out.println("Java my method annotations with updated value");
	}

	/**
	 * My method 2 that has the default method value set when loading the method.
	 */
	@CustomMethodAnnotation()
	public void myMethod2() {
		System.out.println("Java my method annotations with default value");
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(String args[]) throws Exception {
		CustomAnnotationTest customAnnotationTest = new CustomAnnotationTest();
		Method[] methods = customAnnotationTest.getClass().getMethods();
		for (Method method : methods) {
			if (method.getAnnotation(CustomMethodAnnotation.class) != null) {
				CustomMethodAnnotation methodAnnotation = method.getAnnotation(CustomMethodAnnotation.class);
				System.out.println("Value is: " + methodAnnotation.methodValue());
			}
		}

		Field[] fields = customAnnotationTest.getClass().getFields();
		for (Field field : fields) {
			CustomFieldAnnotation fieldAnnotation = field.getAnnotation(CustomFieldAnnotation.class);
			System.out.println("Value is: " + fieldAnnotation.fieldValue());
		}
	}
}
