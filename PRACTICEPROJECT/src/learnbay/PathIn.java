package learnbay;

public class PathIn {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int findPath = findPath(0,0,3,3);
		System.out.println(findPath);
	}
	
	
	
	public static int findPath(int i,int j,int m,int n) {
		
		if(i==m-1 && j==n-1) {
			
			return 1;
		}
		
		if(i>=m || j>=n) {
			
			return 0;
		}
		
		int ans=0;
		
		for(int jump=1;jump<=3;jump++) {
			
			int h = findPath(i,j+jump,m,n);
			int v = findPath(i+jump,j,m,n);
			int d = findPath(i+jump,j+jump,m,n);
			ans = ans + h+v+d;
			
			
		}
		return ans;
		
	
		
	}

}
