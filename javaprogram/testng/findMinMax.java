package javaprogram.testng;

import java.util.Arrays;
import java.util.Collections;


import org.testng.annotations.Test;

public class findMinMax {

	int[] marks = {22, 3981, -19, 82, 0, 45, 37};
	int length =marks.length;

	Integer[] array = {1, 45, 77, 88, 33, 23, 4};
	
	@Test(priority=-4)
	public void check_no() {

		Arrays.sort(marks);
		int max=marks[0]; //set as 0 or minimum value
		int min=marks[0];
		
		for(int i=0;i<length;i++) {
			for(int j=i;j<length;j++) {
				if(marks[i]<=marks[j]) {max=marks[i];}
				else if(marks[i]>=marks[j]){min=marks[i];}}}
		System.out.println("max value="+max);
		System.out.println("min value="+min);}

	@Test
	public void easycheck_no() {
		int a=marks[0];
		int b=marks[length-2];
		for(int k=0;k<length;k++) {
			if(a == marks[k]) {
				System.out.println("min value="+a);}
			if(b == marks[k]) {
				System.out.println("second max value="+b);}
		}}
	
	@Test(priority=2)   // Simple and efficient (when the array size is bigger in count)
	public void usingArray() {
		Arrays.sort(marks);
		System.out.println("Minimum number in Array "+marks[0]);
		System.out.println("Maximum number in Array "+marks[marks.length-1]);
	}

	
	@Test(priority=1) 
	public void usingCollection() {
		Integer max = Collections.max(Arrays.asList(array));
		System.out.println("Maximum array of number is "+max);
		Integer min = Collections.min(Arrays.asList(array));
		System.out.println("Minimum array of number is "+min);
	}

}


