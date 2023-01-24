package mypackage;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
	
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter num");
		int x =s.nextInt();
	    int reverseNumber = reverseNumber(x);
		System.out.println(reverseNumber);
		

	}
	
	
	private static int reverseNumber(int x) {
		
		String y = "";
		
		while(x!=0) {
			
			int r = x % 10;
			y = y + r;
			x = x/10;
			
		}
		
		int parseInt = Integer.parseInt(y);
		return parseInt;
	}

}
