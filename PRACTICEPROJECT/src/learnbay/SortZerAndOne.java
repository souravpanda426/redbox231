package learnbay;

public class SortZerAndOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {0,0,1,0,1};
		
		int st=0;
		int end =x.length-1;
	
		while(st<end) {
			
			if(x[st]==0) {
				
				st++;
				}
			else if(x[end]==1) {
				end--;
				
			}
			
			else {
				
				swap(x,st,end);
			}
			
			
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
