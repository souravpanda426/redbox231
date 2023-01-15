package mypackage;

public class SpecialCharacter {

	public static void main(String[] args) {
		
		
		String x = "!@#$RTYU89";
		boolean containsCharacter = containsCharacter(x);
		System.out.println(containsCharacter);
		
		}
	
	
	private static boolean containsCharacter(String x) {
		
		for (int i = 0; i < x.length(); i++) {
			char ch = x.charAt(i);
			if(ch>= 33 & ch <= 47) {
				
				return true;
			}
			
		}
		return false;

	}

}
