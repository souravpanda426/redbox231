package learnbay;

public class Paths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y = NumberOfPath(0,0,3,3);

		System.out.println(y);
	}
	
	
public  static int NumberOfPath(int x,int y,int row,int col) {

		
		if(x==row-1 & y==col-1) {
			
			return 1;
		}
		
    if(x>=row || y>=col) {
			
			return 0;
		}
    
    int h1 = NumberOfPath(x,y+1,row,col);
    int h2 = NumberOfPath(x,y+2,row,col);
    int h3 = NumberOfPath(x,y+3,row,col);
    
    int v1 = NumberOfPath(x+1,y,row,col);
    int v2 = NumberOfPath(x+2,y,row,col);
    int v3 = NumberOfPath(x+3,y,row,col);
    
    int d1 = NumberOfPath(x+1,y+1,row,col);
    int d2 = NumberOfPath(x+2,y+2,row,col);
    int d3 = NumberOfPath(x+3,y+3,row,col);
    //System.out.println(h1+h2+h3+v1+v2+v3+d1+d2+d3);
    return h1+h2+h3+v1+v2+v3+d1+d2+d3;
    

}

}
