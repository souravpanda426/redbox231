
public class QuestionAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "SAMSONITE";
		
		eliminateString(x);
		
		

	}
	
	
	public static void eliminateString(String x) {
		
	
		
		
	
			
			
			for(int i=0;i<x.length();i++) {
				
				if(i==3) {
					
					x= x.substring(0, i)+x.substring(i+1, x.length());
					
					System.out.println(x);
					
					
					for(int l=i;l<=x.length();l++) {
						
						if(l%3==0) {
							
							x = x.substring(0, l)+x.substring(l+1, x.length());
							
							System.out.println(x);
							
							if(x.length()>4) {
								
								eliminateString(x);
							}
						}
				}
				
			
				
				
				
				
				
				
				
			}
		}
		
		
		
	}
	
}


