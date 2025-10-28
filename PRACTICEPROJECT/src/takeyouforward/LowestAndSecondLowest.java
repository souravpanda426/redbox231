package takeyouforward;

public class LowestAndSecondLowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {22,31,19,11,17};
		
		
		int min = x[0];
		
		int secondmin = x[0];
		
		
		for (int i = 1; i < x.length; i++) {
			
			if(min>x[i]) {
				
				secondmin = min;
				min = x[i];
				
			}
			
			else if(secondmin>x[i] & x[i]!=min) {
				
				secondmin=x[i];
			}
		}
		
		
		System.out.println(secondmin);

	}

}
