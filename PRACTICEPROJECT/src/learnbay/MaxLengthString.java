package learnbay;

import java.util.HashSet;

public class MaxLengthString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "abcdbedfg";
		
		int max=0;
		
		HashSet<Character> hs = new HashSet<Character>();
		
		int start=0;
		int end =0;
		
		for (int i = 0; i <x.length(); i++) {

			
			end = i;
			char ch = x.charAt(end);
			
			if(hs.contains(ch)) {
				
				while(hs.contains(ch)) {
					
					hs.remove(x.charAt(start));
					start++;
				}
				
			}
			
			else {
				
				hs.add(ch);
				
				int len  = (end-start)+1;
				
				max = Math.max(max, len);
			}
			
		}
		
		System.out.println(max);
				
				

	}

}
