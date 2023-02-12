package mypackage;

public class ArraysSums {

	public static void main(String[] args) {
	

		int[][] x = { {5,6,7} , 
				     {3,5,9},
				     {4,9,5} };
		
		int sum=0;
		
	
		for(int i =0 ; i< x.length;i++) {
			
		  
			for(int l =0;l<x[i].length;l++) {
		
				sum = sum +x[i][l];
	
				
			
			
			
		}
		
		

	}
		
	System.out.println(sum);
}
}

