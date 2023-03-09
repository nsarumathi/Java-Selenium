package javachallenge;

import org.testng.annotations.Test;

public class Twice_Array{

	public void twice_no(int[] a) {
	int twice=0; boolean check=false;
	for(int i=0;i<a.length;i++) {
		int cnt=0;
		for(int j=0;j<a.length;j++) {
			if (a[i]==a[j]) cnt++;}
		if(cnt==2) {twice=a[i];check=true;}
	}if(check) {System.out.println(twice+" is repeated twice,then Ans is==>"+check);}
	else {System.out.println("Given array has no repeated elements,then Ans==>"+check);}
	}
	
	@Test
	public void check() {
 int[] a= {1,2,3,1};
 int[] b= {1,2,3,4};
 int[] c= {1,1,1,3,3,4,3,2,4,2};
   
 Twice_Array no=new Twice_Array();
 no.twice_no(a);
 no.twice_no(b);
 no.twice_no(c);
 
	}
 
}
//atleast twice---true