package learnbay;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {9,9,7,7,8,8,4,4,2,3,3,1,1};
		//find the number occuring once
		
		int luckyNumber = isLuckyNumber(x);
		System.out.println(luckyNumber);
		
		System.out.println(5>=3);
		
		
		
		

	}
	
	
	public static int isLuckyNumber(int[] y) {
		int low=0; int idx=0;
		int high = y.length-1;
		int mid=0;
		
		
		 if(y.length==1){
			 
			 low=2;

	            return y[0];
	            
	        }
		 
		 

		while(low<=high) {
			
			
			 mid = (low+high)/2;
			 
			 idx=mid;
			
			
			if(y[mid]!=y[mid-1] && y[mid]!=y[mid+1]) {
				
				return y[mid];
			}
			
			
			
			else if(y[mid]==y[mid-1]) {
				
				idx=mid-1;
			}
			
			if(idx%2==0) {
				
				low = idx+2;
				
			}
			else if(idx%2!=0){
				high = idx-1;
				
			}
		}
		return y[mid];
		
		
	}

}
