package learnbay;

public class FindAllocuurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {1,2,3,4,6,7,8,4,6,7};
		ALlOccurence(x,4,0);
		
		
	}
	
	
	public static void ALlOccurence(int[] y, int target,int index) {
		
		
	
		
		
		if(index<y.length) {
			
			
			if(y[index]==target) {
				
				
				System.out.println(index);
			}
			
			index++;
			
			
			
			ALlOccurence(y,target,index);
			
			
			
		}
		
		
	}
		
	}



