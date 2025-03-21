package takeyouforward;

import java.util.HashSet;

public class LongConsecutiveSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {100,200,1,2,3,4};
		int max=0;
		
		
		HashSet<Integer> hm = new HashSet<Integer>();
		
		for (int i = 0; i < x.length; i++) {
			
			hm.add(x[i]);
		}
		
		for (Integer integer : hm) {
			
			int count =1;
			
			while(hm.contains(integer+1)){
				
				count++;
				
				integer++;
			}
			
			max = Math.max(count,max);
		}
		
		
System.out.println(max);
	}

}
