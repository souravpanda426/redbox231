package mypackage;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {


		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("enter the Number");
		int x = s.nextInt();
		boolean armStrong = isArmStrong(x);
		System.out.println(armStrong);
	}

	private static boolean isArmStrong(int x) {
		
		int temp = x;

		int sum = 0;

		while(x!=0) {

			int r = x %10;
			sum = sum + Power.findPower(r, 3);
			x = x/10;

		}
		return sum==temp;

	}

}
