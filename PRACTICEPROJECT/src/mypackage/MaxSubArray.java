package mypackage;

public class MaxSubArray {
	
	
	 public static long maxSubarraySum(int[] arr, int n) {
	        long maxi = Long.MIN_VALUE; // maximum sum
	        long sum = 0;

	        int start = 0;
	        int ansStart = -1, ansEnd = -1;
	        for (int i = 0; i < n; i++) {

	            if (sum == 0) start = i; // starting index

	            sum += arr[i];

	            if (sum > maxi) {
	                maxi = sum;

	                ansStart = start;
	                ansEnd = i;
	            }

	            // If sum < 0: discard the sum calculated
	            if (sum < 0) {
	                sum = 0;
	            }
	        }

	      
	       
	        for (int i = ansStart; i <= ansEnd; i++) {
	        	
	        	
	        
	        	System.out.print(arr[i] + " ");
	        }
			return maxi;
	        
	 }
	      

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
		
		

	}

}
