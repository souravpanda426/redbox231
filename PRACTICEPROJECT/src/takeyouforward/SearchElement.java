package takeyouforward;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] x = {7, 8, 1, 2, 2, 3, 4,4,4,4,4, 5, 6};
		int y = searchElementInRoatedSortedArray(x,2);
		System.out.println(y);
	
		
		
				
				

	}
	
	
	public static int searchElementInRoatedSortedArray(int[]x,int target) {
		
	int low = 0; int high = x.length-1;
		
		
		int ans = -1;
		

		while(low<=high){
			
			
			int mid = (low + high)/2;
			
			if(x[mid]==target) {
				
				ans = mid;
				return ans;
			}
			
			if(x[low]<=x[mid]) {
				
				if(target>=x[low]&target<=x[mid]) {
					
					high = mid - 1;
					
				}
				else {
					
					low = mid + 1;
				}
				
				
				
			}
			
			else {
				
              if(target>=x[mid]&target<=x[high]) {
					
					low= mid + 1;
					
				}
              
              else {
            	  
            	  high = mid - 1;
              }
				
			}
		}
		return ans;
		
	}

}
