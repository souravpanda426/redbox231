package mypackage;

public class RemoveCharacterFromString {

	

	public static void main(String[] args) {
	
		
		String x = "ADVERTISEMENT";
		
		int f=0;
		Character ch = 'E';//character to be removed
		String y = " ";
		for (int i = 0; i < x.length(); i++) {
		
			
			if(x.charAt(i)!=ch) {
				
				y = y + x.charAt(i);
				
			}
			
			
			
		}
		
		String name = ((Object)(f)).getClass().getName();
		System.out.println(name);
	
	
		
		
		System.out.println(y);
		System.out.println(x.getClass().getName());
		
		

	}

}
