package mypackage;

public class Addition {



	public static void main(String[] args) {




		int x = 40;
		int y = 20;
		boolean result = false;
		
		/*if(x>y) {
			System.out.println(x);
		}
		else if(y>x) {
			System.out.println(y);
		}
		
		else {
			System.out.println("both equal");
			
		}*/
		
		if(x>y) {
			x = 1;
		}
		
		else {
			x=2;
		}
		switch(x) {
		
		case 1 :
		
			System.out.println("x>y");
			break;
		
		case 2 :
			
			System.out.println("x<y");
			break;
			
			default:
				
				System.out.println("both equal");
				
		}

	}

}
