package learnbay;

public class CapacityToShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
		
		int low=0;
		
		for (int i = 0; i < weights.length; i++) {
			
			if(low<weights[i]) {
				
				low=weights[i];
			}
		}
		
		int high=0;
		for (int i = 0; i < weights.length; i++) {
			
			high=high+weights[i];
		}
		

int capacity=20; int i=0; int sum=0; int n = weights.length; int days=0;
	
	
while(i<n) {
	
	
	while(sum<capacity) {
		
	
		
		
		sum = sum + weights[i];
		
		
			
			
		
	}
	
	i++;
	
	
	sum=0;
	days++;
	
	
	
}

		
	System.out.println(days);	
		
		
		
		
	
		
	}
	
	

	
	
	}
	
	
	
	
	
	
	


