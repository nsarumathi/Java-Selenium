package javachallenge;


import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class ShffledSentc_noString {
	
	public void method(String s) {
	
		//String[] strArray = new String[] {s};  ==>creation & dcelaration of string array
		Pattern ptr = Pattern.compile(" ");  
		String[] arr=ptr.split(s); //string.split,fromlist means-->toArray
		Map<Integer,String> table= new TreeMap<Integer,String>();
		
		for(int i=0;i<arr.length;i++) {
			String line=arr[i]; int no=0;
			for(int j=0;j<line.length();j++) {
				if(Character.isDigit(line.charAt(j))) {
					no=no*10; 
					no= no+ (line.charAt(j)-'0');//using character 0 =>value given to map storing,store from 1(+1,-1)
					System.out.print("no2="+(line.charAt(j)-'0')+ "  ");
				}}
			table.put(no, arr[i]);
		}
		
		System.out.println("\n"+"Mapping of String==>"+table+"\n");
		
		for(Map.Entry<Integer,String> last:table.entrySet()) {
 //System.out.print(last.getValue()+"  ");
			System.out.print(last.getValue().toString().replaceAll("\\d","") +"  ");
		}}

	public static void main(String[] args) {
		
	
	String s="is2 sentence4 This1 a3"; //rearrange as per order &remove no
	String p="Myself2 me1 I4 and3";

	ShffledSentc_noString op=new ShffledSentc_noString();
	
	op.method(s);
	op.method(p);
	
	
}}
