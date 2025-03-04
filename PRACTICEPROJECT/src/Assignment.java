import java.util.ArrayList;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//You are given a string s and an array of strings words. All the strings of words are of the same length.

/*A concatenated string is a string that exactly contains all the strings of any permutation of words concatenated.

For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab" are all concatenated strings. "acdbef" is not a concatenated string because it is not the concatenation of any permutation of words.
Return an array of the starting indices of all the concatenated substrings in s. You can return the answer in any order.*/
		
		
		String[] x = {"ab","cd","ef"};
				
		
		
		boolean b = isAllCharacterPresent(x,"efcdab");
		
		System.out.println(b);

	}
	
	
	
	
	public static boolean isAllCharacterPresent(String[] x,String y) {
	
		ArrayList<String> al = new ArrayList<String>();
	
	
	for(int i=0;i<y.length();i++) {
		
		for(int j=i+1;j<y.length()+1;j++) {
			
		String substring = y.substring(i, j);
		
		al.add(substring);
			
		
		
	}
	 
	
}
	
	
   String[] st = new String[3];
	
	int k = 0;

	for (int i = 0; i < x.length; i++) {
		
		String z = x[i];
		
		for (int j = 0; j < al.size(); j++) {
			
			
			if(al.get(j).equals(z)) {
				
				st[k]=z;
				
				k++;
				
			}
		}
	}
	
	
	
	for (int i = 0; i < x.length; i++) {
		
		if(st[i]!=x[i]) {
			
			return false;
		}
		
	}
	return true;


}
	
}
