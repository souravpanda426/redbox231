package learnbay;

public class Solutions {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[][] dir = {{0,1},{1,0}};
	     int fun = fun(0,0,3,7,dir);
		System.out.println(fun);

	}
	
	public static int fun(int r,int c,int row,int col,int[][] dir) {
		
		
		if(r==row-1 && c==col-1) {
			
			return 1;
		}
		                                               
		int ans=0;
		
		
		for(int jump=1;jump<=1;jump++) {
			
			
			for(int i=0;i<dir.length;i++) {
				
				
				int nr = r+ dir[i][0] * jump;
				int nc = c + dir[i][1] * jump;
				
				
				if(nr<row && nc<col) {
					
					ans+=fun(nr,nc,row, col,dir);
				}
			}
		}
		return ans;
		
	}

}
