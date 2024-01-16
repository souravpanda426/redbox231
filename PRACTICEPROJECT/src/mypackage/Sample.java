package mypackage;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//question -Minimum number of deletions to make a string palindrome
		
		
		String x = "aebcbda";
		
		char[] charArray = x.toCharArray();
		
		int y = charArray.length-1;
		
		int i=0;
		
		while(i<charArray.length/2) {
			
			if(charArray[i]!=charArray[y]) {
				
				System.out.println(charArray[i]);
				System.out.println(charArray[y]);
				
				
				
			}
			
			i++;
			y--;
				
		}
		

	}

}
