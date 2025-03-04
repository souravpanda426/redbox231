
public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String x = "aa";
		String y = "*a";
				
		boolean regularExpressionMatching = isRegularExpressionMatching(x,y);
		System.out.println(regularExpressionMatching);
				
	}
	
	
	public  static boolean isRegularExpressionMatching(String x,String y) {
		
		
		if(x.length()!=y.length()) {
			
			return false;
		}
		
		else if(x.equals(".*")) {
			
			y=x;
		}
		
		else {
			
			
			char[] charArray = x.toCharArray();
			
			
			for (int i = 0; i < charArray.length; i++) {
				
				if(charArray[i]=='*') {
					
					charArray[i]=charArray[i-1];	
			}
			}
			
			y = new String(charArray);
			
			System.out.println(y);
		}
		return x.equals(y);
	}

}
