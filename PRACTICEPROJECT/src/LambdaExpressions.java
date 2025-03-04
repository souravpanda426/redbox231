import java.util.ArrayList;


public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 0; i <=10; i++) {
			
			al.add(i);
			
		}
		
		 al.forEach(n -> {
	            if (n % 2 == 0)
	                System.out.println(n);
		 });

	}

}
