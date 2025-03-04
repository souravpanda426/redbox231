package takeyouforward;

public class PatternFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nu = 5;
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=nu;j++) {
				System.out.print((char)(j+64));
			}
			
			nu--;
			
			
			System.out.println();
		}
	}

}
