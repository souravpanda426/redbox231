package mypackage;

public class ONLYDIGITS {

	public static void main(String[] args) {
		
		
		
		String x = "123";
	    System.out.println(onlyDigits(x));
		
		
		
		
	}
	
	
	
	public static boolean onlyDigits(String x) {
		
		for(int i=0;i<x.length();i++) {
			
			
			
        char charAt = x.charAt(i);
        
        if(charAt >= 33  & charAt<= 47) {
        	
        	return false;
        	
        }
        
        else if(charAt >= 58  & charAt<= 126){
        	
        	
        	return false;
        	
        }
			
			
			
			
		}
		return true;
		
		
		
		
	}

}
