package mypackage;

public class AddMatrix {

	public static void main(String[] args) {

		
		int[][] x = {{2,4,6},{1,2,9}};
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
		 
			for(int k =0; k< x[i].length;k++) {
				
				
				sum = sum + x[i][k];
				
				
			}

			
			
			
		}
		
		System.out.println(sum);

	}

}
