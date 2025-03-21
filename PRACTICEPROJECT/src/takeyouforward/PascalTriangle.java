package takeyouforward;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	/*	1
	   1 1
	  1 2 1
	  1 3 3 1
	 1 4 6 4  1*/
		
		List<List<Integer>> ans = new ArrayList<>();
	   
		
	int row = 4;
	
	for(int i=0;i<=row;i++) {
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int k=0;k<=row;k++) {
			
			int takeElement = takeElement(i,k);
			
			al.add(takeElement);
			
			
		}
		
		//System.out.println(al);
		
		ans.add(al);
		
	}
	
	
	System.out.println(ans);

	}
	
	
	public static int takeElement(int row,int col) {
		
		int res=1;
		
		for(int k=0;k<col;k++) {
			
			res = res * (row-k);
			
			res = res/(k+1);
			
		}
		
		return res;
	}
	
	
	
	}

