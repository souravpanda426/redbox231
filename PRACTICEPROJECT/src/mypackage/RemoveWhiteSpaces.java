package mypackage;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
	
		
		String x = "I WANNA DO MY DUTY TODAY";
		String y ="";
		
		
		for(String st : x.split("\\s")) {
			y = y + st;
			
		}
		
		System.out.println(y);
	}
	
	
	

}
