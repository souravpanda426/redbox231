  package mypackage;

import java.util.ArrayList;

public class KadaneAlgorithm {
	
	static ArrayList<Integer> al;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1, 2, 3, -2, 5};
		

		
		int start=0;
		
		int end=x.length;
		
		int max=0;
		
		for(int i=start;i<=end-1;i++) {
			
		
			
			
			for(int k =start+1;k<=end-1;k++) {
				
				int d = i;
				
				
			  al =  new ArrayList<Integer>();
			  
			  
			
				while(d<=k) {
					
					al.add(x[d]);
					
					d++;
				}
				
				//System.out.println(al);
				
				int sum =0;
				
				
				for(int j=0;j<al.size();j++) {
					
					sum = sum + al.get(j);
					
				
				}
				
				//System.out.println(sum);
				
                if(max<sum) {
					
					max=sum;
				}
				
			
			}
			
			
			
		}
		
	for(int i=start;i<=end-1;i++) {
			

			
			
			
			for(int k =start+1;k<=end-1;k++) {
				
				
				int d = i;
				
			  al =  new ArrayList<Integer>();
			
				while(d<=k) {
					
					al.add(x[d]);
					
					d++;
				}
				
				
				int sum =0;
				
				
				for(int j=0;j<al.size();j++) {
					
					sum = sum + al.get(j);
					
				
				
				if(max==sum) {
					
					
					
					while(i<=k) {
						
						System.out.println(x[i]);
						i++;
					}
				}
				
				
				
			}
				
			
			}
			
			
			
		}

		
      
		

	}
		

}
	

	

