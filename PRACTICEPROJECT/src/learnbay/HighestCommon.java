package learnbay;

import java.util.ArrayList;
import java.util.Collections;

public class HighestCommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 38;
		int y= 57;
		int n = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();		
		if(x>y) {
			
			n= x;
			
		}
		
		else {
			
			n=y;
		}
		
		
		for(int i=1;i<=n;i++) {
			
			if(x%i==0 && y%i==0) {
				
				al.add(i);
				
			}
		}
		
		Collections.sort(al);
		
		System.out.println(al.get(al.size()-1));

	}

}
