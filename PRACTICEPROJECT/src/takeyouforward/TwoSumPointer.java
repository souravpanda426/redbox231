package takeyouforward;

import java.util.Arrays;

public class TwoSumPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int[] x = {2,6,5,8,11};
			
			String twoSumPointer = isTwoSumPointer(x);
			System.out.println(twoSumPointer);
			
			
	}
	
	public static String isTwoSumPointer(int[] x) {
		
		Arrays.sort(x);
		
		int left=0;
		
		int  right = x.length-1;
		
		int sum = x[left]+x[right]; 
		
		int target = 7;
		
		
		while(left<right) {
			
			if(sum==target) {
				
				return "Yes";
				
				
				
				
			}
			
			else if(sum<target) {
				left++;
				
				
			}
			
			else {
				
				right--;
			}
			
		}
		return "NO";
	}

}
