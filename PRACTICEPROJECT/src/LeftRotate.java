
public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {10,20,30,40,50};
		
		int positionToRotate = 1;
		
		int temp=positionToRotate;
		
		int i=0;
		
		
		
		int[] na = new int[x.length];
		
		int n = na.length-1;
		
		
		while(temp>=1) {
			
			na[n]=x[i];
			
			n--;
			i++;
			temp--;
		}
		
		int k=0;
		
		
		for (int j = positionToRotate; j < x.length; j++) {
			
			na[k]=x[j];
			k++;
		}
		
		
		for (int j = 0; j < na.length; j++) {
			
			System.out.println(na[j]);
		}

	}

}
