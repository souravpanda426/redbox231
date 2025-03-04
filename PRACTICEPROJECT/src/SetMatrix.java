
public class SetMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix= {{1,1,1},{1,0,1},{1,1,1}};
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				if(matrix[i][j]==0) {
					
					
					
				
					
					for (int j2 = 0; j2 < matrix[i].length; j2++) {
						
						matrix[i][j2]=0;
						
						
					}
					
					int f =j;
					
					
					
					for (int k = 0; k < matrix.length; k++) {
						
						matrix[k][f]=-1;
					}
					
					i= i+1;
					
					
				
			}
		}
		
		
		}
		for (int l = 0; l < matrix.length; l++) {
			
			for (int m = 0; m < matrix[l].length; m++) {
				
				System.out.println(matrix[l][m]+" ");
			}
			
		}

	}

}
 