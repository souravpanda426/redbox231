package learnbay;

public class SubArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {3,5,1,2,8,6,5,2,4};
		
		int k = 3; int sum=0; int i=0;int j=0; int max=0;
		
		while(j<k) {
			
			sum = sum + x[j];
			
			j++;
		}
		
		
		while(j<x.length) {
			
			sum = sum + x[j];
			sum = sum - x[i];
			
			max  = Math.max(max, sum);
			
			j++;
			i++;
			
		}
		
		System.out.println(max);

	}

}
