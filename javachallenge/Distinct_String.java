package javachallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Distinct_String {
	
	public static void Check(String[]a,int k) {
		List<String> word=new ArrayList<String>(Arrays.asList(a));
		System.out.println("List==>"+word);
		Set<String> distinct=new LinkedHashSet<String>();

		for(int i=0;i<word.size();i++) {
			int cnt=0;
				for(int j=0;j<word.size();j++) {
						if(word.get(i)==word.get(j)) { cnt++;}}
						if(cnt==0 || cnt==1) {distinct.add(word.get(i));}
					}
		System.out.println("distinct element==>"+distinct);
		List<String> find=new ArrayList<String>(distinct);
	
		if(find.size()>=k ) {
		String distinct_string = find.get(k-1);
		System.out.println("Distinct_string in array==>"+distinct_string+" : in "+k+" index");}
		else {System.out.println("There is no distinct element in "+k+" index");}
		
	}

	public static void main(String[] args) {
	String[] a= {"d","b","c","b","c","a"}; int k=2; //pick 2nd distinct element in array
	String[] b= {"aaa","aa","a"}; int l=1;  //pick 1nd distinct element in array
	String[] c= {"a","b","a"}; int m=3;    //pick 3nd distinct element in array
	
	Distinct_String.Check(a, k);
	Distinct_String.Check(b, l);
	Distinct_String.Check(c, m);
	
}}
