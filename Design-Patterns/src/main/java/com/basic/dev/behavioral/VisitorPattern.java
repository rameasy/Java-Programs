package com.basic.dev.behavioral;

import com.basic.dev.behavioral.visitor.Computer;
import com.basic.dev.behavioral.visitor.ComputerPart;
import com.basic.dev.behavioral.visitor.ComputerPartDisplayVisitor;

/*
 * The purpose of a Visitor pattern is to define a new operation without introducing the modifications to an existing object structure.
 */

/* When to use the Visitor design pattern in Java?
 * Similar operations have to be performed on objects of different types grouped in a structure (a collection or a more complex structure).
 * There are many distinct and unrelated operations needed to be performed. Visitor pattern allows us to create a separate 
 * visitor concrete class for each type of operation and to separate this operation implementation from the objects structure.
 * The object structure is not likely to be changed but is very probable to have new operations which have to be added. 
 * Since the pattern separates the visitor (representing operations, algorithms, behaviors) from the object structure it's 
 * very easy to add new visitors as long as the structure remains unchanged.
 */
/*
 * Examples :
 * javax.lang.model.element.AnnotationValue and AnnotationValueVisitor
 * javax.lang.model.element.Element and ElementVisitor
 * javax.lang.model.type.TypeMirror and TypeVisitor
 * java.nio.file.FileVisitor and SimpleFileVisitor
 */
//https://www.tutorialspoint.com/design_pattern/visitor_pattern.htm
public class VisitorPattern {
	public static void main(String args[]) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
