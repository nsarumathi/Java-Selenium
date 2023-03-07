package javaprogram.Scanner;

import java.util.Scanner;

public class Pratice2DARRAY {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter m row valuein array");
		int m=input.nextInt();
		System.out.println("Enter n  Column valuein array");
		int n=input.nextInt();
		int[][] array=new int[m][n];
		System.out.println("Enter array elements of" + (m*n));
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				array[i][j]=input.nextInt();}}
		System.out.println("the Array is :");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
		System.out.print( array[i][j]+"   ");}
		System.out.println();}
		input.close();
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
		System.out.println( array[i][j]+"=array["+i+"]["+j+"]");}}
		
		
}}
