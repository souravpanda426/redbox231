package mypackage;

public class Reverses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input: s = “geeks quiz practice code” 
		//Output: s = “code practice quiz geeks”
		
		String x = "geeks quiz practice code";
		
		String[] split = x.split(" ");
		
		int l = split.length-1;
		
		String y = " ";
		
		while(l>=0) {
			
			y = y + " "+ split[l];
			
			l--;
		}
				
			
		System.out.println(y);
				

	}

}
