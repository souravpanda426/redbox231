package takeyouforward;

public class PascalElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int y = generateElemenAtPascal(5,2);
		System.out.println(y);
		
		
	}
	
	
	public static int generateElemenAtPascal(int row,int col){
		
		
		int ans = 1;
		
		for(int k=0;k<col;k++) {
			
			ans = ans * (row-k);
			ans = ans/(k+1);
			
			
			
		}
		return ans;
	}

}
