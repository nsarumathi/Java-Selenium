package javaprogram.string;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


public class Str_Literal_Duplicates {
	public static void main(String[] args) {
		String Text="We learn java basics as part of java sessions in java week1";
		int count;
		String[] words=Text.split(" ");   
		System.out.println("Words Length = "+ words.length);
		List<String> ORG =new ArrayList<String>(Arrays.asList(words));
		System.out.println("Original String == " + ORG);

		List<String> line =new ArrayList<String>();
		List<String> Duplicate =new ArrayList<String>();
		for(int i=0;i<words.length;i++) {
			count=1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) { 
					count++ ; 
					words[j]="";}}
			if(count>1) {Duplicate.add(words[i]);}
			line.add(words[i]);}

		System.out.println("String After Duplicate Removal = "+ line);
		System.out.println("Words length aftr Duplicate Removal="+ line.size());

		System.out.println("Duplicate word in string= "+ Duplicate);
		System.out.println("no of Duplicate words="+ Duplicate.size());

		String[] last = new String[line.size()];//new string creation
		String[] Dup=line.toArray(last);//addition to new string array from list(list to array conversion)

		System.out.println("Final String is == ");
		for (String Final: Dup) {
			System.out.print(Final+" ");}


	}
}
