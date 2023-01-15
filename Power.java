package mypackage;

public class Power {

	public static void main(String[] args) {
	
		
		int findPower = findPower(6,4);
		System.out.println(findPower);
		

	}
	
	public static int findPower(int y,int power) {
		
		int sum = 1;
		
		for(int k =1 ; k<= power ; k++) {
			
			sum = sum * y;
			
		}
		return sum;
		
	}

}
