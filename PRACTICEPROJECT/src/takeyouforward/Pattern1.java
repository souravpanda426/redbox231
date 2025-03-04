package takeyouforward;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int space=6;
		
		int num = 1;

		for(int i=1;i<=4;i++) {
			
			for(int k = 1;k<=num;k++) {
				
				System.out.print(k);
			}
			
			for(int j=1;j<=space;j++) {
				
				System.out.print(" ");
			}
			
			space=space-2;
			
			for(int l = num;l>=1;l--) {
				System.out.print(l);
				
			}
			
			num++;
			
			System.out.println();
			
		}
	}

}
