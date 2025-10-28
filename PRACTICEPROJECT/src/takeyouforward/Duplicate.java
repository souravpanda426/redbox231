package takeyouforward;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {0,0,1,1,1,2,2,3,3,4};
		
		int i=0;
		
		for (int j = 0; j < x.length; j++) {
			
			if(x[i]!=x[j]) {
				
				i++;
				x[i]=x[j];
			}
		}
		
         for (int j = 0; j <=i; j++) {
			
			System.out.println(x[j]);
		}

	}

}
