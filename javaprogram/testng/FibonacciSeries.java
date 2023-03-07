package javaprogram.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FibonacciSeries {

	int range=8; int n1=0;int n2=1;
	int sum;

    
	@Test
	public void byfor_loop() {
		for(int i=1;i<=range;i++) {
			System.out.println(n1 + " ");
			sum=n1+n2;
			n1=n2;
			n2=sum;
			//System.out.println(sum);
		}}

	@Ignore
	@Test
	public void bywhile_loop() {
		int i=1;
		System.out.print("First " + range + " numbers series: ");	
		while(i <= range)
		{
			System.out.println(n1 + " ");
			sum=n1+n2;
			n1=n2;
			n2=sum;
			i++;
		}}
		
	
	}