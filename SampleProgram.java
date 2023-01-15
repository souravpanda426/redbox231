package mypackage;

public class SampleProgram {

	public static void main(String[] args) {
		
		
		String x = "ROHIT KUMAR RAKESH BHAI PATRA";
		
		String[] split = x.split("\\s");
		
		int i =0;
		
		String y ="";
		
		while(i<split.length-1) {
			y = y + split[i] + " ";
			
			i++;
			
		}
		
		
		
		String z ="";
		
		
		
		for (int j = 0; j < y.length()-1; j++) {
			
			
			if(j==0) {
				z = z + y.charAt(0)+".";
				
			}
			
			else if(y.charAt(j)==' ' & y.charAt(j+1)!=' ') {
				z = z +  y.charAt(j+1) + ".";
				
				
			}
			
		}
		
		z = z+ " "+ split[split.length-1];
		System.out.println(z);
		
		
		
		
	
	    
			
		}

	}


