package mypackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class RemoveDuplicateCharacters {
	
	
	public static void main(String[] args) {
		
		
		String x = "KARLOOS";
		LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
		String y = "";
		
		
	
		
		char[] ch = x.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			
			if(hm.containsKey(ch[i])) {
				hm.put(ch[i], hm.get(ch[i])+1);
			}
			
			else {
				hm.put(ch[i], 1);
			}
			
			
			}
			
		
		for (Character charac : hm.keySet()) {
			
			if(hm.get(charac)==1) {
				y = y + charac;
				
			}
			
			
			
			
			
		}	
			
		System.out.println(y);
			
		
			
		}
		
		
		
		
			}
	
			
			
		
	


