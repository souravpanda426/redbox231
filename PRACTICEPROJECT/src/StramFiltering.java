import java.util.ArrayList;
import java.util.stream.IntStream;

public class StramFiltering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {1,2,3,4,2,3,7,8,9};
		
		int count =0;
		
		//IntStream filter = IntStream.range(0, ar.length).filter(n -> ar[n]%2==0);
		int l =0;
		
		
		//filter.map(n -> ar[n]).forEach(System.out::println);
		
		for (int i = 0; i < ar.length; i++) {
			
		
			
			for (int j = i+1; j < ar.length; j++) {
				
				if(ar[i]==ar[j]) {
					
					count++;
					
				}
				
				
				
				}
			
     
		
		
		
		}
		
		int[] na = new int[ar.length-count];
		
		
      for (int i = 0; i < ar.length; i++) {
			
			int count2=1;
			
			for (int j = i+1; j < ar.length; j++) {
				
				if(ar[i]==ar[j]) {
					
					count2++;
					
				}
				
				
				
				
				
				}
			
			if(count2==1) {
				na[l]=ar[i];
				l++;
			}
			
     
		
		
		
		}
      
      for (int i = 0; i < na.length; i++) {
		
    	  System.out.println(na[i]);
	}
		
	
}
	
}


