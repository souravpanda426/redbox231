package mypackage;

public class OccurenceWithOutLoop {
	
	
	static int count = 0;

	public static void main(String[] args) {
		
		String x = "SIR ISSAC NEWTON";
		int k =x.length()-1;
		
		int findOccurence = findOccurence(x,k);
		System.out.println(findOccurence);
			
			
		}
	
	
	
	public static int findOccurence(String x,int k) {
		
		
		if(k>=0) {
			
			if(x.charAt(k)=='S') {
				
				count++;
				
			}
			
			k = k -1;
			
			findOccurence(x,k);
		}
		return count;
		
		

		
	
		
		
		
		
		
		
		
		
	}

	}


