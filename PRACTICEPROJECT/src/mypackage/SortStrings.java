package mypackage;

import java.util.Arrays;

public class SortStrings {

	public static void main(String[] args) {
		

		
		String x = "ZYXWVUTSRQP";
	  char[] charArray = x.toCharArray();
	  Character temp;
		
	  for(int i =0;i<charArray.length;i++) {
			 
			 for(int k = i+1; k<charArray.length;k++) {
				 
				 if(charArray[i]>charArray[k]) {
					 
					  temp = charArray[k];
					 charArray[k] = charArray[i];
					 charArray[i]=temp;
					 
				 }
				 
			 }
			
			
			
		}
	  
	  System.out.println(charArray);

	}
	  
	
}

