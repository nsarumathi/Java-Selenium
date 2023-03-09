package javachallenge;

public class DistinctElement {
	public void element(int[]a,int k) {
		boolean ans=false;
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++) {
				if(a[i]==a[j]) {
				 int sln=Math.abs(i-j);//retrns only positiv vale
				 boolean check=(sln<=k);
				 ans=check;}}}
				 System.out.println("Output=="+ans);}
	
public static void main(String[] args) {
	int[] a= {1,2,3,1}; int k1=3;
	int[] b= {1,0,1,1}; int k2=1;
	int[] c= {1,2,3,1,2,3}; int k3=2;
	//ans :t,t,f
	// nums[i] == nums[j] and abs(i - j) <= k
	
	 DistinctElement answer=new  DistinctElement ();
	 
	System.out.println("Array1:");
	answer.element(a, k1);
	System.out.println("Array2:");
	answer.element(b, k2);
	System.out.println("Array3:");
	answer.element(c, k3);
	
}
}
