
public class SetMatrixc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] d = {{1,1,2},
		             {1,0,1},
		             {2,2,2}};
		
		for (int i = 0; i < d.length; i++) {
			
			for (int j = 0; j < d.length; j++) {
				
				if(d[i][j]==0) {
					
					setRow(d,i);
					setColumn(d,j);
					
					
				}
				
			}
		}
		
for (int i = 0; i < d.length; i++) {
			
			for (int j = 0; j < d.length; j++) {
				
				if(d[i][j]==-1) {
					
					d[i][j]=0;
					
					
				}
				
			}
		}
		
		
		
for (int k = 0; k < d.length; k++) {
			
			for (int l = 0; l < d[k].length; l++) {
				
				System.out.println(d[k][l]);
				
			}
		}
		
		
		
		
		             
	}
	



public static void setRow(int[][] x,int row) {
	
	
	
	for (int j = 0; j < x[row].length; j++) {
		
		if(x[row][j]!=0) {
			
			x[row][j]=-1;
			
		}
		
	}
}


public static void setColumn(int[][] y,int col) {
	

	for (int i = 0; i < y.length; i++) {
		
		
		for (int j = 0; j < y[i].length; j++) {
			
			
			
			if(j==col & y[i][j]!=0) {
				
				
				y[i][j]=-1;
				
			}
		
	}
	
	
		
	}
	
	
	
}




}
