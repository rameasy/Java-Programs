package com.basic.dev.creational;

import java.time.Year;

import com.basic.dev.creational.Book.Builder;

/*
 * Builder pattern allows you to produce different types and representations of a product using the same construction code.
 * 
 */

/* When to use the Builder design pattern in Java?
 * This pattern should be used when we want to build different immutable objects using the same object building process.
 */
/*
 * Examples : All implementations of java.lang.Appendable are infact good example of use of Builder pattern in java. e.g.
 * java.lang.StringBuilder#append() [Unsynchronized class]
 * java.lang.StringBuffer#append() [Synchronized class]
 * java.nio.ByteBuffer#put() (also on CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer and DoubleBuffer)
 * 
 * javax.swing.GroupLayout.Group#addComponent().
 */
public class BuilderPattern {
	public static void main(String args[]) {
		Builder bookBuilder = new Book.Builder("34545-34523-34521-43234", "Ponniyin Selvan");
		bookBuilder = bookBuilder.author("Kalki");
		bookBuilder = bookBuilder.published(Year.of(1930));
		Book book = bookBuilder.build();
		System.out.println(book);
	}
}

class Book {
	private final String isbn;
	private final String title;
	private final String author;
	private final Year published;
	private final String description;

	private Book(Builder builder) {
		this.isbn = builder.isbn;
		this.title = builder.title;
		this.author = builder.author;
		this.published = builder.published;
		this.description = builder.description;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Year getPublished() {
		return published;
	}

	public String getDescription() {
		return description;
	}

	public static class Builder {
		private final String isbn;
		private final String title;
		private String author;
		private Year published;
		private String description;

		public Builder(String isbn, String title) {
			this.isbn = isbn;
			this.title = title;
		}

		public Builder author(String author) {
			this.author = author;
			return this;
		}

		public Builder published(Year published) {
			this.published = published;
			return this;
		}

		public Builder description(String description) {
			this.description = description;
			return this;
		}

		public Book build() {
			return new Book(this);
		}

	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", published=" + published
				+ ", description=" + description + "]";
	}

}