package javachallenge;

import java.util.StringJoiner;

public class String_repetition {
	
	public static void By_StringBuffer(String[] a,String[]b) {
      StringBuffer concat1 = new StringBuffer();
      StringBuffer concat2 = new StringBuffer();
      if(a.length==b.length) {
		for(int i=0;i<a.length;i++) {
			concat1.append(a[i]);
			concat2.append(b[i]);}}
		
		String str1 = concat1.toString();String str2 = concat2.toString();
		System.out.println("String1==>"+str1 +" \n"+"String2==>"+ str2);
		if(str1.equals(str2)) {System.out.println("Concatenate of 2 string array gives same string value");}
		else {System.out.println("Concatenate of 2 string array does not give same string value");}
	}
	
	public static void By_StringJoiner(String[] a,String[]b) {
	      StringJoiner concat1 = new StringJoiner("");
	      StringJoiner concat2 = new StringJoiner("");
	      if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				concat1.add(a[i]);
				concat2.add(b[i]);}}
			
			String str1 = concat1.toString();String str2 = concat2.toString();
			System.out.println("String1==>"+str1 +"\n"+"String2==>"+ str2);
			if(str1.equals(str2)) {System.out.println("Two string array gives same string value");}
			else {System.out.println("Two string array does not give same string value");}
		}
	
	public static void main(String[] args) {
		String[] a={"ab","c"}; String[] b={"a","bc"}; 
		String[] m= {"a","cb"}; String[] n= {"ab","c"};
		
		System.out.println(">>>>>>APPROACH1==>By StringBuffer<<<<");
		String_repetition .By_StringBuffer(a, b);
		String_repetition .By_StringBuffer(m, n);
		
		System.out.println(">>>>>>APPROACH2==>By StringJoiner<<<<");
		String_repetition .By_StringJoiner(a, b);
		String_repetition .By_StringJoiner(m, n);
		
		
		
      
		 
}}
