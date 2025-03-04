
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp=0;
		
		 HashSet<Integer> hs = new HashSet<Integer>();
		 String x = "JHGDDDDDGGHDGHDJHGDGHDHDJHGDRAWERDRTOIYLHKJ,MHNGFDTYUGJHNBVCXFDTFHGBV";
		 
		 
	      
	     int[] count = new int[128];
	     
	     for(int i=0;i<x.length();i++){
	       
	       char ch = x.charAt(i);
	     
	     count[ch]++;
	    
	     }
	    
	   
     for (int j = 0; j < count.length; j++) {
		
    	 hs.add(count[j]);
	     
     }
    
     int[] na = new int[hs.size()];
     
    
     for(Integer i:hs) {
    	 
    	 na[temp]=i;
    	 temp++;
    	 
     
     
	}
  
	 
		for(int k =0;k<na.length;k++) {
			
			for(int m =k+1;m<na.length;m++) {
				
				if(na[k]>na[m]) {
					
					temp=na[k];
					na[k]=na[m];
					na[m]=temp;
				}
				
			}
			
		}
		
		 for (int j = 0; j < count.length; j++) {
				
	    	
			 if(count[j]==na[na.length-3]) {
				 
				 System.out.println((char)(j));
			 }
		     
	     }
			  
	
	}
	
}
	

