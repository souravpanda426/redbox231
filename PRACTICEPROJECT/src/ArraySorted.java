
public class ArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {0,2,3,4,8};
		
		boolean sorted = isSorted(x);
		System.out.println(sorted);

	}
	
	
	public static boolean isSorted(int[] y) {
		
		
for (int i = 0; i < y.length-1; i++) {
			
			if(y[i]>y[i+1]) {
				
				return false;
			}
		}
return true;
		
	}

}
