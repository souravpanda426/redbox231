
public class SumOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		
		int y = findSum(n);
		System.out.println(y);

	}
	
	
	
	public static int findSum(int n) {
		
		
		if(n==5) {
			
			return 15;
		}
		
		int faith = findSum(n-1);
		
		int ans = faith + n;
		return ans;
		
	}

}
