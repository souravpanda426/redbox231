
public class MinimumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {1,-2,3,-2};
		int min = Integer.MAX_VALUE;
		int sum = 0;
		
		
		
		for (int i = 0; i < ar.length; i++) {
			
			sum = sum + ar[i];
			sum = Math.min(sum, ar[i]);
			min = Math.min(sum, min);
			
		
			
			
		}
		
		System.out.println(min);

	}

}
