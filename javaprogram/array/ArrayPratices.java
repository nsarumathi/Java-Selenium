package javaprogram.array;

import java.util.Arrays;

public class ArrayPratices {
	
	public static int Findindex(int[]arr,int t) {
		int n=0;
		while(n<arr.length){
			if(arr[n]==t) return n;
			else n=n+1;}
		return n;}
	

	public static int ArraySum(int[]arr) {
		int sum=0;
		for(int m=0;m<arr.length;m++) {
			 sum=sum+arr[m];}
		return sum; }
	
	public static void main(String[] args) {
		
		
		int[][] b= {{1,4,5},{6,2,0},{10,-1,4},{2,4,5}};
		System.out.println("array b=");
	     for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
			System.out.print("\t"+b[i][j]);}
			  System.out.println(" ");}
	          
	     
		int[] arr = {1,2,10,4,-2,6,8};int sum1=0;
		System.out.println("Index position of 8 is:"+ Findindex(arr,8));
		System.out.println("sum"+ ArraySum(arr));
		
		System.out.println("switch one element in array");
		for(int m=0;m<arr.length;m++) {
			arr[2]=1;
			sum1=sum1+arr[m];
			 if(arr[m]==10) {
					System.out.println("Index position of 10 is: arr["+m+"]");}}
		System.out.println("sum after switch="+ sum1);
		System.out.println("avg after switch="+ sum1/arr.length);
		
		System.out.println("src array="+ (Arrays.toString(arr)));
		int[] newarr=new int[8];
		for(int k=0;k<arr.length;k++) {
		newarr[k] = arr[k];}
		System.out.println("new array="+ (Arrays.toString(newarr)));
		
		
        int[][] c=new int[4][4];
		System.out.println("array c=");
			for(int i=0;i<3;i++) {
				for(int j=0;j<2;j++) {
				System.out.print("\t"+c[i][j]);}
	        System.out.println("    ");}
}}

