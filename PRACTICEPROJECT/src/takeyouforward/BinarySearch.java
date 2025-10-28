package takeyouforward;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] x = {1,4,5,6,8,9};
		
		

			
			int low = 0;
			
			int high = x.length-1;
			
			System.out.println(BinarySearching(x,low,high));
		
	}
	
	public static int BinarySearching(int[] x,int low,int high) {
		
		int target = 8;
	   
		
		
		while(low<=high) {
			
			
			int mid = (low + high)/2;
			
			if(x[mid]==target) {
				
				return mid;
			}
			
			else if(target<x[mid]) {
				
				high =  mid-1;
		}
			
			else {
				
				low = mid+1;
			}
		

	}
		return -1;
		
	}

}
