package takeyouforward;

public class MaximumProductValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  Nums = {1,2,3,4,5,0};
		
		int max=0;
		
		for (int i = 0; i < Nums.length; i++) {
			
			int product = 1;
			
			
			for (int j = i; j < Nums.length; j++) {
				
				product = product*Nums[j];
				
				if(max<product) {
					
					max = product;
				}
				
			}
		}
		
		System.out.println(max);
		

	}

}
