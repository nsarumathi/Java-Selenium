package javaprogram.string;

public class ReverseName {
	public static void main(String[] args) {

		String Name = "Sarumathi Nallasivam";
		String output="Sarumathi nallasivam";
		System.out.println("Name=="+ Name);
		System.out.println(Name.charAt(10));
//index of
		System.out.println(Name.indexOf('N'));
		System.out.println(Name.indexOf('i', 9));
		System.out.println(Name.indexOf("sivam"));
		System.out.println(Name.indexOf("as", 3));
//contains- gives boolean output
		System.out.println(Name.contains("mathi"));
//String to char conversion
		char[] Each=Name.toCharArray();
		System.out.println(Each);		
//equalsIgnoreCase=it will ignore lower & upper case letters even-though it has same characters 
		if(Name.equalsIgnoreCase(output)) {System.out.println("true");}
		else{System.out.println("False");}
//equals==Case sensitive
		if(Name.equals(output)) {System.out.println("true");}
		else{System.out.println("False");}
//content equals==creates instance of stringBuffer
		StringBuffer Input=new StringBuffer("Nallasivam");
		if(Name.contentEquals(Input)) {System.out.println("true");}
		else{System.out.println("False");}
//content equals==creates instance of Character sequence	
		CharSequence New="Sarumathi Nallasivam";
		if(Name.contentEquals(New)) {System.out.println("true");}
		else{System.out.println("False");}
		
//Full reverse	
		
		String[] split=Name.split("");
		 System.out.println("Print String Name==");
		for (int i=0;i < split.length; i++) {
	           System.out.println(split[i]+" ");} //println is used ,so it prints in new line
		
		System.out.println("Reverse of Name==");
		for (int j = split.length-1 ; j >=0 ; j--) {
	           System.out.print(split[j]+" ");}

}}