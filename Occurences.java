package mypackage;

public class Occurence {

	public static void main(String[] args) {
		
		
		String x = "hello world";
		
		for (int i = 0; i < x.length(); i++) {
			
			char ch = x.charAt(i);
			
			if(ch=='o') {
				System.out.println(ch + "first occurence is in "+ i +"index");
				break;
			}
			
			
			
		}
		
		for(int i=x.length()-1; i>=0;i--) {
			char ch = x.charAt(i);
			if(ch=='o') {
				System.out.println(ch + "last occurence is in"+  i + "index");
				break;
			}
			
			
			
		}

	}

}
