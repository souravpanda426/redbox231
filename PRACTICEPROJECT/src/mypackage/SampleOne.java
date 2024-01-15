package mypackage;

public class SampleOne {
	
	//quest-Given an array Arr[] of N integers. 
	//Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {5,6,7,3,-9,8,7,-5,4,3};
		
		int start=0;
		
		int end=arr.length;
		
		int max=0;
		
		
		

		
		for(int i=start;i<end;i++) {
			
			int sum=0;
			
			
			for(int j =i+1;j<arr.length;j++) {
				
				sum = sum + arr[i]+ arr[j];
			}
			
			
			if(sum>max) {
				max=sum;
				
				
				
				
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
    }
		
			
		}
			
		
		
		
		

	


