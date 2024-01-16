package mypackage;

import java.util.Arrays;

public class SampleMy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String ar[] = {"apple","ape","april"};
		  String y = " ";
		  String maxlen=" ";
		  String minlen=" ";
		  
		  int max=0;
		  
		  int j=0;
		  
		  
		  int[] x = new int[ar.length];
		  
		  int k=0;
		  
		  for (String i : ar) {
			  x[k]=i.length();
			  
			  k++;
			  
			  
			
		}
		  
		  Arrays.sort(x);
		  
		 int min=x[0];
		  
		 max= x[x.length-1];
		 
		 
		 
		 
		
		for(String f:ar) {
			
			if(f.length()==max) {
				
				maxlen=f;
			}
			
		}
		
         for(String f:ar) {
			
			if(f.length()==min) {
				
				minlen=f;
			}
			
		}
		 
		 
         //System.out.println(maxlen);
		 
		 
		 int m = 0;
		 while(m<min) {
			 
			 if(minlen.charAt(m)==maxlen.charAt(m)) {
				 
				 y= y+ minlen.charAt(m);
				 
			 }
			 
			 m++;
			 
			 
		 }
		 
		 System.out.println(y);
		  
		  
		  }
		  
		 
		 
		
		  
		  
		  
	

}
