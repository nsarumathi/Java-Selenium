package javachallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LuckyNo_array {
	
	public static void find_no(int[] a) {
	
    Set<Integer> lucky=new HashSet<Integer>();
    for(int i=0;i<a.length;i++){
		int cnt=0;
		for(int j=0;j<a.length;j++) {
			if(a[i]==a[j]) {cnt++;}
			if(cnt==a[i]) {lucky.add(a[i]);}
			
			}}
    if(lucky.isEmpty()){System.out.println("There is no lucky no");} 
    else {System.out.println("lucky no==>"+lucky);}
			
}
	
	public int find_noByMap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int n : arr) {map.put(n, map.getOrDefault(n, 0) + 1);}
        int max = -1;

        for (int n : map.keySet()) {
            if (n == map.get(n)) {
                max = Math.max(max, n);}}
        System.out.println("Result==>"+max);
        return max;
    }
	
	public static void main(String[] args) {
		
		int[] a= {2,2,3,4}; //frequency is same as value==> 2 repetion is 2 time ,same as value 2
		int[] b= {1,2,2,3,3,3};
	    int[] c= {2,2,2,3,3};
	    
	//    LuckyNo_array.find_no(a);
	//    LuckyNo_array.find_no(b);
	//    LuckyNo_array.find_no(c);
	    
	    LuckyNo_array op=new LuckyNo_array();
	    op.find_noByMap(c);
	    op.find_noByMap(a);
	    op.find_noByMap(b);
	    
	}}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    