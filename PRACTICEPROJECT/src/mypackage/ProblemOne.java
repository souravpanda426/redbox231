package mypackage;

import java.util.Arrays;

public class ProblemOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
		Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.*/
		
		int[] x = {23,1,24,45,67,88,20,55};
		
		Arrays.sort(x);
		
		int[] y = new int[x.length];
		
		int start=0 ; int end =x.length;
		
		int g = x.length-1;
		
		int i =0;
		
		
		while(start<end) {
			
			y[start]=x[g];
			
			start++; g--;
			
			y[start]=x[i];
			
			 start=start+1;
			 i=i+1;
		}
		
		
		for(int z=0;z<y.length;z++) {
			System.out.println(y[z]);
		}

	}

}
