package takeyouforward;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {2,6,5,8,11};
		
		int target = 13;
		
		String twoSum = isTwoSum(x,target);
		
		System.out.println(twoSum);
		


	}
	
	
	public static String isTwoSum(int[] x,int target) {
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < x.length; i++) {
			
			
			int ele = x[i];
			
			int rem =  target-ele;
			
			if(hm.containsKey(rem)) {
				
				return "Yes";
			}
			
			else {
				
				hm.put(x[i], i);
			}
			
		}
		return "No";
		
	}

}
