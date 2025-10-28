package learnbay;

import java.util.ArrayList;

public class Alloccurences {
	
	static int[] temp;
    
	public static void main(String[] args) {
		// TODO Auto-gen'erated method stub
		
		String[] x = {"a","b","a","a","K","a"}; 
		int maxValue = Integer.MAX_VALUE;
	int[] allOcuurences = allOcuurences(x,"a",x.length,0);
		for (int i = 0; i < allOcuurences.length; i++) {
			System.out.print(allOcuurences[i]);
		}
		
		/*N=6 COUNT=1 'A'
        N= 5 COUNT=1,'A 
   N= 4 COUNT=2,'A                [ 5, 3, 2,0]
   N = 3 COUNT=3,'A
      N= 2 COUNT=3,'A
       N=  1 COUNT=4,'A
        = N      0 COUNT=4,'A'*/
		
	ArrayList<Integer> al = new ArrayList<Integer>();

		
}
	public static int[] allOcuurences(String[] y,String target,int n,int count) {
		
	     if(n==0) {
			temp=new int[count];
			return temp;
		}
		
       if(y[n-1].equals(target)) {
			
			count++;
		}
      
		 allOcuurences(y,target,n-1,count);
		
	
		
		if(y[n-1].equals(target)) {
			
			
			temp[count-1]=n-1;
		}
		
	return temp;
		
		
		
		
	}

}
