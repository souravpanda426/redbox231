
public class ConsecutiveOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,1,6,7,8,1,1,1,1,1,1,1,1,1};
		
		int max=0;
		
		int cnt = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			
			if(arr[i]==1) {
				
				max++;
			}
			
			else {
				
				max=0;
			}
			
			// cnt = Math.max(max, cnt);
			
			if(cnt<max) {
				cnt=max;
			}
		}
		
		
		System.out.println(cnt);

	}

}
