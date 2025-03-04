import java.util.ArrayList;


public class LicenseKeyFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "5F3Z-2e-9-w";
		String or = "";
		String fn ="";
		
		ArrayList<String> al =  new ArrayList<String>();
		
		for (int i = 0; i < x.length(); i++) {
			
			if(x.charAt(i)!='-') {
				or = or + x.charAt(i);
				
				
			}
		}
		
	
		System.out.println(or);
		
		int k = 2;
		
		int count = -1;
		
		String y="";
		
		
		if(or.length()%4==0) {
			
			
			for(int i =0;i<or.length();i++) {
				
				
				y = y + or.charAt(i);
				count++;
				
				if(count==k-1) {
					al.add(y);
					y="";
					count =-1;
					
				}
				
				
			}
		}
		
		
		System.out.println(al);
		
	for (int i = 0; i < al.size()-1; i++) {
		
		fn = fn + al.get(i)+"-";
		
	}
	
		
		System.out.println(fn+al.get(al.size()-1));
	
		
	}

}
