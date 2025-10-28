import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Sortfrequ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "bbaaccc";
		String rs="";
		
		 HashMap<Character,Integer> hm = new HashMap();

	        for(int i=0;i<s.length();i++){

	           char ch = s.charAt(i);
	           if(hm.containsKey(ch)){

	            hm.put(ch,hm.get(ch)+1);
	           }

	           else{

	            hm.put(ch,1);
	           }
	        }
	        
	        ArrayList<Map.Entry<Character, Integer>> al = new ArrayList<Map.Entry<Character, Integer>>(hm.entrySet());
	        
	        
	        
	        
		
  Collections.sort(al,new Comparator<Map.Entry<Character, Integer>>(){

	@Override
	public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
		
		if(o1.getValue()>o2.getValue()) {
			
			return -1;
		}
		
		else if(o1.getValue()<o2.getValue()) {
			
			return +1;
		}
		return 0;
		
		
	}
	        	
	        	
	        	
	        	
	    

	});
  
  
  for (Entry<Character, Integer> entry : al) {
	  
	  int k = entry.getValue();
	  
	  while(k>=1) {
		  
		  rs = rs + entry.getKey();
		  k--;
	  }
	
}
  
  System.out.println(rs);

}
	
	
}
