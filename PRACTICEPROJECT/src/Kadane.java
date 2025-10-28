
public class Kadane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {1,-2,3,-2};
		int sum=0;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < x.length; i++) {
			
			sum = sum + x[i];
			
			 if (sum > max) {
	                max = sum;
	            }
			
			if(sum<0) {
				
				sum=0;
			}
			
		}
		
		
		System.out.println(max);
	}
	


}
