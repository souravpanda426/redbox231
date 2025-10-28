package learnbay;

public class FindTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {1,2,3,4,6,7,8};
		
		System.out.println(findTarget(x,0,4));
	}
	
	
	public static boolean findTarget(int[]x,int y,int target) {
		
	
		if(y<x.length) {
			
			if(x[y]==target) {
				
				return true;
			}
			
			
			
			y++;
			
		
			
			 return findTarget(x,y,target);
			
		}
		return false;
		
		
	}

}
