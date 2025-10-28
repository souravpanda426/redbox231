
public class Problemone {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "abbbcdddefgh";
		
		StringBuilder sb = new StringBuilder(); 
		int count=1;
		for (int i = 0; i < x.length()-1; i++) {
			
			
			
			if(x.charAt(i)==x.charAt(i+1)) {
				
				count++;
				
			}
			
			
			else {
				
                  if(count>1) {
					 
					 sb.append(count);
					 count=1;
					 
					 
				 }
                  
                  else {
				 
				
				
				
				
				 sb.append(x.charAt(i));
				 
                  }
				 
			}
			
			if(i==x.length()-2) {
				
				count=1;
				if(x.charAt(i)==x.charAt(i+1)) {
					
					count++;
					
				}
				
                  if(count>1) {
					 
					 sb.append(count);
					 count=1;
					 
					 
				 }
                  
                  else {
				 
				
				
				
				
				 sb.append(x.charAt(i+1));
				 
                  }
				
			}
			
			
			
			
			
			
			
			
			
		}
		
		System.out.println(sb.toString());

	}

}
