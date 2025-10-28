package learnbay;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {3,5,1,2,8,6,5,2,4};
		
		int k=3; int max=0;
		
		for (int i = 0; i < x.length-k; i++) {
			
			int sum=0;
			
			for (int j = i; j < i+k; j++) {
				
				sum = sum + x[j];
				
			}
			
		
			
			 max = Math.max(max, sum);
		}
		
		System.out.println(max);
	}

}
