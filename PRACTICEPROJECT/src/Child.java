
public class Child extends Parent{

	
	
	

@Override	
public void sleep() {
		
		System.out.println("child  eats");
	}

public static void main(String[] args) {
	
	
	int[] x = {1,2,3,4,5};
	
	for (int i = 0; i < x.length; i++) {
		
		if(x[i]==4) {
			
			break;
			
		}
		
		else {
			
			System.out.println(x[i]);
		}
	}
}
}
