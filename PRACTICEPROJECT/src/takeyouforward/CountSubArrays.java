package takeyouforward;

import java.util.HashMap;

public class CountSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] x = {4, 2, 2, 6, 4};;
		
		int sum =0;
		
		int count =0;
		
		int target=6;
		
		/*for (int i = 0; i < x.length; i++) {
			
			 sum =x[i];
			
			
			for (int j = i+1; j < x.length; j++) {
				
				
				sum = sum + x[j];
				
				if(sum==target) {
					count++;
					
				}
			}
		}
		
		System.out.println(count);*/
		
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < x.length; i++) {
			
			 sum =sum +x[i];
			 
			 int rem = sum-target;
			 
			 
			 if(sum==target) {
				 
				 count++;
			 }
			 
			 
			 if(!hm.containsKey(sum)) {
				 
				 hm.put(sum, i);
				
			 }
			 
			 if(hm.containsKey(rem)) {
				 
				 count++;
			 }
			
			 
		
		}
		
	
		System.out.println(count);	
		

	}
		
	


	
}
