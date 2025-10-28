package learnbay;

public class Printarrayrecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {1,2,3,4,5};
		printArray(x.length-1,x);

	}
	
	
	public static void printArray(int x,int[] y) {
		
		
		
		if(x>=0) {
			
			System.out.println(y[x]);
			
			
			x=x-1;
			
			printArray(x,y);
		}
	}

}
