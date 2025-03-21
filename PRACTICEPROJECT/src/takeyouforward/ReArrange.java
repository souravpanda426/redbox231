package takeyouforward;

import java.util.ArrayList;

public class ReArrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {1,2,-3,-4};
		int[] na  = new int[x.length];
		
		ArrayList<Integer> positives = new ArrayList<Integer>();
		ArrayList<Integer> neagtives = new ArrayList<Integer>();
		
		
		
		
		for (int i = 0; i < x.length; i++) {
			
			if(x[i]>0) {
				positives.add(x[i]);
				
			}
			
			else {
				
				
				neagtives.add(x[i]);
			}
		}
		
		
		for (int i = 0; i <x.length/2; i++) {
			
			na[2*i]=positives.get(i);
			na[2*i+1]=neagtives.get(i);
			
			
			
		}
		
		for (int i = 0; i < na.length; i++) {
			
			System.out.print(na[i]);
			
		}
		

	}
	
	
	
	

}
