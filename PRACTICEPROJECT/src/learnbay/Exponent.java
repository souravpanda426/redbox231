package learnbay;

public class Exponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int y = findExponent(2,5);
		System.out.println(y);
	}
	
	
	public static int findExponent(int number,int power) {
		
		if(power==1) {
			
			return number;
		}
		
		
		return findExponent(number,power-1) * number;
		
	}

}
