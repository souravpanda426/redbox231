package learnbay;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "SUJATA";
		
		String y="";
		
		for (int i = x.length()-1; i >=0; i--) {
			
			y = y + x.charAt(i);
			
		}
		
		System.out.println(y);

	}

}
