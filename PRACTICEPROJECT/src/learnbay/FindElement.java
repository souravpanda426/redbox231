package learnbay;

public class FindElement {
	
	public static boolean b=false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] x = {1,2,3,4,5};
		
		target(x.length-1,x,3);
		if(b==false) {
			
			System.out.println("false");
		}
		
	}
	
	public static void target(int x,int[] y,int target) {
		
		
		
		if(x>=0) {
			
			if(y[x]==target) {
				System.out.println("true");
				b=true;
				
			}
			
			
			
			x=x-1;
			
			target(x,y,target);
			
			
			
			}
		}
	
		
	}


