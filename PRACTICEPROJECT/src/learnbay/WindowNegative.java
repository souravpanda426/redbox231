package learnbay;

public class WindowNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {1,2,-1,3,4,-2,-8,5,7,9,-10};
		
		int k=3;
		
		for (int i = 0; i <=x.length-k; i++) {
			
			
			boolean b = true;
			
			for (int j = i; j < i+k; j++) {
				
				if(x[j]<0) {
					
					b=false;
					
					System.out.print(x[j]);
					break;
				}
				
			}
			
			if(b==true) {
				
				System.out.print(" "+0);
			}
		}

	}

}
