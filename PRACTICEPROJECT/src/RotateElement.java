
public class RotateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {1,2,3,4,5};
		
		int numberOfRotations = 2; 
		
		while(numberOfRotations>5) {
			
			numberOfRotations = numberOfRotations-5;
		}
		
		int k = numberOfRotations-1;
		
		int lastelement = x.length-1;
		
		int[] na = new int[x.length];
		
		
		int j =0;
		
		int d = 0;
		
		for(int i=0;i<na.length;i++) {
			
			if(k>=j) {
				
				na[lastelement]=x[k];
				
				lastelement--;
				k--;
			}
			
			else {
				
				na[d]=x[i];
				
				d++;
			}
		}
		
		
		for (int i = 0; i < na.length; i++) {
			
			System.out.print(na[i]);
		}

	}

}
