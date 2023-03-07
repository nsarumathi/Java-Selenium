package javaprogram.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	public static void main(String[] args) {
		String email="Sar_Mathi.Nallasivam97@gmail.com";
		String Written="[a-zA-Z._0-9]+@[a-z]+.[a-z]{2,3}";
		Pattern compile = Pattern.compile(Written);
		Matcher check = compile.matcher(email);
		System.out.println("Validation sucess=="+check.matches());
	//no of string has word char	
	System.out.println("charcter class with qantifier========" );
	System.out.println(" ");
	
		String line="We learn java basics as part of 10 sessions in 4 weeks";
		String A="\\w+";
		Pattern allot = Pattern.compile(A);
		Matcher ans = allot.matcher(line);
		while(ans.find()) {
		System.out.println(ans.group());}
	//no of string has no's by each digit
	System.out.println("only charcter class=======");
	
	System.out.println(" ");
	
		String B="\\d";
		Pattern wrote = Pattern.compile(B);
		Matcher res = wrote.matcher(line);
		System.out.println("checking=="+ res.find());
		while(res.find()) {
		System.out.println(res.group());}
	//replace of one char to another	
		String next=line.replaceAll("\\d", " ");
		System.out.println(next);
	//no of strings	
		String[] split = line.split("\\s");
		System.out.println("array length==="+split.length);
		for(String each:split) {
			System.out.println(each);}
		
		

}}
