package learnbay;

import java.util.HashSet;

public class MaxLengthSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "abcdefg";
		
		int max=0;
		
		
		for (int i = 0; i < x.length(); i++) {
			
			for (int j = i+1; j < x.length()+1; j++) {
				
				String y = x.substring(i, j);
				
				if(isSuBstringDuplicate(y)==true);{
					
					if(max<y.length()) {
						max=y.length();
						
					}
					
					
				}
				
			}
			
		}
		
		System.out.println(max);

	}
	
	
	public static boolean isSuBstringDuplicate(String x) {
		
		HashSet<Character> hs = new HashSet<Character>();
		
		for (int i = 0; i < x.length(); i++) {
			
			if(hs.add(x.charAt(i))==false) {
				
				return false;
			}
		}
		return true;
	}

}
