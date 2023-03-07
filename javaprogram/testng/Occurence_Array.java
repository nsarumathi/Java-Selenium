package javaprogram.testng;

//import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Occurence_Array extends Java_TestNGBase{

	public static void arrayrepetition(int[]a) {
		int[] array=new int[a.length];
		for(int i=0;i<a.length;i++){
			int cnt=0;
			for(int j=1;j<a.length;j++) {
				if(a[i]==a[j]) cnt++;array[i]=cnt; }}
		System.out.print("Occurence in array==>");
		for(int k=0;k<array.length;k++) {
			System.out.print(array[k]);}
		System.out.println(" ");}

	public static void singleElement(int[]a) {
		int single=0;
		int[] array=new int[a.length];
		for(int i=0;i<a.length;i++){
			int cnt=0;
			for(int j=1;j<a.length;j++) {
				if(a[i]==a[j]) cnt++;array[i]=cnt;}//to count frequency of element repetition 
			if (cnt==1 || cnt==0){single=a[i];}}
		System.out.println("Single Array element =="+ single);
		System.out.print("stored cnt(freq) array ==");
		for(int k=0;k<array.length;k++) {
			System.out.print(array[k]);} //to print frequency of element repetition
		System.out.println(" \t "+"\n");
	}


	public void majorityElement(int[]a) {
		int cnt=0; int max=0; int maxcnt=0;int n=(a.length)/2;
		for(int i=0;i<a.length;i++){
			cnt=0;
			for(int j=1;j<a.length;j++) {
				if(a[i]==a[j]) cnt++;}  
			if(cnt>maxcnt) {maxcnt=cnt;max=a[i];}}
		if(maxcnt>=n) {System.out.println("majority element of==>"+max);}
		else {System.out.println("no majority element");}
	}

	@Test
	public void check_single() {

		//minority->single
		int[] c= {2,2,1};
		int[] d= {4,1,2,1,2};
		int[] e= {1};

		Occurence_Array.singleElement(c);
		Occurence_Array.singleElement(d);
		Occurence_Array.singleElement(e);
	}

	
	@Test
	public void check_majority() {
		//majority
		int[] a= {3,2,3};                                      
		int[] b= {2,1,1,1,1,2,1,2};

		Occurence_Array check=new Occurence_Array();
		
		check.majorityElement(a);
		Occurence_Array.arrayrepetition(a);
		
		check.majorityElement(b);
		Occurence_Array.arrayrepetition(b);
	}


	@Test
	public void check_order() {
		int[]a= {5,4,2,2,4,4};
		int min=0,max=0,single=0;int n=a.length/2;
		for(int i=0;i<a.length;i++) {
			int cnt=0;
			for(int j=0;j<a.length;j++) {
				if (a[i]==a[j]) cnt++;}
			if(cnt<n) {min=a[i];}
			if(cnt==0 || cnt==1) {single=a[i];}
			if(cnt>=n) {max=a[i];}}
		System.out.println("Minority element=>"+min);
		System.out.println("Single element=>"+single);
		System.out.println("Majority element="+max);
		
	}

}

