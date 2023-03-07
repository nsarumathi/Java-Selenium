package javaprogram.testng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class findIntersection extends Java_TestNGBase {
	
	int a[]= {3,6,8,9,3};
	int b[]= {6,8,9,2,3};
	int l1=a.length;
	int l2=b.length;
	
	
	@Test(priority=0)
	public void check_arrays() {
		System.out.println("Intersection elements are:");
		for(int i=0;i<l1;i++) {
			for(int j=0;j<l2;j++) {
				if(a[i]==b[j]) {System.out.println(a[i]);}
			}}
		}
	
	@Test(priority=1)
	public void check_arraysbylist() {
		
		List<Integer> newList = new ArrayList<Integer>();
		for(int i=0;i<l1;i++) {
			for(int j=0;j<l2;j++) {
				if(a[i]==b[j]) {newList.add(b[j]);}}}
		System.out.println("Intersection elements by list are:");
		Collections.sort(newList);
		System.out.println(newList);}
	
	
	@Ignore
	@Test(priority=3)
	public void check_arraysbyset() {
		Set<Integer> setlist = new HashSet<Integer>();
		for(int i=0;i<l1;i++) {
			for(int j=0;j<l2;j++) {
				if(a[i]==b[j]) {setlist.add(b[j]);}}}
		System.out.println("Intersection elements by set are:");
		System.out.println(setlist);}
	
	
	@Test(priority=4)
	public void intersection_foreachlist()  {

		List<Integer> firstList = new ArrayList<Integer>(); 
		for (int i : a)
			firstList.add(i);
	
		List<Integer> secondList = new ArrayList<Integer>(); 
		for (int i : b)
			secondList.add(i);

		firstList.retainAll(secondList);
		System.out.println("Intersection elements by 2 lists are:");
		System.out.println(firstList);}
	
	
	
	}
		
		



