import java.util.HashMap;

public class Isomprphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "aab";
		String y = "xyz";
		
		String z ="";
		
		HashMap<Character,Character> hm = new HashMap<Character,Character>();
		
		
		for (int i = 0; i < x.length(); i++) {
			
			if(!(hm.containsKey(x.charAt(i)))) {
				
				hm.put(x.charAt(i),y.charAt(i));
			}
		}
		
		
		for (int i = 0; i < x.length(); i++) {
			
			Character character = hm.get(x.charAt(i));
			
			z = z+ character;
			
		}
		
		System.out.println(z);

	}

}
