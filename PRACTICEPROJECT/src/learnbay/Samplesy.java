package learnbay;

public class Samplesy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	 public static boolean isPowerofTwo(int n) {
	        // code here
	       
	       int x =(int)Math.pow(2,n);
	      int y = (int)Math.pow(2,n-1);
	       int z = x & y;
	       
	       return z==0;
	    }

}
