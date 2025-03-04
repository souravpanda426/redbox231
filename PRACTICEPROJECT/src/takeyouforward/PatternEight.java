package takeyouforward;

public class PatternEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		
		for(int i=1;i<=5;i++) {
			
			
			for(int k=1;k<=num;k++) {
				System.out.print((char)(k+64));
				
			}
			
			num--;
			
			System.out.println();
		}

	}

}
