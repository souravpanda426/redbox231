package learnbay;

public class SmalestDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {1,2,3,4,5};
		int threshold=8;
		
		int low =0;
		int high = x.length-1;
		int ans=0;
		
		while(low<=high) {
			
			
			int mid = (low + high)/2;
			
			if(isThreshold(x[mid],x,threshold)){
				
				ans=x[mid];
				
				high=mid-1;
				
			}
			
			else {
				
				low = mid+1;
			}
		}
		
		System.out.println(ans);
		
		
		
		
		}
	
	public static boolean isThreshold(int y,int[] x,int threshold) {
		
		int sum=0;
		
		for (int i = 0; i < x.length; i++) 
			
		
			sum += Math.ceil((double)(x[i]) / (double)(y));
			
			
			
		return sum<=threshold;
		
	}
	
	
	
	}


