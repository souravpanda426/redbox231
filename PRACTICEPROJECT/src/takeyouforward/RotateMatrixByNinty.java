package takeyouforward;

public class RotateMatrixByNinty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] x = {{1,2,3},{4,5,6},{7,8,9}};
		
		int n = x.length;
		
		int[][] rotate = new int[3][3];
		
		for (int i = 0; i < x.length; i++) {
			
			for (int j = 0; j < x[i].length; j++) {
				
				rotate[j][n-i-1]=x[i][j];
			}
		}
		
		
		for (int i = 0; i < rotate.length; i++) {
			
			for (int j = 0; j < rotate.length; j++) {
				
				System.out.println(rotate[i][j]);
			}
		}
		
		

	}

}
