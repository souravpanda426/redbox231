
public class GoodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "bcdaeiou??";
		
		
		boolean b = isBadString(x);
		System.out.println(b);
		
		
	}
	
	
	public static boolean isBadString(String x) {
		
		
int count=0;
		
		int diff=0;
		
		for (int i = 0; i < x.length(); i++) {
			
			if(i+1-i==0 & x.charAt(i)=='a'||i+1-i==0 & x.charAt(i)=='e'||i+1-i==0 & x.charAt(i)=='i'||i+1-i==0 & x.charAt(i)=='o'||i+1-i==0 & x.charAt(i)=='u') {
				
				count++;
				
			}
			
			else if(i+1-i==0 & x.charAt(i)!='a'||i+1-i==0 & x.charAt(i)!='e'||i+1-i==0 & x.charAt(i)!='i'||i+1-i==0 & x.charAt(i)!='o'||i+1-i==0 & x.charAt(i)!='u') {
				
				diff++;
			}
		}
		
		
		
		return count>5 || diff>3;
		
	}

}
