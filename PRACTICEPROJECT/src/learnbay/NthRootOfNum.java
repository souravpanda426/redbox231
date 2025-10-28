package learnbay;

public class NthRootOfNum {
	
	static int ans=1;
	int n=3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int low =1;
		int high = 25;
		int answer=0;
		
		while(low<high) {
			
			
			int mid = (low + high)/2;
			
			ans=1;
			if(isPower(3,25,mid)>=25) {
				
				answer=mid;
				high=mid;
				
			}
			
			else {
				
				
			low = mid+1;
			}
		}
		
		
		System.out.println(answer);
		
		
		

	}
	
	public static int isPower(int power,int target,int num) {
		
		
		
		while(power>=1) {
			ans = ans * num;
			power--;
			
		}
		return ans;
		
	}

}
