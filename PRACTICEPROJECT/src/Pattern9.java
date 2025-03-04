
public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int space =0;
		
		int star = 10;
		
		for(int i=1;i<=10;i++) {
			
			
		       if(i>1 & i<=5) {
					
					star=star-2;
					space=space+2;
				}
				
				else if(i==6) {
					star=star-0;
					space=space-0;
					
				}
				else if(i>6) {
					
					space = space-2;
					star= star + 2;
				}

			
			for(int st = 1;st<=star/2;st++) {
				
				System.out.print("*");
			}
			
			for(int sp=1;sp<=space;sp++){
					
					System.out.print(" ");
			
		}
			
			for(int str=star/2+1;str<=star;str++) {
				
				System.out.print("*");
			}
			
			
			
			
			System.out.println();
	}
		
	}

	}

	

