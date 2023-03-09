package javachallenge;

import java.util.HashSet;
import java.util.Set;

public class Array_unique {


	public static void check_array(int[] a) {

		Set<Integer>single=new HashSet<Integer>();
		Set<Integer> occrance=new HashSet<Integer>();
		int[] array=new int[a.length];
		for(int i=0;i<a.length;i++){
			int cnt=0;
			for(int j=1;j<a.length;j++) {
				if(a[i]==a[j]) cnt++;array[i]=cnt;}//to count frequency of element repetition 
			if (cnt==1 || cnt==0){single.add(a[i]);}
			else{occrance.add(a[i]);}}
		boolean empty = occrance.isEmpty();
		if(empty)
		{System.out.println("Given array is not unique,this statement is"+ empty);
		System.out.println("single element==>"+single);}
		else
		{System.out.println("Given array is unique,this statement is true");
		System.out.println("occrance==>"+occrance);}
	}




	public static void main(String[] args) {
		int[] a= {1,2,2,1,1,3};
		int[] b= {1,2};
		int[] c= {-3,0,1,-3,1,1,1,-3,10,0};

		Array_unique.check_array(a);
		Array_unique.check_array(b);
		Array_unique.check_array(c);

	}}

//ans=t,f,t
