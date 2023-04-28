package mypackage;

public class Replace {

	public static void main(String[] args) {
	
		
		
		String x = "I wanna buy book and buy a pen today";
		String y = "buy";
		String z = "bring";
		String a = "";
	
		
		
		for(String st : x.split("\\s")) {
			
			
			if(st.equals(y)) {
				st=z;
			}
			
			a = a + st;
			
			
		}
		
		System.out.println(a);
	}

}
