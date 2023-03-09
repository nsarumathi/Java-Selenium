package javachallenge;


import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Occrance_string {

	String str = "welcome to automation";
	String line=str.replaceAll(" ", "");
	 int count =0;
	 
	@Test(priority=1)
	public void full_occurance() {
		char[] char_array =str.toCharArray();
		Map<Character,Integer> charCounter=new LinkedHashMap<Character,Integer>();
		for (char ch : char_array) {
			if(charCounter.containsKey(ch)){
				charCounter.put(ch, charCounter.get(ch)+1);} 
			else{charCounter.put(ch, 1);}}
		System.out.println(charCounter);
	}
	
	@Ignore
	@Test(priority=2)
	public void Specific_occurance() {
		char c = str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				count++;	}}
		System.out.println(c + " occurs " + count + " times in--> " + str);
	}
	
	
	@Test(priority=3) 
	public void occuranceOfString() {
		System.out.println("In " + str+" string,following characters;");
		for (int j = 0; j < str.length(); j++) {
			count = 0;
			char c = str.charAt(j); //can get specific occurance by mentioning j with specific no
			for (int i = 0; i < str.length(); i++) {
				if (c == str.charAt(i)) {
					count++;}}	
			System.out.println(c + " occurs " + count + " times");}} // you can store this in Map and print for better solution
	
	@Ignore
	@Test(priority=3)
	public void occurance() {
		String string=""; int temp =0;
		Map<Integer,String> map =new LinkedHashMap<Integer,String>();
		for (int i = 0; i < str.length(); i++) {
			map.put(temp,""+str.charAt(i));
			temp++;}
		System.out.println(map);
		System.out.println("value alloted to each character:::" );
		for (int eachChar : map.keySet()) {
			count=0;
			string =map.get(eachChar);
			for (Integer eachKey : map.keySet()) {
				if (string.equals(map.get(eachKey))) { count++;} }
			System.out.print(" ");
			System.out.println(map.get(eachChar)+"------>"+count);}
	}
}