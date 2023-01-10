package mypackage;

import java.util.Scanner;

public class SecondDimensionalArray {

	public static void main(String[] args) {


	
		int[][] x = {{2,3,4},{1,2,5},{6 ,7 ,9}};
		
		
		for (int i = 0; i < x.length; i++) {
			
			for(int j = 0 ; j<x[i].length ; j++) {
				
				System.out.print(x[i][j]+ " ");
			}
			
			System.out.println();
			
		}
		
		


	}

}
