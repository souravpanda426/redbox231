package takeyouforward;

import java.util.ArrayList;
import java.util.Arrays;

public class Leaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4, 8,7,6,5, 1, 0};
		
		ArrayList printLeaders = printLeaders(arr);
		System.out.println(printLeaders);
		
		
		
	
	}
	
	
	public static ArrayList printLeaders(int[] x) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		int max = x[x.length-1];
		
		for(int i=x.length-2;i>=0;i--) {
			
			if(max<x[i]) {
				al.add(x[i]);
				max = x[i];
				
			}
		}
		return al;
		
	}


}
