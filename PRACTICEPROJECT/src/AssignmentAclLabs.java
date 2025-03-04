import java.util.Arrays;
import java.util.Collections;

public class AssignmentAclLabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "Welcome to the Interview";
		
		String z = "";
		
		int[] y = new int[x.split(" ").length];
		
		int i =0;
		
		for(String st:x.split(" ")) {
			y[i]=st.length();
			i++;
			
		}
		
		Arrays.sort(y);
		
		
		for(int k=y.length-1;k>=0;k--) {
			
			
			for (String st : x.split(" ")) {
				
				if(st.length()==y[k]) {
					
					z = z + st+ " ";
				}
			}
		}
		
		
		System.out.println(z);
		System.out.println(0%2);
	}

}
