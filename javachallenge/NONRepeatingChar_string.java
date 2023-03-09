package javachallenge;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NONRepeatingChar_string {

	//Approach1
	public void loop(String s) {
		int length=s.length();
		System.out.println("Array Length=="+length);
		List<Character> list=new LinkedList<Character>();
		for(int i=0;i<length;i++) 
		  { char c=s.charAt(i);boolean ans=true;
		for(int j=0;j<length;j++) 
		  {char d=s.charAt(j);
		   if(i!=j && c==d) {ans=false;}}
		   if(ans) {
			list.add(c);
			System.out.println("Non Repeated charcter=="+c+":::::index==>"+s.indexOf(c));}}
		if(list.isEmpty()){System.out.println("There is repeating element only,then Ans=-1");}
		else{
			System.out.println("Non Repeated charcter list=="+list);
			System.out.println("First Non Repeated charcter=="+list.get(0));}}



	//Approach2
	public void map(String s) {
		int ans=0;
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);}
			else {map.put(ch,1);}}
		System.out.println("map="+map);

		for(Entry<Character,Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("non repeating element=="+ entry.getKey());
				break;}
			else{ans=-1;}}
		if(ans==-1){System.out.println("There is repeating element only,then Ans=-1");}}

	public static void main(String[] args) {
		String m="leetcode";    
		String r="loveleetcode";
		String n= "aabb";
		String s= "baabb";

		NONRepeatingChar_string op=new NONRepeatingChar_string();

		System.out.println(">>>>>Approach 1<<<<");
		op.loop(n); op.loop(r);
		System.out.println(">>>>>Approach 2<<<<");
		op.map(m); op.map(s);



	}}//ans:0,2,-1
