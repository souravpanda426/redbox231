package learnbay;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {1,2,3,4,5,6};
		
	
		
		int start = 0;
		int end = x.length-1;
		
		while(start<end) {
			
			swap(x,start,end);
			start++;
			end--;
			
			
		}
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
		
		
		
		

	}
	
	
	public static void swap(int[] x,int i,int k) {
		
		int temp= x[k];
		x[k]=x[i];
		x[i]=temp;
		
		
	}

}
