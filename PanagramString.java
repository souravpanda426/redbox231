package mypackage;

public class PanagramString {

	public static void main(String[] args) {


		boolean panagram = isPanagram("abcdefghijklmnopqrstuvwxyz");
		System.out.println(panagram);
	}
	
	
	
	private static boolean isPanagram(String x) {
		
	
		int[] count = new int[26];

		for (int i = 0; i < x.length(); i++) {
			char charAt = x.charAt(i);

			if(charAt>='A' & charAt <='Z') {


				count[charAt-65]++;


			}
			
			if(charAt>='a'& charAt<='z') {
				count[charAt-97]++;
			}
			
			
			
		}
		
		for(int i=0;i<26;i++) {
			
			if(count[i]==0) {
				return false;
			}
		}
		return true;

		
		
	}

}
