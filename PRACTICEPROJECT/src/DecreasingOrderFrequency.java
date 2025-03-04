import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DecreasingOrderFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "banana";
		String y = "";
		
		Map<Character,Integer> hm = new HashMap<>();
		
		for(int i=0;i<x.length();i++) {
			
			char ch = x.charAt(i);
			
			if(hm.containsKey(ch)) {
				
				hm.put(ch,hm.get(ch)+ 1);
			}
			
			else {
				
				hm.put(ch,1);
			}
			
		}
		
		
		ArrayList<Entry<Character,Integer>> al = new ArrayList<Entry<Character,Integer>>(hm.entrySet());
		
		Collections.sort(al,new MySort());
		
		System.out.println(al);
		
		
		for (Entry<Character, Integer> entry : al) {
			
		Integer value = entry.getValue();
		
		while(value>=1) {
			y = y+ entry.getKey();
			
			value--;
		}
			
			
		}
		
		System.out.println(y);
		

	}

}
