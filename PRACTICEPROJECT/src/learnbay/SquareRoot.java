package learnbay;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 16;
		int low=1;
		int high = 16;
		int ans=0;
		
		while(low<=high) {
			
			int mid = (low + high)/2;
			
			if(mid*mid==n) {
				
				ans=mid;
			}
			
			else if(mid*mid>n) {
				
				high = mid-1;
			}
			
			else {
				
				low = mid +1;
			}
		}
		
		System.out.println(ans);
	}

}
