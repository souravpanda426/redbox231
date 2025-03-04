
public class LongestValidParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = ")()())";
		
		
		
		for (int i = 0; i < x.length(); i++) {
			
			for(int k=i+1;k<x.length()+1;k++) {
				
				String y = x.substring(i, k);
				
				if(BalancedBracket.isValid(y)==true) {
					
					System.out.println(y);
				}
				
				
			}
			
			
		}

	}

}
