package learnbay;

public class Path {
	
	
	public static void main(String[] args) {
		
	
	
	int row=3;
	int col=3;
	
	int numberOfPath = NumberOfPath(0,0,row,col);
	System.out.println(numberOfPath);
	
	}

	
	public  static int NumberOfPath(int x,int y,int row,int col) {

		
		if(x==row-1 && y==col-1) {
			
			return 1;
		}
		
    if(x==row || y==col) {
			
			return 0;
		}
		
    int h = NumberOfPath(x,y+1,row,col);
    int v = NumberOfPath(x+1,y,row,col);
    int d = NumberOfPath(x+1,y+1,row,col);
    
    return h +v+d;
		
		
	}
}
