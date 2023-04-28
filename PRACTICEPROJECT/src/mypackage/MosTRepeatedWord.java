package mypackage;

import java.util.Collections;
import java.util.HashMap;

public class MosTRepeatedWord {

	public static void main(String[] args) {
		
		
		String x = "AAABBBCCCCCCCCCCCCCDDDDEEEFFFF";
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		
		for (int i = 0; i <x.length(); i++) {
			
		 char charAt = x.charAt(i);
		 
		 if(hm.containsKey(charAt)) {
			 hm.put(charAt, hm.get(charAt)+1);
		 }
		 
		 else {
			 hm.put(charAt, 1);
		 }
			
			
			
		}

		
		
		for(Character st:hm.keySet()) {
			
			if(hm.get(st)==Collections.max(hm.values())) {
				System.out.println(st);
			}
			
			
		}
	}

}
