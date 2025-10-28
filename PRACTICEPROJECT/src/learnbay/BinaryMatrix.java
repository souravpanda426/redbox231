package learnbay;

public class BinaryMatrix {
//given the target value find the index
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] x = {{11,12,13,14,15},
				     {25,26,27,28,29},
				     {31,32,33,34,35},
				     {41,42,43,44,45}};
		
		

	int target = 28;
	int findBinary = findBinary(x,target);

	System.out.println(findBinary/x[0].length);
	System.out.println(findBinary % x[0].length);
	

	

	
	
	
	}
	
	public static int findBinary(int[][] x,int target) {
		
		int col = x[0].length;
		int row = x.length;
		int ans=0;
		
		
		
		int low = 0; int high = (row*col)-1;
		
	   while(low<=high) {
		   
		   int mid = (low + high)/2;
		   
		   int r = mid / col;
		   int c = mid % col;
		   
		   
		   
		   if(x[r][c]==target) {
			   
			   ans=mid;
			   
			   return ans;
		   }
		   
		   else if(x[r][c]<target) {
			   
			   low = mid +1;
		   }
		   
		   else {
			   
			   high = mid-1;
		   }
		   
		   
	   }
	return ans;
	
		
	}

}
