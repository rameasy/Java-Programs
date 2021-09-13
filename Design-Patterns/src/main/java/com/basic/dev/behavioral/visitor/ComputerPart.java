package com.basic.dev.behavioral.visitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
