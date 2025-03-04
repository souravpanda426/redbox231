
public class QuestionsR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "PAHNAPLSIIGYIR";
		int k =0;
		
	/*	P   A   H   N
		A P L S I I G
		Y   I   R*/

		
		
		for(int i=0;i<3;i++) {
			
			
			for(int j=0;j<x.length();i++) {
				
				if(i==0||i==2) {
					
					if(j%2==0) {
						System.out.print(x.charAt(j));
						
					}
					
					
				}
				
				else {
					System.out.print(x.charAt(j));
					k++;
				}
			}
			
			System.out.println();
		}
		
	}

}
