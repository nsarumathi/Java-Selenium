package javaprogram.testng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class uniq_dupCharInString {

	String name="Sarumathi Nallasivam"; //19==>samil 5,ruthnva 7, a 1
	String Cname=name.toLowerCase().replace(" ", "");
	char[] A=Cname.toCharArray();

	@Test
	public void using_1set() {
		Set<Character> unique=new HashSet<Character> ();
		for(int i =0;i<Cname.length();i++) {
			boolean check = unique.add(A[i]);
			if(!check) {unique.remove(A[i]);} }
		System.out.println("unique char without any duplicates=" +unique);

		System.out.println(" no of unique Characters =="+unique.size());
	}

	@Test(priority=2)
	public void using_2set() {
		Set<Character> charac=new HashSet<Character> ();
		Set<Character> duplicate=new HashSet<Character> ();
		for(int i =0;i<Cname.length();i++) {
			boolean check = charac.add(A[i]);
			if(!check) {duplicate.add(A[i]);} }
		System.out.println("char without duplicates=" +charac);
		System.out.println(" no of Characters without duplicates =="+charac.size());
		System.out.println("duplicate char=" +duplicate);
		System.out.println(" no of duplicate Characters =="+duplicate.size());
	}
	
	@Test(priority=-1)
	public void using_2setwithSpace() {
		String Text="PayPal India";
		char[] A=Text.toCharArray();
		Set<Character> charac=new HashSet<Character> ();
		Set<Character> duplicate=new HashSet<Character> ();
		
		for(int i =0;i<Text.length();i++) {
			boolean check = charac.add(A[i]);
			if(!check) {duplicate.add(A[i]);} }
		System.out.println("unique Characters="+ charac);
		System.out.println("Duplicate Characters=" +duplicate);
		charac.removeAll(duplicate);
		System.out.println("unique Characters without Duplicate=="+ charac);
		
		List<Character> finalStr =new ArrayList<Character>(charac);
		int C=Collections.frequency(charac, " ");
		System.out.println("index of space location=="+ C);
		finalStr.remove(C);
		System.out.println("unique Characters without empty space=="+finalStr);
		
	}
}
