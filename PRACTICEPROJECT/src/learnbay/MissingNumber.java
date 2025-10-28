package learnbay;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {5,1,2,6,4};
		
		int sum = 0;
		
		for (int i = 0; i < x.length; i++) {
			
			sum = sum + x[i];
		}
		
		int n = 6;
		
		int sum2=0;
		
		for (int i = 0; i <=n; i++) {
			
			sum2=sum2+i;
		}
		
		System.out.println(sum2-sum);
		
		double ceil = Math.ceil(3/4);
		System.out.println(ceil);
		
		

	}

}
