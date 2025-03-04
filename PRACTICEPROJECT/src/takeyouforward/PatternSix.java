package takeyouforward;

public class PatternSix {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		int space=3;
		int d = 1;
		
	
		
		for(int i=1;i<=4;i++) {
			
			
			for(int j=1;j<=space;j++) {
				
				System.out.print(" ");
			}
			
			space--;
			
			d = 0; int v  = (2*i)/2;
			
						
			for(int k = 1;k<=(2*i)-1;k++) {
				
			
				
				
				if(k<=v){
					
					d++;
					
					System.out.print((char)(d+64));
					
				}
				else{
					d=d-1;
					
					
					System.out.print((char)(d+64));
				
					
				}
			}
			
			System.out.println();
			
		}

	}

}
