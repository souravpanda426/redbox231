package learnbay;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {1,1,2,4,5,6,8,9};
		int start = 0;
		int end = x.length-1;
		
		int target = 10;
		
		ArrayList<List<Integer>> al = new ArrayList<>();
		
		
		
		
		while(start<end) {
			
			
			if(x[start]+x[end]==target) {
				
				ArrayList<Integer> a = new ArrayList<Integer>();
				a.add(x[start]);
				a.add(x[end]);
				al.add(a);
				
				start++;
				end--;
				
			}
			
			else if(x[start]+x[end]>target) {
				
				end = end - 1;
			}
			
			else {
				
				start= start+1;
			}
			
			
			
			
		}
		
		System.out.println(al);
	}

}
