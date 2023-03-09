package javachallenge;


import java.util.LinkedList;
import java.util.List;


public class Maxno_WordsInarray {
	

	public static void Check_wordcnt(String[] a) {

		List<String> str=new LinkedList<String>();
		int length=a.length;
		int max=0; 
		for(int i=0;i<length;i++){
			String[] words = a[i].split(" ");
		//	System.out.println(Arrays.toString(words));
			int word_length=words.length;
				max=Math.max(max, word_length);}
		
		for(int i=0;i<length;i++){
			String[] words = a[i].split(" ");
			if(max==words.length) 
				for(int j=0;j<max;j++) {
				str.add(words[j]);}}
			
		System.out.println("String has max words is==>"+str);
		System.out.println("max words in array element "+ max);}

		public static void main(String[] args) {

			String[] a= {"alice & bob love leetcode","i think so too","this is great thanks very mch"}; //6
			String[] b= {"please wait","contine to fight","contine to win"}; //3


			 Maxno_WordsInarray.Check_wordcnt(a);
			 Maxno_WordsInarray.Check_wordcnt(b);
	}}
