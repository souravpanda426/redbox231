package mypackage;

public class Dupliacte {

	public static void main(String[] args) {
		
		
		String x = "I HAVE TO GO TO SCHOOL TODAY AND STUDY ZOOLOGY";
		
		for(String st : x.split(" ")) {
			
			if(isUnique(st)) {
				System.out.println(st);
			}
			
		}
		
		
		

	}
	
	
	private static boolean isUnique(String x) {
		
		
		
		
		for(int i=0;i<x.length();i++) {
			
			
			for(int j = i+1 ; j<x.length()-1 ; j++) {
				
				if(x.charAt(i)==x.charAt(j)) {
					return true;
					
				}
			}
		}
		
		
		return false;
	}

}
