package mypackage;

import java.util.Scanner;

public class SecondDimensionalArrays {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.println("enter rows");
		int row = s.nextInt();
		System.out.println("enter columns");
		int col = s.nextInt();
		System.out.println("enter " +row * col + "elements");
		int[][] x = new int[row][col];






		for (int i = 0; i < x.length; i++) {

			for(int j = 0 ; j<x[i].length ; j++) {

			x[i][j] = s.nextInt();
			
			}

			System.out.println();

		}



		for (int i = 0; i < x.length; i++) {

			for(int j = 0 ; j<x[i].length ; j++) {

			
				System.out.print(x[i][j] + " ");
			
			}

			System.out.println();

		}


	}

}
