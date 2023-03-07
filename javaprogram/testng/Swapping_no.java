package javaprogram.testng;

import org.testng.annotations.Test;

public class Swapping_no {
	int x = 10;
	int y = 20;


	@Test
	public void withot3rdvar() {
		System.out.println("Before swap:->x:"+x+"y:"+y);
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("After swap:->x:"+x+"y:"+y);

	}
	@Test
	public void WithoutTempVarible(){
		System.out.println("Before swap:->x:"+x+"y:"+y);
		x = x*y;
		y = x/y;
		x = x/y;
		System.out.println("After swap:->x:"+x+"y:"+y);
	}
	@Test
	public void Without3Varible(){ 
		System.out.println("Before swap:->x:"+x+"y:"+y);
		x = x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swap:->x:"+x+"y:"+y);
	}

}
