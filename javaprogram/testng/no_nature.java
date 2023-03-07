package javaprogram.testng;

import org.testng.annotations.Test;

public class no_nature {
	int n=-40; int a;

	@Test
	public void neg_postivno() {
		
		if(n<0) 
		{a=n*(-1);
		System.out.println(n+"=negative no");
		System.out.println("given number is converted to " +a+"  -->positive no");}
		else if(n>0)
		{System.out.println(n+"=Positive no");}
		else  
		{System.out.println(n+"Neither Positive nor Negative");}}
	
	@Test
	public void odd_even() {
		int a=1;
		if(a%2==0)
		{System.out.println("Even No");}
		else 
		{System.out.println("Odd No");}
	}
	
	@Test
	public void odd_evenrange() {
		int range=10;
		for(int i=1;i<=range;i++) {
			if(i%2==0)
			{System.out.println("Even No="+i);}
			else 
			{System.out.println("Odd No="+i);}
	}}







}