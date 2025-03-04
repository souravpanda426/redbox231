
public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "MCMXCIV"; //58
		//III //3
		//MCMXCIV 1994
		
		
		/*I             1
V             5
X             10
L             50
C             100
D             500
M             1000*/
int res=0;
		
		
		for (int i = 0; i < s.length(); i++) {
			
			char charAt = s.charAt(i);
			
			int takeValue = takeValue(charAt);
			
			if(i+1<s.length()) {
				
				char charAt2 = s.charAt(i+1);
				
				int takeValueTwo = takeValue(charAt2);
				
				
				if(takeValue>=takeValueTwo) {
					
					res = res + takeValue;
				}
				
				else {
					
					res = res + takeValueTwo-takeValue;
					i++;
				}
				
				
				
				
			}
			
			else {
				
				res = res + takeValue(s.charAt(i));
			}
			
			
		}
		
		System.out.println(res);
		
	}
	
	public static int takeValue(Character x) {
	
	if(x=='I') {
		
		return 1;
	}
	else if(x=='V') {
		
		return 5;
		
	}
	
	else if(x=='X') {
		
		return 10;
	}
	
	else if(x=='L') {
		
		return 50;
	}
	
	else if(x=='C') {
		
		return 100;
	}
	
	else if(x=='D') {
		
		return 500;
	}
	return 1000;
	
	
	
	
	
	
	

}
	
}
