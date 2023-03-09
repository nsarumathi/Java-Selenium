package javachallenge;


import java.util.Vector;

public class Str_Char {

	public static Vector<Integer> set_occrence(String S,char X) {

		int prev = Integer.MAX_VALUE;

		Vector<Integer> ans = new Vector<Integer>();

		for (int i = 0; i < S.length(); i++)
		{ if (S.charAt(i) == X)
			prev = i;
		//    System.out.println(prev);
		if (prev == Integer.MAX_VALUE)
		{ans.add(Integer.MAX_VALUE);}
		else   
			ans.add(i - prev);}
		return ans;
		}

	public static void shortest_distance(String S,char X) {
		int prev = Integer.MAX_VALUE;
	
		Vector<Integer> ans = Str_Char.set_occrence(S, X);
		System.out.println("defalt position of string:"+S+": "+ans);
		for (int i = S.length() - 1; i >= 0; i--)
		{if (S.charAt(i) == X)
			prev = i;
		
		if (prev != Integer.MAX_VALUE) {
			int a=ans.get(i); int val=prev - i;
			System.out.println("old val==>"+a+"\t"+"new val==>"+val);
			int min = Math.min(a, val);
			ans.set(i, min);}}
      System.out.println("String has position of character==>"+S+":");
		for (Integer val: ans)
			System.out.print(val+" ");

	}
	
	public static void main(String[] args) {

		String S="aaab"; char X='b';

		Str_Char.shortest_distance(S, X);

	}
}