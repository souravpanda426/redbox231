package mypackage;



public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,20,30,30,40,50,50};  
		
		int tmp[] = new int[arr.length];
		
		int j=0;
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]!=arr[i+1]) {
				
				tmp[j++]=arr[i];
			}
			
			
		}
		
		tmp[j]=arr[arr.length-1];
		
		int[] na = new int[j+1];
		
		for(int i=0;i<=j;i++) {
			
			na[i]=tmp[i];
		}
		
		
	
		for(int i=0;i<na.length;i++) {
			System.out.println(na[i]);
		}
		
	
		
		
		
	}
}
