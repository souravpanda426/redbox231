package mypackage;

import java.util.HashMap;
import java.util.Scanner;

public class RomanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("I",1);
		hm.put("IV",4);
		hm.put("V",5);
		hm.put("IX",9);
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter roman number");
		String next = s.next();
		System.out.println(hm.get(next));
		
		
		
	}

}
