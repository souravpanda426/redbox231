package mypackage;

public class RemoveCharacterFromString {

	public static void main(String[] args) {
	
		
		String x = "ADVERTISEMENT";
		Character ch = 'E';//character to be removed
		String y = " ";
		for (int i = 0; i < x.length(); i++) {
		
			
			if(x.charAt(i)!=ch) {
				
				y = y + x.charAt(i);
				
			}
			
			
			
		}
		
		System.out.println(y);
		

	}

}
