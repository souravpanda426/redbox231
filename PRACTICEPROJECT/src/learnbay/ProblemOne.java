package learnbay;

public class ProblemOne {

	public static void main(String[] args) {
		
		int k = 3;
		// TODO Auto-generated method stub
		
		int[] x = {1,2-1,3,4,-2,-8,5,7,9,-10};
		
		for (int i = 0; i < x.length; i++) {
			
			boolean b = false;
			
			for (int j = i; j < k; j++) {
				
				if(x[j]<0) {
					
					System.out.println(x[j]);
					b = true;
				}
				
			}
			
			if(b==false) {
				
				System.out.println(0);
			}
		}

	}

}
