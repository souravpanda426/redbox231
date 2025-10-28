package mypackage;

public class A {

	public static void main(String[] args) {
		
		int[] x = {3,6,7,11};
		int d = 4;
		
		for (int i = 0; i < x.length; i++) {
			
			System.out.println(Math.ceil((double)x[i]/(double)d));
			//System.out.println(Math.ceil(x[i]/d));
		}
	}


}
