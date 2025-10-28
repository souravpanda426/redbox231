package learnbay;

public class ClimbStair {
	
	
	public static int climbStair(int  st,int end,String path) {
		
		
		if(st==end) {
			System.out.print(path+ " ");
			return 1;
		}
		
		if(st>end) {
			
			return 0;
		}
		
		
		int x = climbStair(st+1,end,path+"x");
		int y = climbStair(st+2,end,path+"y");
		int z = climbStair(st+3,end,path+"z");
		
		int ans = x+y+z;
		
		return ans;
	
		
	}

	public static void main(String[] args) {
	
		
		System.out.println(climbStair(0,5,""));

		
	}

}
