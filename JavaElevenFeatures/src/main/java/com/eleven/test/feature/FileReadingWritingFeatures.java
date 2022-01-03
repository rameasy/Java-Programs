package com.eleven.test.feature;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * This class demonstrates the Java 11 features Files.readString &
 * Files.writeString functionalities.
 * 
 * @author rameasy@gmail.com
 *
 */
public class FileReadingWritingFeatures {
	public static void main(String[] args) throws IOException {
		// Internally it uses java.io.tmpdir property location to create the temp file
		// file name created in the temp location: demo5404652607861302231.txt
		// if passed null the file name will be like 5019228549994836.txt
		Path filePath = Files.writeString(Files.createTempFile("demo", ".txt"), "Sample my text");
		String fileContent = Files.readString(filePath);
		System.out.println(fileContent);
	}
	
}
