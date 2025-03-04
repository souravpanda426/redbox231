
public class FirstOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "sadbutsad";
		String y = "but";
		
		for (int i = 0; i < x.length(); i++) {
			
			if(x.charAt(i)==y.charAt(0) & x.substring(i, i+y.length()).equals(y)) {
				
				System.out.println(i);
				break;
				
			}
			
		}
	}

}
