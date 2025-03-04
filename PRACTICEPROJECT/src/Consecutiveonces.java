
public class Consecutiveonces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,1,6,7,8,1,1,1,1,1,1,1,1};
		
		int count=1;
		
		int max=0;
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i]==1 && arr[i-1]==1) {
				
				count++;
				
				
				if(i==arr.length-1 & arr[i]==1 && arr[i-1]==1) {
					
					if(max<count) {
						
						max=count;
					}
				}
			}
			
			
			else {
				
				if(max<count) {
					
					max=count;
				}
				
				count=1;
				
			}
		}
		
		System.out.println(max);

	}

}
