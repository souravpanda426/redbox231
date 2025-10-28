package learnbay;

import java.util.LinkedHashMap;
import java.util.Set;

public class Samples {
	
	public static void main(String[] args) {
		
		String s = "leetcode";
		
		    LinkedHashMap<Character,Integer> lm = 
			     new  LinkedHashMap<Character,Integer>();  
			     
			        for(int i=0;i<s.length();i++){
			            
			            if(lm.containsKey(s.charAt(i))){

			                lm.put(s.charAt(i),lm.get(s.charAt(i)));
			            }

			            else{

			                lm.put(s.charAt(i),1);
			            }
			         
			           

			        }
		
		int i=0;
		
		Set<Character> keySet = lm.keySet();
		
		for (Character character : keySet) {
			
			if(lm.get(character)==1) {
				i++;
				
				System.out.println(i);
				break;
				
			}
			
		}
		
		
		
		
	}

}
