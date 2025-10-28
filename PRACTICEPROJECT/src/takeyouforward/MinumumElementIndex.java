package takeyouforward;

public class MinumumElementIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {7,8,1,2,3,4,5,6};
		
		int low=0;
		int high = ar.length-1;
		
		int ans = 0;
		int index = 0;
		
		while(low<=high) {
			
			int mid = (low + high)/2;
			
			
			if(ar[low]<=ar[mid]) {
				
				if(ar[low]<=ans) {
					index=low;
					ans = ar[low];
					
				}
				
				low=mid+1;
				
			}
			
			else {
				
				ans = ar[mid+1];
				
				index = mid+1;
				high=mid;
			}
			
			
			
			
		}
		
		System.out.println(index);

	}

}
