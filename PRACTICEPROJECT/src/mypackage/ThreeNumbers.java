package mypackage;

import java.util.Scanner;

public class ThreeNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("enter value for x");
		int x = s.nextInt();
		System.out.println("enter value for y");
		int y = s.nextInt();
		System.out.println(x +y + " is the sum ");
		

	}

}
