package javachallenge;

public class FindsqrRoot {
	public static void main(String[] args) {
		int x=8; int y=15;
		
	           //format1-before decimal places only
				double ans=Math.sqrt(x);
				System.out.println("Ans(double)="+ans);
				int a=(int)ans;
				System.out.println("Integer value only=="+a);
				
				//format2-round value
				double ans1=Math.sqrt(y);
				System.out.println("Ans1(double)="+ans1);
				int b=(int)Math.round(ans1);			
				System.out.println("Round Integer value=="+b);
	}


}
