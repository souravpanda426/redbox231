import java.util.HashSet;

public class Subsequences {

	
	static HashSet<String> hs = new HashSet<String>();
	
	public static void main(String[] args) {
		
		HashSet<String> hst = findSubsequences("rabbit");
		System.out.println(hst);
	}
	
	
	

	public static HashSet<String> findSubsequences(String x){
		
		for (int i = 0; i < x.length(); i++) {
			
			
			for (int j = i+1; j <=x.length(); j++) {
				
				String substring = x.substring(i, j);
				
				
				if(!(hs.contains(substring))) {
					hs.add(substring);
					
				}	
				
				
				
			
				
				
				for(int k=1;k<substring.length()-1;k++) {
					
					StringBuffer st = new StringBuffer(substring);
					
					st.deleteCharAt(k);
					
					if(!(hs.contains(st))) {
						
						findSubsequences(st.toString());
					}
					
				}
				
				
				
				
				
			}
		}
		return hs;
		
		
	}
}
