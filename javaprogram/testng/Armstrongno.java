package javaprogram.testng;

import org.testng.annotations.Test;

public class Armstrongno extends Java_TestNGBase {
	
	int n=153;
	
	@Test
	public void check_no() {
		int result=0,rem,org;  
		org=n;  
		while(n>0){  
			rem=n%10;  
			n=n/10;  
			result=result+(rem*rem*rem);  
		}  
		if(org==result)  
			System.out.println("It is armstrong number");   
		else  
			System.out.println("It is not armstrong number");  
	}
		
	}


