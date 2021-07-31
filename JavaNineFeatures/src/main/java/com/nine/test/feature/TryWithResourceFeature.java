package com.nine.test.feature;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResourceFeature {

	public static void main(String[] args) throws IOException {
		TryWithResourceFeature tryWithResourceFeature = new TryWithResourceFeature();
		BufferedReader reader1 = new BufferedReader(
				new InputStreamReader(tryWithResourceFeature.getClass().getResourceAsStream("testme.txt")));
		try (reader1) {
			while( reader1.readLine() != null) {
				System.out.println(reader1.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
