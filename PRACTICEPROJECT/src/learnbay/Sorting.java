package learnbay;

public class Sorting {
	
	public static void main(String[] args) {
		
		int[] x = {1,0,0,1,0,0,1,1,0};
		
		int st=0;
		int end = x.length-1;
		
		int[] na = new int[x.length];
		
		for (int i = 0; i < x.length; i++) {
			
			if(x[i]==0) {
				
				na[st]=0;
				st++;
			}
			
			else {
				
				na[end]=1;
				end--;
			}
		}
		
		for (int i = 0; i < na.length; i++) {
			
			System.out.println(na[i]);
			
		}
		
		
	
	}

}
