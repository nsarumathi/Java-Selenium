package javaprogram.testng;

import org.testng.annotations.Test;

public class StringReverse {

	String input="Sarumathi Nallasivam was located in chennai";
	String[] splitS=input.split(" ");        

	@Test(priority=-1)
	public void even_reverse() {
		System.out.println("Even Char in input line==");
		for (int i = 0; i < splitS.length; i++) {
			if(i%2!=0) {
				char[] charArray = splitS[i].toCharArray();
				for (int j=charArray.length-1;j>=0 ; j--) {
					System.out.print(charArray[j]);}
				System.out.print(" ");}
			else {
				System.out.print(splitS[i]); }
			System.out.print(" "); }}

	@Test
	public void odd_reverse() {
		System.out.print("  "+ "\n");
		System.out.println("Odd Char in input line==");
		for (int m = 0; m < splitS.length; m++) {
			if(m%2==0){
				char[] Array=splitS[m].toCharArray();
				for (int n=Array.length-1;n>=0;n--) {
					System.out.print(Array[n]);}
				System.out.print(" ");}
			else {System.out.print(splitS[m]);}
			System.out.print(" ");}}


	@Test(priority=3)
	public void full_reversebyChar() {
		char[] array = input.toCharArray();
		System.out.print("  "+ "\n");
		System.out.println("full reverse of line by char==");
		for (int j = array.length-1 ; j >=0 ; j--) {
			System.out.print(array[j]+" ");}}
	
	@Test(priority=4)
	public void full_reversebywordsplit() {
		String[] array = input.split(" ");
		System.out.print("  "+ "\n");
		System.out.println("full reverse of line by word==");
		for (int j = array.length-1 ; j >=0 ; j--) {
			System.out.print(array[j]+" ");}}
}