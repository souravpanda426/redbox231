
public class HighestAndSecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {22,31,19,11,7};
		
		
		int max=0;
		
		int secondMax=0;
		
		for (int i = 0; i < x.length; i++) {
			
			if(max<x[i]) {
				
				secondMax=max;
				
				
				max= x[i];
			}
			
			else if(secondMax<x[i]& x[i]!=max) {
				
				secondMax=x[i];
			}
		}
		
		System.out.println(secondMax);
	}
	
	
}
