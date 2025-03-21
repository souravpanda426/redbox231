package takeyouforward;

public class PascalRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*	1
		   1 1
		  1 2 1
		  1 3 3 1
		 1 4 6 4  1*/

		int row = 4;
		
		for(int k=0;k<=row;k++) {
			
			int takeElement = takeElement(row,k);
			
			System.out.println(takeElement);
			
			
		}
		
		
		
	}
	
	
	public static int takeElement(int row,int col) {
		
		int res=1;
		
		for(int k=0;k<col;k++) {
			
			res = res * (row-k);
			
			res = res/(k+1);
			
		}
		
		return res;
	}

}
