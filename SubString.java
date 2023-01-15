package mypackage;

public class SubString {

	public static void main(String[] args) {
		
		
		int index =0;
		boolean b = false;
		String x = "ACKNOWLEDGE";
		String y = "NOW";
		int xlength = x.length();
		int ylength = y.length();
		for (int i = 0; i <= xlength - ylength; i++) {
			String substring = x.substring(i, i+ylength);
			
			if(substring.equals(y)) {
				b = true;
				index = i;
				break;
				
				
				
			}
		
		
			}
		

		if(b) {
			System.out.println( y + "  is a part of  " +  x );
			System.out.println(" index is " + index);
			
			
			
		}
		
		
		
		

	}

}
