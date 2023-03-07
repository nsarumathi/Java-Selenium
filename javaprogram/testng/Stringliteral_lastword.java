package javaprogram.testng;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;


public class Stringliteral_lastword {
	public void find_word(String no) {
	String[] split = no.split("\\s");	
//	System.out.println("String==>");
//	for(String each:split) {
//		System.out.println(each);}
//	System.out.println(Arrays.toString(split));
	List<String> list=Arrays.asList(split);
	System.out.println("List==>"+list);
	System.out.println("array length==="+split.length);
	String lastword=list.get(split.length-1);
	System.out.println("lastword of "+list+" is==>"+lastword);
	System.out.println("lastword size=="+ lastword.length());}

	@Test
	public void check() {
		Stringliteral_lastword check=new Stringliteral_lastword();
		check.find_word("Luffy is still joyboy");	
		check.find_word("Fly me to the moon");
	}
	
	@Test
	public void lastword() {
		String no1="Hello World";
		String[] split = no1.split("\\s");	
		System.out.println("array length==="+split.length);
		
		for(int i=0;i<split.length;i++) {
			if(i==split.length-1) {
			System.out.println("Lastword of "+no1+" is==>"+split[i]);
			System.out.println("Lastword size==>"+split[i].length());}}	
	}

}
