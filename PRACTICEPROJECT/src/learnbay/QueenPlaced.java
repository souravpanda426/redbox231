package learnbay;

public class QueenPlaced {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] ar = new int[4][4];
		QueenPlaced queen = new QueenPlaced();
		
		int y = queen.Nqueen(ar,0);
		System.out.println(y);
		
	}
	
	public  int Nqueen(int[][] ar,int row ) {
		
		if(row==ar.length) {
			
			return 1;
		}
		
	int count=0;
	
		for(int col=0;col<ar.length;col++) {
			
			
			if(canPlace(ar,row,col)) {
				
				ar[row][col]=1;
				
				count = count + Nqueen(ar,row+1);
				
				
				ar[row][col]=0;
				
			}
		}
		return count;
		
	}

	private  static boolean canPlace(int[][] ar, int row, int col) {
	
		
		for (int r = row-1; r >=0; r--) {
			
			if(ar[r][col]==1) {
				
				return false;
				
			}
			
			
		}
		
		
	
		
		int r = row - 1;int  c = col-1;

		while(r>=0 && c>=0){

		if(ar[r][c]==1){

		return false;
		}

		r--; c--;
		}

		
		int R = row - 1; int C = col+1;
		
		while(R>=0 && C <ar.length){
			if(ar[R][C]==1){

				return false;
			}
			
			
			R--;
			C++;
			}
		
		
		return true;

		
		
		
	}

}
