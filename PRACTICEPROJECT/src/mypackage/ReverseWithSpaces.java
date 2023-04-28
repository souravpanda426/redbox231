package mypackage;

public class ReverseWithSpaces {

	public static void main(String[] args) {
		
		
		String x = "GEEKS FOR GEEKS";
		char[] cha = x.toCharArray();
		int start = 0;
		int end = x.length()-1;
		String rev = " ";
		
		while(end>=start) {
			
			rev += cha[end];
			
			end--;
			
			
			
			
			
			
		}
		
		System.out.println(rev);
		

	}

}
