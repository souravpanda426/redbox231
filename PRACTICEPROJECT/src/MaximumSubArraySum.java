
public class MaximumSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		int max=0;
		
		for (int i = 0; i < x.length; i++) {
			
			
			
			for (int j = i; j < x.length; j++) {
				
				int sum = 0;
				
				for(int k = i;k<=j;k++) {
					
					sum = sum + x[k];
					
				}
				
				
				if(max<sum) {
					
					max = sum;
				}
				
			}
			
		}
		
for (int i = 0; i < x.length; i++) {
			
			
			
			for (int j = i; j < x.length; j++) {
				
				int sum = 0;
				
				for(int k = i;k<=j;k++) {
					
					sum = sum + x[k];
					
				}
				
				
				if(max==sum) {
					
					for(int k = i;k<=j;k++) {
						
						System.out.println(x[k]);
						
					}
					
				
				}
				
			}
			
		}
		
	}

}
