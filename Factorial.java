package mypackage;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int nextInt = s.nextInt();
		int factorial = getFactorial(nextInt);
		System.out.println(factorial);


	}


	private static int getFactorial(int x) {

		int p = 1;

		while(x>=1) {

			p = p * x;

			x--;
		}
		return p;
	}

}
