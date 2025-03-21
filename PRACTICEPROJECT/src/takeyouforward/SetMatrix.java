package takeyouforward;

public class SetMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[][] x = {{0,1,2},
			     {2,3,4},
			     {1,2,5}};
	
	int[] row = new int[3];
	
	int[] col = new int[3];
	
	
	for (int i = 0; i < x.length; i++) {
		
		for (int j = 0; j < x[i].length; j++) {
			
			if(x[i][j]==0) {
				row[i]=1;
				col[j]=1;
			}
			
		}
	}
	
	
	
	for (int i = 0; i < x.length; i++) {
		
    for (int j = 0; j < x[i].length; j++) {
			
			if(row[i]==1||col[j]==1) {
				x[i][j]=0;
			}
			
		}
		
	}
	
	for (int i = 0; i < x.length; i++) {
		
	    for (int j = 0; j < x[i].length; j++) {
				
				System.out.println(x[i][j]);
				
			}
			
		}
	
	}

	}


