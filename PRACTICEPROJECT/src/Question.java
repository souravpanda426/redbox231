import java.util.ArrayList;

public class Question {
	
	
	String name = "Sourav";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input : My name is Sourav 
		//Output : Sourav is name My 
	
	
		
		String x = "My name is Sourav ";
		
		String z = "";
		
		ArrayList<String> al = new ArrayList<String>();

		
		char[] ch= x.toCharArray();
		
		System.out.println(ch);
		
		
		for (int i = 0; i< ch.length; i++) {
			
			String y ="";
			
			while(i<ch.length & ch[i]!=' ') {
				
				
				
				y = y+ch[i];
				
				i++;
			}
			
			
			
			al.add(y);
			
			
			
			
		}
		
		
		System.out.println(al);
		
		for(int i=al.size()-1;i>=0;i--) {
			
			z = z+ al.get(i)+" ";
		}
		
		System.out.println(z);
}
	
}
	

