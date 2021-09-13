package com.basic.dev.structural.decorator;

public class Garland extends TreeDecorator {

	public Garland(ChristmasTree tree) {
		super(tree);
	}

	public String decorate() {
		return super.decorate() + decorateWithGarlands();
	}

	private String decorateWithGarlands() {
		return " with Garlands";
	}
}
