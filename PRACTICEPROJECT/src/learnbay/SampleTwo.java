package learnbay;

public class SampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {3,2,4,1,2,3,2,2,1,2,2,2};
		
		int checkMajority = CheckMajority(x);
		
		System.out.println(checkMajority);
		
		
		
		
		
		

		
	}
	
	
	public static int CheckMajority(int[] x) {
		
		int majority = Basic.majority(x);
		
	     int count=0;
		
		
		
		for (int i = 0; i < x.length; i++) {
			
			if(x[i]==majority) {
				count++;
				
			}
		}
		
		if(count>x.length/2) {
			
			return majority;
			
		}
		return -1;
		
		
		
	}

}
