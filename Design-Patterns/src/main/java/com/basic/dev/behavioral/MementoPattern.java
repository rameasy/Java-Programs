package com.basic.dev.behavioral;

import com.basic.dev.behavioral.memento.TextEditor;
import com.basic.dev.behavioral.memento.TextWindow;

/*
 * The Memento Design Pattern offers a solution to implement undoable actions. We can do this by saving the state of 
 * an object at a given instant and restoring it if the actions performed since need to be undone.
 */

/* When to use the Memento design pattern in Java?
 * the Memento Design Pattern will be used in situations where some actions are undoable, 
 * therefore requiring to rollback to a previous state.
 * 
 */
/*
 * Examples :
 * javax.swing.text.JTextComponent
 */
//https://www.baeldung.com/java-memento-design-pattern
public class MementoPattern {
	public static void main(String args[]) {
		TextEditor textEditor = new TextEditor(new TextWindow());
		textEditor.write("The Memento Design Pattern\n");
		textEditor.write("How to implement it in Java?\n");
		textEditor.hitSave();
		System.out.println(textEditor.print());
		textEditor.write("Buy milk and eggs before coming home\n");
		System.out.println(textEditor.print());
		textEditor.hitUndo();
		System.out.println(textEditor.print());

	}
}
