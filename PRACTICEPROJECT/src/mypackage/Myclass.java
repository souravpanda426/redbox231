package mypackage;

public class Myclass {
	
	static int[] arr = {1, 5, 3, 2,4};
	
	public static void main(String[] args) {
		
		
		for(int i=0;i<arr.length;i++) {
			
			
			for(int j=i+1;j<arr.length;j++) {
				
				
				if(arr[i]+arr[j]==5) {
					System.out.println(arr[i]+" "+arr[j]);
					
					
				}
			}
			
		}
		
		
		
		
		
	}

}
