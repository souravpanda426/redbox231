

public class AssignmentQueations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,5,25,6,7,8,9,2,3,4,5,6,88,89,90,91,92,93,94,95};
		
		
		
		int count = 1;
		
		
		
		int max=0;
		
		
		
		for(int i = 1; i < arr.length; i++) {
			
			
			if(arr[i]-arr[i-1]==1) {
				
			count++;
			
			if(i==arr.length-1 & (arr[i]-arr[i-1]==1)) {
				
				
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

			//max= Math.max(max, count);
			
			
		
			
		
		
		
		

	}
		
		
		
		
		System.out.println(max);	
		

}
	
}
	

	

