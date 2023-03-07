package javaprogram.testng;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Twice_occuranceString {

	public static void twice_occurance(String a) {
		char[] array =a.toCharArray(); 
		Set<Character> twice=new LinkedHashSet<Character>();
		for(int i=0;i<a.length();i++){
			int cnt=0;
			for(int j=1;j<a.length();j++) {
				if(array[i]==array[j]) {cnt++;
				if(cnt==2) {twice.add(array[i]);}}}
		}
		System.out.println("twice occurance character in string==>"+ twice);
		List<Character> list=new ArrayList<Character>(twice);
		System.out.println("First twice occurance character in string==>"+ list.get(0));
	}

	public void twice_occuranceMap(String a) {
	    char last=' ';char[] char_array =a.toCharArray();
		Map<Character,Integer> charCounter=new LinkedHashMap<Character,Integer>();
		for (char ch : char_array) {
			if(charCounter.containsKey(ch)){
				charCounter.put(ch, charCounter.get(ch)+1);} 
			else{charCounter.put(ch, 1);}}
		System.out.println(charCounter);
		boolean result =  charCounter.containsValue(2);
		System.out.println("Twice occurance is present==>"+result);
		
		Set<Character> twice=new LinkedHashSet<Character>();
		for(Entry<Character,Integer> entry : charCounter.entrySet()) {
			if(entry.getValue()==3 ||entry.getValue()==2) {last=entry.getKey();twice.add(last);}}
			List<Character> list=new ArrayList<Character>(twice);
			System.out.println("list==>"+list);
			System.out.println("First twice occurance character in string==>"+ list.get(0));

	}


	@Ignore
	@Test(priority=1)
	public void occurance_check() {
		String s="bbccbaacz";
		String m="abcdd";
		String n="xzyya";

		Twice_occuranceString.twice_occurance(s);
		Twice_occuranceString.twice_occurance(m);
		Twice_occuranceString.twice_occurance(n);
	}

	@Test(priority=1)
	public void occuranceMap_check() {
		String a = "zbccbaacz";
		
		Twice_occuranceString op=new Twice_occuranceString();
		op.twice_occuranceMap(a);
		
	}

}