package javachallenge;

import java.util.HashSet;
import java.util.Set;

public class Jewel {
	public int String(String jewel,String stone) {
		Set<Character> set = new HashSet<Character>();
        for (Character c: jewel.toCharArray()) {
            set.add(c);}
        int count = 0;
        for (Character c: stone.toCharArray()) {
            if (set.contains(c)) {
                count++;}}
        System.out.println("Stone count in jewel="+count);
        return count;
	}
	public static void main(String[] args) {
		String j1="aA"; String stone1="aAAbbbb";
		String j2="z"; String stone2="ZZ";
		Jewel check=new Jewel();
		System.out.println("Jewel 1======");
		check.String(j1, stone1);
		System.out.println("Jewel 2======");
		check.String(j2, stone2);
		
		 
	    }
	}
	
		
