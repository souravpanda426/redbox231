import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Question6 {
	
	
	int j =0;
	
	static int  max =0;
	
	static int ind=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] x = {"hen","finger","aysopiukopi"};
	
	
	
	
		
		
		for (int i = 0; i < x.length; i++) {
			
			if(max<x[i].length()) {
				
				max=x[i].length();
			}
		}
		
		//System.out.println(max);
		String combine = new Question6().combine(x);
		System.out.println(combine);
	}
	
	

	
	String f="";
	
	public  String combine(String[] b) {
		
		for(int i=0;i<b.length;i++) {
			
			if(j<max & j < b[i].length() ) {
				
				
					
				f = f + b[i].charAt(j);	
				
				
				
				
			}
			
			
			
			else {
				
				continue;
			
			}
			
			//System.out.println(f);
			//System.out.println(j);
			
			if(i==b.length-1) {
				
				j++;
				
				combine(b);
			}
			
			
			
			
		}
		
		return f;
		
		
	}

}
