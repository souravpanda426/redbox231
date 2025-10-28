
public class PrintElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {3,4,5,6,7,8};
		
		print(x,0);//faith

	}
	
	
	public static void print(int[] y,int k) {
		
		if(k==y.length) {
			
			return;
		}
		
		
		System.out.println(y[k]);//task
		
		
		print(y,k+1);//expectation
		
	}

}
