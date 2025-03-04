
public class PreserveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String x = "I AM A STRING ";
		
		String st = "";
		
		char[] ch = x.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			
			int k = i;
			
			while(i<ch.length & ch[i]!=' ') {
				
				i++;
			}
			
			int j = i-1;
			
			
			while(j>=k) {
				
				st = st + ch[j];
				
				j--;
			}
			
			
			if(i<ch.length) {
				
				st = st +ch[i];
				
			}
		}
		
		System.out.println(st);
		
		
	}
	
	
}