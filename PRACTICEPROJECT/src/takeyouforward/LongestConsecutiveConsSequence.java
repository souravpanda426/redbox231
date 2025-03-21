package takeyouforward;

import java.util.Arrays;
import java.util.Iterator;

public class LongestConsecutiveConsSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int[] a = {100, 200, 1, 2, 3, 4,5,300,1,2,3,4,5,6,7,8};
		  
		  int longest=1;
		  
		  for (int i = 0; i < a.length; i++) {
			
			  int ele = a[i];int count =1;
			  
			  while(linearSearch(a,ele+1)==true) {
				  
				  ele = ele +1;
				  
				  count++;
			  }
			  
			  longest = Math.max(longest, count);
		}
		
		  System.out.println(longest);
		  
		 
		  
	}
	
	
	public static boolean linearSearch(int[] a, int x) {
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==x) {
				
				return true;
			}
		}
		return false;
	}

}
