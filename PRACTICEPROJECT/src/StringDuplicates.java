
public class StringDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "dobberman";
		
		String z = "";
		
		for (int i = 0; i < x.length(); i++) {
			
			int count=1;
			
			for (int j = i+1; j < x.length(); j++) {
				
				if(x.charAt(i)==x.charAt(j)) {
					
					count++;
				}
			}
			
			if(count==1) {
				z = z + x.charAt(i);
			}
		}
		
		System.out.println(z);

	}

}
