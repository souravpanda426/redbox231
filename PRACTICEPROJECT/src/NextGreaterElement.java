import java.util.ArrayList;
import java.util.Collections;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {10,11,5,4,7};
		
		for(int i=0;i<x.length-1;i++) {
			
			int ele = x[i];
			
			ArrayList<Integer> al = new ArrayList<Integer>();
			
			for (int j = i+1; j < x.length; j++) {
				
				al.add(x[j]);
				
			}
			
			Collections.sort(al);
			
			if(ele<al.get(al.size()-1)) {
				
				System.out.println(ele +" next elememt "+ al.get(al.size()-1));
			}
			
			else {
				
				System.out.println(ele + " "+ -1);
			}
		}
		
		
		System.out.println(x[x.length-1]+" next elememt  "+"-1");

	}

}
