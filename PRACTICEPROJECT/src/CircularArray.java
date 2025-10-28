
public class CircularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {5,2,-1,3};
		int sum=0;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < x.length; i++) {
			
			sum = sum + x[i];
			
			max = Math.max(sum, max);
			
			if(sum<0) {
				
				sum=0;
			}
			
		}
		
		int sum2=0;
		
		
		
		
        for (int i = x.length-1; i >=0; i--) {
			
			sum2 = sum2 + x[i];
			
			max = Math.max(sum2, max);
			
			if(sum2<0) {
				
				sum2=0;
			}
			
		}
		
		
		System.out.println(max);
	}

}
