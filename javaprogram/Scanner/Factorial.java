package javaprogram.Scanner;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

		System.out.println("Increment sample");
		for(int m= 1;m<=10;m++) {
			System.out.println(m+1);}

		System.out.println("Decrement sample");
		for(int n=10;n>0;n--) {
			System.out.println(n);	}


		System.out.println("enter range for factorials:");
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		System.out.println("Factorials are==>");
		int f=1;
		for(int i=1;i<=a;i++) {
			f=f*i;
			System.out.println(f);
		}ip.close();
	}
}