package learnbay;

public class NumberOfdays {

	
	public static void main(String[] args) {
		
		int days=0;
		
		int sum=0;
		int[] x = {3,2,2,4,1,4};
		
		
		for (int i = 0; i < x.length; i++) {
			
				sum = sum + x[i];
				
			
				
				if(sum>10){
					
					days++;
					sum=x[i];
				}
				
				if(sum==10) {
					
					days++;
					sum=0;
				}
				
				
			
		}
		
		if(sum<10) {
			
			days++;
		}
		
		
		
		System.out.println(days);
	}
}
