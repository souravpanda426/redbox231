import java.util.Stack;

public class BalancedBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "()()()";
		
		
		boolean valid = isValid(x);
		
		System.out.println(valid);
		
		}
	
	
	public static boolean isValid(String x) {
		
		boolean b = false;
		
		
		Stack<Character> st = new Stack<Character>();
		
		for (int i = 0; i < x.length(); i++) {
			
			char ch = x.charAt(i);
			
			if(ch=='{'||ch=='['||ch=='(') {
				st.push(ch);
			}
			else if(ch=='}'||ch==']'||ch==')') {
				
				try{
					
			Character peek = st.peek();
				
             Character value = getValue(ch);
				
				if(value==peek) {
					
					st.remove(peek);
				}
				
				}
				
				catch(Exception e) {
					
					b= false;
					
				 System.exit(2000);
					
				
				}
				
				
			}
			
		}
		
		
		if(st.isEmpty()) {
			
			b = true;
		}
		
		else {
			
			
				
				b =  false;			
				
		}
		return b;
	}
	
	
	public static Character getValue(char h) {
		
		if(h=='}')
			
			return '{';
		
      
		else if(h==')')
			
			return '(';
		
		
		
		return '[';
		
		
	}

}
