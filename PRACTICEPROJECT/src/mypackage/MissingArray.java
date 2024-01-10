package mypackage;

public class MissingArray {
	
	
	 // Function to find the missing number
    public static int getMissingNo(int[] nums,int n)
    {
    	
    	int sum =0;
    	int sums=0;
    	for(int i=0;i<nums.length;i++) {
    		
    		sum = sum + nums[i];
    	}
       
    	
    	for(int i=1;i<=n;i++) {
    		
    		sums=sums+i;
    		
    	}
    	
    	return sums-sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] x = {1,2,3,4,6};
		
		int missingNo = getMissingNo(x,6);
		System.out.println(missingNo);
		
		


	}

}
