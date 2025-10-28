package learnbay;

public class RecursionFibonacy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fibonacy = fibonacy(5);
		//System.out.println(fibonacy);
		

	}
	
	
	public static int fibonacy(int n) {
		
		if(n<=1){
			return n;
			
		}
		
		
		int a = fibonacy(n-1);
		//System.out.println("a value is" + a+" ");
		
		int b = fibonacy(n-2);
		//System.out.println("b value is" + b+" ");
		int ans = a + b;
		System.out.print(ans+" ");
		return ans;

}
	
}
