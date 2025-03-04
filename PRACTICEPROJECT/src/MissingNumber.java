
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {1,2,3,5};
		
		int N = 5;
		
		int sum = (N*(N+1))/2;
		
		System.out.println(sum);
		
		int arsum = 0;
		
		for (int i = 0; i < x.length; i++) {
			
			arsum = arsum + x[i];
		}
		
		System.out.println(sum-arsum);

	}

}
