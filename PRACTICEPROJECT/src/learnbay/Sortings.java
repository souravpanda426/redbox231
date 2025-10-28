package learnbay;

import java.util.Arrays;
import java.util.Comparator;

public class Sortings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] val = {60,100,120};
		int[] wt = {10,20,30};
		int[][] item = new int[val.length][2];
		
		
		for (int i = 0; i < item.length; i++) {
			
			item[i][0]=val[i];
			item[i][1]=wt[i];
		
		}
		
		Arrays.sort(item,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
			
				
				int x = o1[0]/o1[1];
				int y = o2[0]/o2[1];
				
				
				if(x<y) {
					
					return +1;
				}
				
				else if(y>x){
					
					return -1;
					
					
				}
				return 0;
			}

			});
		
		int sum=0; int value = 0;
		
		
		for (int i = 0; i < item.length; i++) {
			
		
			if(sum + item[i][1]<=50) {
				
				sum = sum + item[i][1];
				value=value + item[i][0];
				
			}
			
			else {
				
				
				int remaining = 50-sum;
				double newval = (double)remaining/item[i][1] * item[i][0];
				value = value + (int)newval;
			}
			
		}
		
		
		

		
	System.out.println(value);

	}

}
