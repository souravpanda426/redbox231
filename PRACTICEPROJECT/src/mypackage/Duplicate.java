package mypackage;

public class Duplicate {

	public static void main(String[] args) {
		
		
		String x = "ENGINEERING";
		char[] ch = x.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
		
			
			for (int j = i+1; j < ch.length; j++) {
				
				if(ch[i]==ch[j]) {
					System.out.println(ch[i]);
				}
				
			}
			
		}
		
	
		

	}

}
