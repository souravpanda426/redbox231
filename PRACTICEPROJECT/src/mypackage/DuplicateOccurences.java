package mypackage;

import java.util.HashSet;

public class DuplicateOccurences {

	public static void main(String[] args) {
		
		
		String x = "ADVERTISEMENTS";
		HashSet<Character> hm = new HashSet<Character>();
		
		char[] ch = x.toCharArray();
		
		for(int i=0; i<ch.length;i++) {
			
			for(int k = i+1 ; k<ch.length;k++) {
				
				if(ch[i]==ch[k]) {
					
					hm.add(ch[i]);

				}
			}
		}

		
		
		for (char c : hm) {
			System.out.println(c);
		}
	}

}
