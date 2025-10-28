package learnbay;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] x = {1,2,3,4,5,6};
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				
				int sum=0;
				
				for (int k = i; k <=j; k++) {
					
					sum = sum + x[k];
					
				}
				
				System.out.println(sum);
			} 
		}
	}

}
