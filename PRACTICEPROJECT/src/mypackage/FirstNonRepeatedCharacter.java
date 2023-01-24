package mypackage;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {



		String x = "SANDEEP";
		LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character,Integer>();


		for(int i =0 ;i < x.length();i++) {

			char ch = x.charAt(i);


			if(hm.containsKey(ch)) {

				hm.put(ch,hm.get(ch)+1);
			}

			else {

				hm.put(ch, 1);
			}
		}


		for (Character ch : hm.keySet()) {
			
			if(hm.get(ch)==1) {
				System.out.println(ch);
				
				break;
			}
			
		}
		
		
	}

}
