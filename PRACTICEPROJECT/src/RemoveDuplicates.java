
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {1,1,2,2,2,3,3};
		
		int removeDuplicates = RemoveDuplicates(x);
		for (int i = 0; i < removeDuplicates; i++) {
			
			System.out.print(x[i]);
			
		}
		
	}
	
	public static int RemoveDuplicates(int[] b) {
		
		int i=0;
		
		for (int j = 1; j < b.length; j++) {
			
		
				
				if(b[i]!=b[j]) {
					
					i++;
					
					b[i]=b[j];
					
				}
			}
		return i+1;
				
				
		}
		
		
	}


