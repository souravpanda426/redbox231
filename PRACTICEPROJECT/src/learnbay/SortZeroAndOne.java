package learnbay;

public class SortZeroAndOne {
	
	 // (0- i-1) -> region of 0
    // (i - j-1) -> region of 1
    // (j - n-1) -> unexplored region 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {0,0,1,0,1};
		
		int i=0; int j = 0;
		
		while(j<x.length) {
			
			if(x[j]==1) {
				
				j++;
			}
			
			else {
				
				int temp=x[j];
				
				
				rightShift(x,i,j);
				x[i]=temp;
				i++;
				j++;
				
			}
		}
		
		for (int k = 0; k < x.length; k++) {
			System.out.println(x[k]);
		}

	}
	
	public static void rightShift(int[] x,int st,int end) {
		
		
		
		for(int j=end;j>st;j--) {
			
			x[j]=x[j-1];
		}
		
	}

}
