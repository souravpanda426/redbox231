

public class SumThree {
	
	
	public static void main(String[] args) {
		
		int[] x = {1,2,3,4,5,6,7,8};
		
		for (int i = 0; i < x.length-3; i++) {
			

			for (int j = i+1; j < x.length; j++) {
				
				
				for (int k = j+1; k < x.length; k++) {
					
					
					if(x[i]+x[j]+x[k]==12) {
						
						System.out.println(x[i]+" "+x[j]+" "+x[k]);
					}
				}
				
			}
		
		}
			
			
		}
	}


