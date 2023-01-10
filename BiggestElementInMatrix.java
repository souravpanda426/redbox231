package mypackage;

public class BiggestElementInMatrix {

	public static void main(String[] args) {

 
		int[][] x = {{2,10,81},{9,56,112}};
		
		int large = x[0][0];
		
		for (int i = 0; i < x.length; i++) {
			
			for(int k = 0 ; k < x[i].length ; k++) {
				
				if(large < x[i][k]) {
					
					large = x[i][k];
				}
			}
			
		}


		
		
System.out.println(large);



	}

}

