package takeyouforward;

public class MinimumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {3,1,2};
		
		int low =0;
		int high = nums.length-1;
		
	
		
		int answer=Integer.MAX_VALUE;
		
		while(low<=high) {
			
			
			
			int mid = (low+high)/2;
			
			
			if(nums[low]<=nums[mid]) {
				
				
				
				answer = Math.min(answer,nums[low]);
				
				
				low = mid+1;
				
			}
			
			else {
				
				answer=Math.min(answer,nums[mid]);
				
				
				high = mid-1;
				
			}
		}
		
		System.out.println(answer);
	
		
	}

}
