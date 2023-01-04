package mypackage;

public class Cat extends Tiger{
	
	public static void methodA(Tiger t) {
		
		if(t instanceof Cat) {
			System.out.print("instance of cat");
			
		}
		
		
		else if(!(t instanceof Leopard)){
			
			Leopard l =(Leopard)t;
			
			
			
			
		}
		
		else{
			
			System.out.print("nothing");
			
	
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Tiger t = new Cat();
		methodA(t);
	}

}
