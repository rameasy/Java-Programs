package com.eleven.test.feature;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadingWritingFeatures {
	public static void main(String []args) throws IOException {
		Path filePath = Files.writeString(Files.createTempFile("demo", ".txt"), "Sample my text");
		String fileContent = Files.readString(filePath);
		System.out.println(fileContent);
	}
	
}
