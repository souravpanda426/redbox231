package learnbay;

public class MaximumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {3,5,1,2,8,4,6,2,5,4};
		
		int max=0;int sum=0;
		int k=3;
	
		
		for (int i = 0; i < x.length; i++) {
			
	
			
			for (int j = i; j <k; j++) {
				
				sum = sum + x[j];
				
				
				
			}
			
			
			
		if(max<sum) {
			
			max=sum;
			sum=0;
		}
				
				
			}
		
		System.out.println(max);
			
		}
		
	

	}


