package learnbay;

public class RightRotaions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] x = {"a","b","c","d","e","f"};
		
		
		int rotation= 3;
		int index = x.length-rotation;
		
		
		
		reverse(x,index,x.length-1);
		reverse(x,0,index-1);
		reverse(x,0,x.length-1);
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
		
		
		
	}
	
	
	public static void reverse(String[] x,int start,int end) {
		
		
		
		while(start<end) {
			
			swap(x,start,end);
			start++;
			end--;
			
			
		}
		
	}
	
	
	public static void swap(String[] x,int i,int k) {
		
		String temp= x[k];
		x[k]=x[i];
		x[i]=temp;
		
		
	}

}
