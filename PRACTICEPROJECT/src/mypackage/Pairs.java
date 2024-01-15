package mypackage;

public class Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {1,2,3,4,5,6,7};
		
		for(int i=0;i<x.length;i++) {
			
			int sum = x[i];
			
			for(int k=i+1;k<x.length;k++) {
				
				sum = sum + x[k];
				
				
				if(sum==7) {
					
					while(i<=k) {
						
						System.out.println("the numbers are "+x[i]+" ");
						i++;
					}
				}
				
				
			}
		}

	}

}
