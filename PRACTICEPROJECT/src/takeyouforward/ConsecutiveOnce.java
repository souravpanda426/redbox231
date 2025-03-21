package takeyouforward;

public class ConsecutiveOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {1,1,1,1,2,3,4,5,1,1,1,1,1,1,5};
		
		int count=0;
		
		int max=0;
		
		
		for (int i = 0; i < x.length; i++) {
			
			
			if(x[i]==1) {
				
				count++;
			}
			
			else {
				
			max = Math.max(max, count);
			
			count=0;
			
			
			}
			
			
		}
		
		
	
		
		System.out.println(max);
		
	

	}

}
