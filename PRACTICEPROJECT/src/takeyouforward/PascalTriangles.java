package takeyouforward;

public class PascalTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	printRow(6);


	}
	
	public static void printRow(int column){
		
		int ans = 1;
		
		System.out.println(ans);
		
		for(int i=1;i<column;i++) {
			
			ans = ans * (column-i);
			
			ans=ans/i;
			
			System.out.println(ans);
		}
		
		
	}

}
