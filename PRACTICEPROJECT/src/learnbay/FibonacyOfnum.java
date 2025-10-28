package learnbay;

public class FibonacyOfnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FibonacyOfnum f = new FibonacyOfnum();
		f.fibonacy(0, 1,20);

	}
	
	public void fibonacy(int x,int y,int limit) {
		
		
		if(x<limit) {
			
			System.out.print(x+" ");
			int z = x + y;
			
			y = x;
			x=z;
			
			fibonacy(x,y,limit);
			
			
		}
	}
	
	
	

}
