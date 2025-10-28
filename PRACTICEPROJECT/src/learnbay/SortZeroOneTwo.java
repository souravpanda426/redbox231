package learnbay;

public class SortZeroOneTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {2,1,2,0,0,1,2,1};
		
		int low = 0;
		int mid=0;
		int high = x.length-1;
		
		while(mid<=high) {
			
			if(x[mid]==2) {
				
				//swap mid and high
				
				ReverseArray.swap(x, mid, high);
				
				high--;
			}
			
			else if(x[mid]==0) {
				
				//swap mid and low
				
				ReverseArray.swap(x, low, mid);
				low++;
				mid++;
				
			}
			
			else {
				
				mid++;
			}
			
		}
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]);
		}
				
	}

}
