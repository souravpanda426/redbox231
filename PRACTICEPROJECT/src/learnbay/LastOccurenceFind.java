package learnbay;

public class LastOccurenceFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {1,2,3,4,6,7,8,4,6,7};
		
		System.out.println(LastOccurence(x,4,x.length-1)); 
		
		
		
		
	}
	
	
	public static int LastOccurence(int[] y, int target,int index) {
		
		
		if(index>=0) {
			
			if(y[index]==target) {
				
				return index;
				
			}
			
			index--;
			
			
			return LastOccurence(y,target,index);
			
		}
		return -1;
		
		
	}

}
