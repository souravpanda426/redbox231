package takeyouforward;

import java.util.*;

public class Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {1,2,-1,-2,4,0,-1};
		
		int target=-2;
		
		
		Set<List<Integer>> as = new HashSet();
	
		
		for (int i = 0; i < x.length; i++) {
			
			
			HashSet<Integer> al  = new HashSet<Integer>();
			
			al.add(x[i]);
			
			for (int j = i+1; j < x.length; j++) {
				
				
				int tempsum = x[i]+x[j];
				
				int rem= target-tempsum;
				
				if(al.contains(rem)) {
					
				 List<Integer> asList = Arrays.asList(x[i],x[j],rem);
				 asList.sort(null);
				 as.add(asList);
					
					
				}
				
				else {
					
				
					al.add(x[j]);
				}
				
				
				
			}
		}
		
       
		
		System.out.println(as);
		

	}

}
