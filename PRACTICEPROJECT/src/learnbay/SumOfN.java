package learnbay;

public class SumOfN {
	
	static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		
		int printSum = printSum(n);
		System.out.println(printSum);
	}
	
	
	public static int printSum(int x) {
		
		
		if(x>=1) {
			
			sum = sum + x;
			x--;
			
			printSum(x);
		}
		return sum;
		
	}

}
