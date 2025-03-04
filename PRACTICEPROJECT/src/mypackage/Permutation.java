package mypackage;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x ="ABC";
		
		int l =0;
		int r = x.length();
		
		generatePermutation(x,l,r);
		
		
		
		
		

	}
	
	
	
	  public static void generatePermutation(String str, int start, int end)  
	    {  
	        //Prints the permutations  
	        if (start == end-1) {  
	            System.out.println(str);
	            return;
	            
	        }
	        
	        else  
	        {  
	            for (int i = start; i < end; i++)  {
	              
	                //Swapping the string by fixing a character  
	                str = swapString(str,start,i);  
	                //Recursively calling function generatePermutation() for rest of the characters   
	                generatePermutation(str,start+1,end);  
	                //Backtracking and swapping the characters again.  
	                str = swapString(str,start,i);  
	            }  
	        }  
	        
	        
	    }
	
	public static String swapString(String x,int a ,int b) {
		char[] cha = x.toCharArray();
		
		char temp = cha[b];
		cha[b]=cha[a];
		
		cha[a]=temp;
		
		return new String(cha);
		
	}

}
	  

