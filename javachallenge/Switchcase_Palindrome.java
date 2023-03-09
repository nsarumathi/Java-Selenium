package javachallenge;

import java.util.Scanner;

public class Switchcase_Palindrome {
	
	public static  Boolean isPalindrome(String line) {
		String rev="";Boolean ans=false;
		  for (int j=line.length()-1;j>=0 ; j--) {
			  rev=rev+line.charAt(j);}
		  if(line.equals(rev)) {
			  ans=true;}
		return ans;}
	
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int option;String a,b,c,d;
		String line1,line2,line3,line4;
		
		
		while(true) {
		System.out.println(">>Choose any option<<");
		System.out.println("option:1-String A");
		System.out.println("option:2-String B");
		System.out.println("option:3-String C");
		System.out.println("option:4-String D");
		System.out.println("option:5-exit");
		option=ip.nextInt();

		switch(option)
		{
			case 1:
				 a="A man,a plan,a canal,panama";
				 line1=a.toLowerCase().replaceAll(",","").replaceAll(" ", "");
				Boolean check1=isPalindrome(line1);
				System.out.println("String A is palindrome=="+ check1);
				break;
			case 2 :
				 b="race a car";
				 line2=b.toLowerCase().replaceAll(",","").replaceAll(" ", "");
				Boolean check2=isPalindrome(line2);
				System.out.println("String B is palindrome=="+ check2);
				break;
			case 3:
				c=" ";
				line3=c.toLowerCase().replaceAll(",","");
				Boolean check3=isPalindrome(line3);
				System.out.println("String C is palindrome=="+ check3);	
				break;
			case 4:
				System.out.println("Type String line");
				d=ip.next();
				line4=d.toLowerCase().replaceAll(",","");
				Boolean check4=isPalindrome(line4);
				System.out.println("String D is palindrome=="+ check4);	
				break;
			case 5:
				System.exit(0);
				System.out.println(" ");}
		ip.close(); //comment when running
		}
		
		
	}		
		
		
}


