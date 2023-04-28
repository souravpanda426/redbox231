package mypackage;

public class AddTwoMatrix {

	public static void main(String[] args) {
		
		int[][] x = {{1,2,3},{4,5,6}};
		
		int[][] y = {{1,2,3},{4,5,6}};
		
		
		int[][] sum = {{0,0,0},{0,0,0}};
		
		
		for(int i = 0 ; i< x.length ;i++) {
			
			for( int j = 0 ; j< x[i].length ; j ++) {
				
				sum[i][j] = x[i][j] + y[i][j];
			}
			
			
		
		}
		
		
		
		for (int i = 0; i < sum.length; i++) {
			
			
			for( int k = 0 ; k< sum[i].length ; k ++) {
				
				System.out.print(sum[i][k]+ " ");
			}
			
			
			System.out.println();
			
		}
		

	}

}
