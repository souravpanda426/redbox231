package mypackage;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) throws VoterException {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int age = s.nextInt();
		
		if(age<18) {
			
			throw new VoterException();
			
			
			
		}
		
		else {
			
			System.out.println("eligible to vote");
		}
	}

}
