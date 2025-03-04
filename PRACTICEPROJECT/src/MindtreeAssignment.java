
public class MindtreeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String x = "xaaaaghxnmx";
		
		String y ="";
		
		for(int i=0;i<x.length();i++) {
			
			if(i==0 & x.charAt(i)=='x'||i==x.length()-1 & x.charAt(i)=='x') {
				
				y = y + x.charAt(i);
			}
			
			else if(x.charAt(i)!='x') {
				
				y = y + x.charAt(i);			}
		}
		
		System.out.println(y);
	}

}
