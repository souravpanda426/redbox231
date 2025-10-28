package learnbay;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] x = {"a","b","c","d","e","f"};
		
		int rotation= 4;
		
		while(rotation>0) {
			
			rotate(x);
			
			rotation--;
			
		}
		
		
		for (int i = 0; i < x.length; i++) {
			
			System.out.print(x[i]);
		}
		
		
	}
	
	public static void rotate(String[] ch) {
		
		String temp= ch[ch.length-1];
		
		
		for (int i = ch.length-1; i > 0; i--) {
			
			
			
			ch[i]=ch[i-1];
			
			
			
		}
		
		ch[0]=temp;;
		
	}
	
	
	

}
