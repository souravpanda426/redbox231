
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] x = {1,2,3,4,5,6,7,8,9,11};
		
		int odd=0,even=0;
		
		int j = x.length/2;
		int i=0;
		
		while(i<j) {
			
			if(!(x[i]%2==0)) {
				odd++;
			}
			
			i++;
		}
		
		
		while(j<x.length) {
			
			if(x[j]%2==0) {
				
				even++;
				
			}
			j++;
			
		}
		
		
		
		
		System.out.println(odd);
		System.out.println(even);
		
	}

}
