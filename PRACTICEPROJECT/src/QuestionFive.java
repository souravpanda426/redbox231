
public class QuestionFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {3,5,25,6,7,8,9,2,3,4,5,6,88,89,90,91,92,93};
		
		
		int max=0;
		
		int count=1;
		
		for(int i = 0; i < arr.length-1; i++) {
			
		
			
			
			
			if(arr[i]+1==arr[i+1]) {
				
				count++;
				
				
				if(i==arr.length-2 & arr[i]+1==arr[i+1]) {
					
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
