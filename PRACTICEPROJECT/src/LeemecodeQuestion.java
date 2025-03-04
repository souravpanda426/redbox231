
public class LeemecodeQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "PAYPALISHIRING";
		
		int l = 0;
		
	/*	P   A   H   N
		A P L S I I G
		Y   I   R*/
		
		int row=3;
		int col = 6;
		/*int gap = (row-2)*2+1;
		String res = "";
//		char[][] na = new char[row][col];
		for(int i =0; i<row; i++) {
			for(int j=gap; j>0; j-=2) {
				for(int k = i; k<x.length()-1; k+=gap) {
					res=res+ x.charAt(k+1);
				}
			}
		}*/
		
		char[][] na = new char[row][col];
		
		
	for (int i = 0; i < na.length; i++) {
			
		for (int j = 0; j < na[i].length; j++) {
		
			if(i==0 ||i==2) {
				
				
			char charAt = x.charAt(l);
				
					
			na[i][j]=charAt;
			
			
			
			j=j++;
			na[i][j]=' ';
      if(l<x.length()) {
				
				l++;
			}
		
				
				
			}
		
			else {
				
				na[i][j]=x.charAt(l);
				
				
				if(l<x.length()) {
					
					l++;
				}
				}
			
		}
		}
	
	for (int i = 0; i < na.length; i++) {
		
		for (int j = 0; j < na[i].length; j++) {
		
			System.out.print(na[i][j]);
			
			}
	}
		
	
	

	}

}
