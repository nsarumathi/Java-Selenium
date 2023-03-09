package javachallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

import java.util.List;
import java.util.Set;

public class StringArr_dplicate {
	public static void dplicate(String[] word1){ 
		
		List<String> word=new ArrayList<String>(Arrays.asList(word1));
		System.out.println("List==>"+word);
		Set<Character> dplicate=new LinkedHashSet<Character>();

		for(int i=0;i<1;i++) {
			for(int m=0;m<word.get(i).length();m++) {
				char c = word.get(i).charAt(m);
				int cnt=0;
				for(int j=1;j<word.size();j++) {
					for(int n=0;n<word.get(j).length();n++) {
						char d = word.get(j).charAt(n);
						if(c==d) { cnt++;}
						if(cnt==2) {dplicate.add(c);}}}}}
		System.out.println("dplicate==>"+dplicate);}

	public static void main(String[] args) {
		String[] word1= {"belLa","Label","roLler"};
		String[] word2= {"cool","lock","cook"}; 
		
		StringArr_dplicate.dplicate(word1);
		StringArr_dplicate.dplicate(word2);
		
		
		
		
}}
