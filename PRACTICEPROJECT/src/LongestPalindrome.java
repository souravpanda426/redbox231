import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x ="xxyybsbbsbzzuuhbdbhdweddkdmsak";
		
		
		
		
		
		ArrayList<String> al = new ArrayList<String>();
		
		for (int i = 0; i < x.length(); i++) {
			
			for(int j=i+1;j<x.length();j++) {
				
				String substring = x.substring(i, j);
				
				if(isPalindrome(substring)) {
					
					al.add(substring);
					
				}
				
			}
			
		}
		System.out.println(al);
		Collections.sort(al,new MySorting());
		System.out.println(al.get(0));
		
		
		

	}
	
	
	public static boolean isPalindrome(String x) {
		
		
		String rev="";
		
		for(int i = x.length()-1;i>=0;i--) {
			
			rev= rev+ x.charAt(i);
		}
		
		
		return rev.equals(x);
				
	}

}
