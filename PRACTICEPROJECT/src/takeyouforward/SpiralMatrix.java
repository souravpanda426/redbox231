package takeyouforward;

import java.util.ArrayList;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] x={{0,1,2},
			     {2,3,4},
			     {1,2,5},
			     {3,4,8}};
		
		int left = 0;
		int right = x[0].length-1;
		
		int top=0;
		int bottom = x.length-1;
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		while(top<=bottom & left<=right) {
			
			for(int i=left;i<=right;i++) {
				
				al.add(x[top][i]);
			}
			
			top++;
			
			for(int i = top;i<=bottom;i++ ) {
				
				al.add(x[i][right]);
			}
			
			right--;
			
			for(int i = right; i>=left;i--) {
				
				al.add(x[bottom][i]);
			}
			
			bottom--;
			
			for(int i = bottom;i>=top;i--) {
				
				al.add(x[i][left]);
			}
			
			left++;
			
		}
		
		System.out.println(al);
		
		
	
	}

}
