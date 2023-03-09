package javachallenge;

import java.util.Set;
import java.util.TreeSet;

public class NOnHappy {
	public  static int happyno(int m) {
		int sq=0,sq1=0;int rem;
		while (m>1) {
			rem=m%10;
			sq=sq+rem*rem;
			m=m/10;
			sq1=sq+m*m; }
		return sq1;}
	
	public static boolean ishappyno(int m) {
		Set<Integer> s=new TreeSet<Integer>();
		s.add(m);
		int a=(Integer) s.toArray()[s.size()-1];
		 System.out.println("setbfr="+s);
		while(true) {
			if(m==1) return true;
			else{m=happyno(m);
			System.out.println("no=="+m);}
	
	        if(s.contains(m) && m!=a) return false;
	        else{s.add(m);
		    System.out.println("setaftr="+s);} }}
	

public static void main(String[] args) {
	int m=19; //1+81=82-->64+4=68-->36+64=100-->1+0+0=1
			  //when last ans is reduced to one digit which has "1"; then it is happy no;
	int n=11;
 
	System.out.println("\t");
	
	if( NOnHappy.ishappyno(m)) {System.out.println(n+"==yes-it is happy no");}
	else {System.out.println(n+"==No,not an happy no");}
	
		System.out.println("\t");
		
		if( NOnHappy.ishappyno(n)) {System.out.println(n+"==yes-it is happy no");}
		else {System.out.println(n+"==No,not an happy no");}
		
		
}}

//double sqr1=Math.pow(rem, 2);