import java.util.Arrays;
import java.util.Collections;

public class LongestCommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] x = {"flower","flow","flight"};
		
		Arrays.sort(x);
		
		int i = x[0].length();
		
		int k = 0;
		
		String z = "";
		
		while(k<i &x[0].charAt(k)==x[x.length-1].charAt(k) ) {
			
			z = z + x[0].charAt(k);
			
			k++;
		}
		
		
		System.out.println(z);
		
		
	}
		
	}


