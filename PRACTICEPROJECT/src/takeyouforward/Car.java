package takeyouforward;

public class Car implements Vehichle {

	
	@Override
	  public void drive() {
			
			System.out.println("car drives");
		}
	
	

	  
	  public static void main(String[] args) {
		
		  Vehichle v = new Car();
		  v.drive();
		  
		  
		  
}
	  
}
