package mypackage;

public class B extends A {
	
	  int i = 34;
	
	
	public  void check(){
		
		//System.out.println(super.i);
		System.out.println(this.i);
	}
	
	
	public void checkTwo() {
		
		int i = 43;
	}
	
	

	public static void main(String[] args) {
		
	
	B b = new B();
	System.out.println(b.i);
	b.check();


	}

}
