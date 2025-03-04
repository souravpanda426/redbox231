import java.util.HashMap;

public class AssignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String x = "geeksgeeks";
		
		System.out.println(canBeMadePalindrome(x));
	}
	
	
	public static boolean canBeMadePalindrome(String x) {
		
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		
		for(int i=0;i<x.length();i++) {
			
			char ch = x.charAt(i);
			
			if(hm.containsKey(ch)) {
				
				hm.put(ch,hm.get(ch)+1);
			}
			
			else {
				
				hm.put(ch, 1);
			}
			
		}
		
		
		int count=0;
		
		for (Character ch : hm.keySet()) {
			
			
			if(hm.get(ch)%2!=0) {
				
				count++;
			}
		}
		return count<=1;
	}

}
