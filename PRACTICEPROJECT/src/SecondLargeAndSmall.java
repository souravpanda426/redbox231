
public class SecondLargeAndSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {2,5,1,4,3};
		

		
		int max = -1;
		
		int secondmax=-1;
		
		int Min = x[0];
		
		int secondMin = x[0];
		
		
		
		for (int i = 1; i < x.length; i++) {
			
			if(max<x[i]) {
				
				max = x[i];
			}
			
			if(Min>x[i]) {
				Min = x[i];
			}
			
		}
		
		System.out.println(max);
		
		System.out.println(Min);
		
		for (int i = 0; i < x.length; i++) {
			
			if(secondmax<x[i] & x[i]!=max) {
				
				secondmax=x[i];
				//System.out.println("secondmax"+x[i]);
				
			}
			
			if(secondMin>x[i]  & x[i]!=Min) {
				secondMin = x[i];
			}
		}
		
		
		System.out.println(secondmax); 
		
		System.out.println(secondMin);
		
		

	}

}
