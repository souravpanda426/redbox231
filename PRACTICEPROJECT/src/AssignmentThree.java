
import java.util.HashMap;


public final class AssignmentThree{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		 int[] x = {0,1,1,1,3,0};
	        
	        int[] y = new int[x.length];
	        
	        
	        
	        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	        
	        for(int i=0;i<x.length;i++){
	            
	            
	            if(hm.containsKey(x[i])){
	                hm.put(x[i],hm.get(x[i])+1);
	                
	            }
	            
	            else{
	                hm.put(x[i],1);
	            }
	            
	            
	        }
	        
	        for(int i=0;i<y.length;i++){
	            
	            if(hm.get(i)!=null){
	                
	                int l = hm.get(i);
	                y[i]=l;
	            }
	            
	            else if(hm.get(i)==null){
	                y[i]=0;
	            }
	        }
	    
	
	
	 for(int k=0;k<y.length;k++){
		 
		 System.out.println(y[k]);
	 }

				

}

}

