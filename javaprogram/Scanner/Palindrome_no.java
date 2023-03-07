package javaprogram.Scanner;
import java.util.Scanner;
public class Palindrome_no {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num;
		System.out.println("Enter Num");
		num=input.nextInt();
		input.close();
		
		int rem;
		int org=num;
		int rev=0;
		for(int a=1;a<=5;a++) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;	}
		System.out.println(rev);
		if(org==rev) {System.out.println(org +"=Palindrome no");}
		else {System.out.println(org +"=Non-Palindrome no");}
}}