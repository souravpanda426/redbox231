package mypackage;

public class AnagramString {
	
	
	public static void main(String[] args) {
		
		System.out.println(isAnagram("ABCDE","EADCB"));
		
	}
	
	
	private static boolean isAnagram(String x, String y) {
		
		int[] count1 = new int[26];
		int[] count2 = new int[26];
		
		
		for (int i = 0; i < x.length(); i++) {
			char ch = x.charAt(i);
			
			if(ch>='A'& ch<= 'Z') {
				count1[ch-65]++;
			}
			
			else if(ch>='a' & ch<='z'){
				
				count1[ch-97]++;
			}
			
		}
		
		
		for (int i = 0; i < y.length(); i++) {
			
              char ch2 = y.charAt(i);
			
			if(ch2>='A'& ch2<= 'Z') {
				count2[ch2-65]++;
			}
			
			else if(ch2>='a' & ch2<='z'){
				
				count2[ch2-97]++;
			}
			
			
			
			
		}
		
		for (int i = 0; i < count1.length; i++) {
			
			if(count1[i]!=count2[i]){
				return false;
			}
		
			
		}
		return true;
		
	}

}
