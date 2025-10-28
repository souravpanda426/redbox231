package learnbay;

import java.util.HashSet;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = { 2,1,3,2,2,1,2};
		
		int majority = majority(x);
		
		HashSet<Integer> hm = new HashSet<Integer>();
		System.out.println(hm.contains(2));
		
		System.out.println(majority);


	}
	
	public static int majority(int[] x) {
		
       int  lead  = 1;
		
		int candidate = x[0];
		
		
		for (int i = 1; i < x.length; i++) {
		
			
		 if(candidate==x[i]) {
				
				lead++;
			}
			
			else {
				
				lead--;
				
				if(lead==0) {
					
					candidate=x[i];
					lead=1;
				}
				
				
		}
			
		
		
	}
		return candidate;

}
	
}
