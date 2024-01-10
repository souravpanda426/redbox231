package mypackage;

import java.util.HashMap;

public class MissingTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {1,2,6,7,8};

		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		
		for (int i : x) {
			
			hm.put(i, 1);
			
		}
		
		
		for (int i = 1; i <=8; i++) {
			
			if(hm.get(i)==null) {
				
				System.out.println(i);
			}
			
		}
		
		
	}

}
