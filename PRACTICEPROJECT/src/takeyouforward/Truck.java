package takeyouforward;

public class Truck implements Vehichle{
	
	
     @Override
	 public void drive() {
			
			System.out.println("truck drives");
		}
     
     public static void main(String[] args) {
		
    	 //Vehichle v = new Truck();
    	 Vehichle v = new Car();
    	 v.drive();
    	 
	}

}
