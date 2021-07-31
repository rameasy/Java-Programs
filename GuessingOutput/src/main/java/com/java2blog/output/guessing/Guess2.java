package com.java2blog.output.guessing;

public class Guess2 {

	static int a = 1111;
	static {
		System.out.println("called 2");
		a = a-- - --a;
	}
	{
		System.out.println("called 1");
		a = a++ + ++a;
	}
	public static void main(String[] args) {
		// This is a comment

		// this should work \u000d
		System.out.println("I am executed");
		// String s ="ONE"+1+2+"TWO"+"THREE"+3+4+FOUR"+"FIVE"+5; //COMPILE ERROR
		// System.out.println(s);
		int i = 10 + +11 - -12 + +13 - -14 + +15;
		System.out.println(i);
		String one = "Random";
		String two = "RAndom";// if Random then one == two
		if (one == two) {
			System.out.println("one == two");
		} else {
			System.out.println("one != two");
		}
		System.out.println(Fruit.APPLE);
		System.out.println(Fruit.ORANGES);
//		final class Constants {
//			public static String name = "PI"; //The field name cannot be declared static in a non-static inner type, unless initialized with a constant expression
//		}
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() { //The method run() of type new Runnable(){} must override a superclass method
//				System.out.println(Constants.name);
//			}
//		});
//		thread.start();

		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1 == i2);
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3 == i4);
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		
		long longWithL = 1000 * 60 * 60 * 24 * 365L; //31536000000
		long longWithoutL =  1000 * 60 * 60 * 24 * 365; //1471228928
		
		System.out.println(longWithL);
		System.out.println(longWithoutL);
		System.out.println(a);
	}

}

interface IFruit {
	public String APPLE = "Apple";
//	protected static String ORANGES = "Oranges"; // interfaces variable cannot be protected
}

class CFruit {
	protected static String ORANGES = "Oranges";
}

class Fruit extends CFruit implements IFruit {

}