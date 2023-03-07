package javaprogram.testng;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MissingElementInArray extends Java_TestNGBase {
	int[] arr = {1,2,3,4,7,6,8};
	int[] arr1 = {1,2,3,4,7,5,8};

	
	@Test
	public void check_array() {
		int sum=0;int sum1=0;int m;
		//sum of array
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];}
		//sum of first natural nos
		for(int j=0;j<=arr.length+1;j++) {
			sum1=sum1+j;}
		m=sum1-sum;
		System.out.println(sum+"=Array sum ");
		System.out.println(sum1+"=Total sum");
		System.out.println(m+"=Missing Element");}
	
	@Test
	public void check_arrayno() {   
	
		Arrays.sort(arr1);

		for(int i=1;i<arr1.length;i++) {int j=i-1;
		if(arr[j]!=i) 
		{System.out.println(arr[i]+"=Missing Element");}}
	}

}


