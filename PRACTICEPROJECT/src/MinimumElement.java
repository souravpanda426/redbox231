
public class MinimumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {1,2,3,-1,4,5,-2};
		
		int min = x[0];
		
		int secondMax=0;
		
		int max=0;
		
		for (int i = 1; i < x.length; i++) {
			
			if(min>x[i]) {
				
				min = x[i];
			}
		}
		
		System.out.println(min);
		
		
     for (int i = 1; i < x.length; i++) {
			
			if(max<x[i]) {
				
				max = x[i];
			}
		}
     
     for (int i = 0; i < x.length; i++) {
			
			if(secondMax<x[i] & x[i]!=max) {
				
				secondMax=x[i];
			}
		}

     
  

     System.out.println(secondMax);
     
	}
	


}
