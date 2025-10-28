package learnbay;

public class Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {5,4,3,9,1};
		
		System.out.println(istargetExist(x,3));
		
		
		float f = 3/2;
		System.out.println(f);
		

	}
	
	
	public static boolean istargetExist(int[] x,int targetvalue) {
		
		for (int i = 0; i < x.length; i++) {
			
			if(x[i]==targetvalue) {
				
				return true;
			}
		
	}
		
		return false;

}
	
}
