import java.text.SimpleDateFormat;

public class EqulibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		int x[] = {-7, 1, 5, 2, -4, 3, 0};
		
		for (int i = 1; i < x.length; i++) {
			
			int leftSum = 0;
			
			int rightSum = 0;
			
			int f = i-1;
			
			while(f>=0) {
				
				leftSum = leftSum + x[f];
				
				f--;
				
			}
			
			for (int j = i+1; j < x.length; j++) {
				
				
				rightSum = rightSum + x[j];
			}
			
			
			if(leftSum==rightSum) {
				
				System.out.println(x[i]);
			}
			
			
		}
	}

}
