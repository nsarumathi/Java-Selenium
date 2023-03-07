package javaprogram.Scanner;

import java.util.Arrays;
import java.util.Scanner;
public class FindIntersection {

	public static void main(String[] args) {
	    
		Scanner input=new Scanner(System.in);
		System.out.println("Enter no of Elements of Array1 -a:");
		int a=input.nextInt();
		int[]array1=new int[a];
		System.out.println("Enter Elements of Array1:");
		for(int k=0;k<a;k++)
		{array1[k]=input.nextInt();}
		System.out.println("Array Elements are:");
		System.out.println(Arrays.toString(array1));
	
		System.out.println("Enter no of Elements of Array2 -b:");
		int b=input.nextInt();
		int[]array2=new int[b];
		System.out.println("Enter Elements of Array2:");
		for(int k=0;k<a;k++)
		{array2[k]=input.nextInt();}
		System.out.println("Array Elements are:");
		System.out.println(Arrays.toString(array2));
        input.close();
        
        int l1=array1.length;
        int l2=array2.length;
        System.out.println("array 1 length="+l1);
        System.out.println("array 2 length=" +l2);
   
	for(int i=0;i<l1;i++) {
		for(int j=0;j<l2;j++) {
			if(array1[i]==array2[j]){
		System.out.println(array1[i]+"Intersection Elements");}
		}}}}


