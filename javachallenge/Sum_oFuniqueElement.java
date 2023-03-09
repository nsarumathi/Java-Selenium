package javachallenge;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sum_oFuniqueElement {
	
	public static void main(int[] a) {
		Set<Integer> distinct=new LinkedHashSet<Integer>();

		for(int i=0;i<a.length;i++) {
			int cnt=0;
				for(int j=0;j<a.length;j++) {
						if(a[i]==a[j]) { cnt++;}}
						if(cnt==0 || cnt==1) {distinct.add(a[i]);}
					}
		System.out.println("distinct element==>"+distinct);
		List<Integer> find=new ArrayList<Integer>(distinct);

		int[] array=new int[find.size()];  	int sm=0;
	    for(int i=0;i<find.size();i++) {
	    	array[i]=find.get(i); //read elements from list
	    	sm=sm+array[i];
	    }System.out.println("Sum of unique elements in array==>"+sm);}
		
	
	public static void main(String[] args) {
	int[] a= {1,2,3,2};//sum unique element in array
	int[] b= {1,1,1,1};
	int[] c= {1,2,3,4,5};

	Sum_oFuniqueElement.main(a);
	Sum_oFuniqueElement.main(b);
	Sum_oFuniqueElement.main(c);
}}
