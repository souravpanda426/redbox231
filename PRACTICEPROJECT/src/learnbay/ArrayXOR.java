package learnbay;

import java.util.ArrayList;

public class ArrayXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {1,2,3,4,5,6,7};
		
		for(int i=0;i<x.length;i++) {
			
			ArrayList<Integer> al = new ArrayList<Integer>();
			
			for (int j = i; j < x.length; j++) {
				
				al.add(x[j]);
				int y = findXor(al);
				System.out.println(y);
				
			}
		}

	}
	
	
	
	
	public static int findXor(ArrayList<Integer> y){
		
		int ans=0;
		
		for(int i=0;i<y.size();i++) {
			
		
			
			ans = ans ^ y.get(i);
		}
		return ans;
		
		
		
		
		
		
	}

}
