package javaprogram.Scanner;
import java.util.Scanner;
import java.util.Arrays;

public class FindMin {
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Enter no of elements stored in array:");
		int n=input.nextInt();
		int[]array=new int[n];
		
		System.out.println("Enter elements of array:");	
		for(int i=0;i<n;i++){
			array[i]=input.nextInt();}
		System.out.println("Array Elements are:");
		System.out.println(Arrays.toString(array));
		input.close();

		int length1=array.length;
		Arrays.sort(array);
		System.out.println(length1);
		System.out.println("To find min & max");
		int a=array[0];
		int b=array[length1-2];
		for(int k=0;k<length1;k++) {
			if(a == array[k]) {
				System.out.println(a);}
			if(b == array[k]) {
				System.out.println(b);}


		}}}
