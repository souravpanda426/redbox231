package mypackage;

public class Preservespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "I AM A BOY";
		String z = "";
		
		String b ="";
		
		for (int i = 0; i < x.length(); i++) {
			
			if(x.charAt(i)!=' ') {
				
				z = z+ x.charAt(i);
			}
			
		}
		
		System.out.println(z);
		
		int g = z.length()-1;
		
		for (int i = 0; i < x.length(); i++) {
			
			
			if(x.charAt(i)==' ') {
				
				b = b + x.charAt(i);
			}
			
			else {
				
				b =  b+ z.charAt(g);
				g--;
			}
			
		}
		
		
		System.out.println(b);
	}

}
