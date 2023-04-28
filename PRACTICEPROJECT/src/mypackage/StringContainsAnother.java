package mypackage;

public class StringContainsAnother {

	public static void main(String[] args) {
		
		
		String x = " I WANNA BRING SOME VEGETABLES AND COOKIES TO MY LOVELY HOME TODAY";
		String y = "BUY";
		
		if(check(x,y)) {
			System.out.println("yes present");
		}
		else {
			
			System.out.println("not present");
		}
		
		
	
		
		
		
		
		
		
	}	
		
		
		public static boolean check(String x,String y) {
			
			
			for(String st : x.split("\\s")) {
				
				if(st.equals(y)) {
					return true;
				}
			}
			return false;
			
		}

	
}

