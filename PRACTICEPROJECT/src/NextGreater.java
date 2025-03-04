
public class NextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {10,11,5,4,7};
		
		int next=0;
		
		for (int i = 0; i < x.length; i++) {
			
			int ele = x[i];
			
			next = -1;
			
			for (int j = i+1; j < x.length; j++) {
				
				if(x[i]<x[j]) {
					
					next = x[j];
					
					break;
				}
				
				
				
				
			}
			
			
		}
	}

}
