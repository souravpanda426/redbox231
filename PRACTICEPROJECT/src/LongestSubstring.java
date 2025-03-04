import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class LongestSubstring {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "abcddeebbeb";
		
		ArrayList<String> al = new ArrayList<String>();
		
		
		for(int i=0;i<x.length();i++) {
			
			
			for(int j =i+1;j<x.length();j++) {
				
				String substring = x.substring(i, j);
				
				
				if(isRepeated(substring)) {
					
					al.add(substring);
					
				}
			}
			
		}
		System.out.println(al);
		Collections.sort(al,new MyComparators());;
		System.out.println(al.get(al.size()-1));
		
		
		
		

	}
	
	
	public static boolean isRepeated(String x) {
		
		HashSet<Character> hm = new HashSet<Character>();
		
		
		for(int i=0;i<x.length();i++) {
			
			char charAt = x.charAt(i);
			
			if(hm.add(charAt)==false){
				
				return false;
			}
		}
		return true;
	}

}
