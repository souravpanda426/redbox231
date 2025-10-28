package learnbay;

public class productOfN {
	
	static int product =1;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int findProduct = findProduct(5);
		System.out.println(findProduct);
		
		

	}
	
	public static int findProduct(int n) {
		
		
		if(n>=1) {
			
			product = product * n;
			
			n--;
			findProduct(n);
			
		}
		return product;
	}

}
