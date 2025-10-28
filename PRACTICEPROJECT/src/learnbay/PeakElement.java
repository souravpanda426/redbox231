package learnbay;

public class PeakElement {
	
	
	//question - find peak element

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
		
		System.out.println(findPeakelement(x));
		
		

	}
	
	
	public static int findPeakelement(int[] y) {
		
		if(y[0]>y[1]) {
			
			return y[0];
			
			
		}
		
		
		if(y[y.length-1]>y[y.length-2]) {
			
			return y[y.length-1];
		}
		
		int low = 1 ; int high = y.length-2;
		
		while(low<high) {
		
		
		int mid = (low+high)/2;
		
		if(y[mid]>y[mid-1]&&y[mid]>y[mid+1] ) {
			
			return y[mid];
		}
		
		else if(y[mid]<y[mid+1]) {
			
			low = mid + 1;
		}
		
		else {
			
			high=mid-1;
		}
		
		}
		return 0;
		
		
	}

}
