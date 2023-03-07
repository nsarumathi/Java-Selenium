package javaprogram.testng;

import org.testng.annotations.Test;

public class PrimeNo {
	
	int a=13,b=170;
	boolean flag=false;

	@Test
	public  void check_prime() {
		for(int i=2;i<=b/2;i++) {
			if (b%i==0) {flag=true;
			break;}}
		if(flag==false) {System.out.println(b+"=prime no");}
		else {System.out.println(b+"=Non-Prime no");}
	}

	@Test
	public void check_no() {
		for(int i=2;i<a;i++) {
			if (a%i==0) {System.out.println(a+"=Non Prime");
			flag=true;
			break;}}
			if(!flag) {System.out.println(a+"=prime");}
	}
}
