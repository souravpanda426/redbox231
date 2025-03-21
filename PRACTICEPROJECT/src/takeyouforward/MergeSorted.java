package takeyouforward;

public class MergeSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  long[] arr1 = {1, 4, 8, 10};
	        long[] arr2 = {2, 3, 9};
	        
	        long[] na = new long[arr1.length+arr2.length];
	        
	        int n = arr1.length;
	        int m = arr2.length;
	        
	        int first=0;
	        int second=0;
	        int newindex=0;
	        
	        while(first<n & second<m) {
	        	
	        	if(arr1[first]<=arr2[second]) {
	        		na[newindex]= arr1[first];
	        		
	        		newindex++;
	        		na[newindex]= arr2[second];
	        		newindex++; 
	        		first++; second++;
	        		
	        	}
	        	
	        	else {
	        		
	        		na[newindex]=arr2[second];
	        		newindex++;
	        		na[newindex]= arr1[first];
	        		newindex++;
	        		first++; second++;
	        		
	        		
	        	}
	        }
	        
	        
	        while(first<n) {
	        	
	        	na[newindex]=arr1[first];
	        	newindex++;
	        	first++;
	        	
	        }
	        
        while(second<m) {
	        	
	        	na[newindex]=arr2[second];
	        	newindex++;
	        	second++;
	        	
	        }
	        
	      for (int i = 0; i < na.length; i++) {
			
	    	  System.out.println(na[i]);
		}  

	}

}
