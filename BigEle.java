
 
package mypackage;


public class BiggestElement {

	
	public static void main(String[] args) {
		
		
		int[] x = {23,12,34,56,78,13,21,123};
		int large = x[0];
		
		
		for (int i = 1; i < x.length; i++) {
			
			
			if(large<x[i]) {
				
				large = x[i];
			}
			
			
			
		}
		System.out.println(large);

	}

}
