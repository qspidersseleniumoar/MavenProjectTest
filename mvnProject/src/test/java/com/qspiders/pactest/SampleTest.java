package com.qspiders.pactest;

import org.testng.annotations.Test;

public class SampleTest {
	
	 @Test
	 public void sampleseleniumtest() {
		 System.out.println("===Commit 1====");
		 System.out.println("===Commit 2====");
		 System.out.println("===Commit 3====");

		 String bName = System.getProperty("browser");
		 String url = System.getProperty("url");

		 System.out.println(bName);
		 System.out.println(url);

	 }

}
