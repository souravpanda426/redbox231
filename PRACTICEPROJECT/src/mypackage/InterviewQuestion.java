package mypackage;

public class InterviewQuestion {

	public static void main(String[] args) {
	
		
		int finalvalue=0;

		
		String[] st =  {"ABC12","WAG983","89UIO"};
		
		for (String string : st) {
			int sum = Sum(string);
			
			finalvalue = finalvalue + sum;
		}
		
		System.out.println(finalvalue);
		
	}
	
	
	
	private static int Sum(String x) {
		
		int sum=0;
		
		for(int i =0;i<x.length();i++) {
			char ch = x.charAt(i);
			
			if(ch>='0' & ch<='9') {
				sum = sum + (ch-48);
				
				
			}
		}
		return sum;
		
		
	}

}
