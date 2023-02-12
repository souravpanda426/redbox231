package mypackage;

public class Cat extends Tiger{
	
	public static void methodA(Tiger t) {
		
		if(t instanceof Cat) {
			System.out.print("instance of cat");
			
		}
		
		
		else if((t instanceof Tiger)){
			
			System.out.print("instance of tiger");
			
			
			
			
		}
		
		else{
			
			System.out.print("nothing");
			
	
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Cat t = new Cat();
		methodA(t);
	}

}
