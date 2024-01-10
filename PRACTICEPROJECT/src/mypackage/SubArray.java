package mypackage;

public class SubArray {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		
		//Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
		int[] x = {1,2,3,4,5,6,7,8,9,4};
		
		int sum =0;
		
		int number=15;
		
		for(int i=0;i<x.length;i++) {
			
			sum=x[i];
			
			if(sum==number) {
				
				System.out.print(i);
				
			}
			
			else {
			
			for(int k=i+1;k<x.length;k++) {
				
				sum = sum + x[k];
			
			
			
			if(sum==number) {
				System.out.println("first value is "+i);
				System.out.println(k +" is last value");
				
			}
			
			
			}
		}
		

	}

}
	
}
