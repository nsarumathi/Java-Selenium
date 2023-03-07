package javaprogram.testng;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Java_TestNGBase {
	long startTime;
	long endTime;
	int  letter, space, num, specialChar;
	
	@BeforeMethod
	public void startTimer() {
		letter = 0;
		 space = 0; num = 0; specialChar = 0;
		startTime = System.nanoTime();
	}

	@AfterMethod
	public void endTimer() {
		endTime = System.nanoTime();
		System.out.println("Time taken to complete this test in nanoseconds:");
		System.out.println(endTime - startTime);
		System.out.println("\n"+">>>>>>NEXT TEST<<<<<<<<<<");
	}
}


