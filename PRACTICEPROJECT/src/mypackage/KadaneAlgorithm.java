package mypackage;

public class KadaneAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1, 2, 3, -2, 5};
		
		int start=0;
		
		int end=x.length;
		
		int max=0;
		
		for(int i=start;i<=end-1;i++) {
			
			int sum = x[i];
			
			
			for(int k =start+1;k<=end-1;k++) {
				
				sum = sum + x[k];
				
			}
			
			if(max<sum) {
				
				max=sum;
			}
			
			
			
			
			
		}
		
		System.out.println(max);
		
		while(start<end) {
			
			System.out.println(x[start]);
			
			start++;
		}
		

	}

}
