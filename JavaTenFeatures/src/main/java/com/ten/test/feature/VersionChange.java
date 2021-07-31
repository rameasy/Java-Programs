package com.ten.test.feature;

import java.lang.Runtime.Version;

public class VersionChange {
	public static void main(String args[]) {
		Version version = Runtime.version();
		System.out.println("Feature :: " + version.feature());
		System.out.println("Interim :: " + version.interim());
		System.out.println("Patch :: " + version.patch());
		System.out.println("Update :: " + version.update());
		
	}
}
