package mypackage;

public class SampleProgram {
	
	
	//java program to enter a name and it will display the first letter of all name followed by dot and title

	public static void main(String[] args) {
		
		
		String x = "AKABAR ANWAR SOHAIL KHAN";
		
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


