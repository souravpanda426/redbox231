
public class Questionsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "We are doing";
		char[] ch = x.toCharArray();
		
		for (int i = 1; i < ch.length; i++) {
			
			if(ch[i]!=' '&ch[i-1]==' ') {
				
				ch[i]= (char)(ch[i]-32);
			}
		}
		

		
		String y = "a b c d-e-f%g";
		
		String z ="";
		for(int i=0;i<y.length();i++){
			
			char ch2 = y.charAt(i);

		     if(ch2!='%') {
		    	 
		    	 z = z +ch2;
		     }

		     
		      }
		
		 System.out.println(z);

		    }
		
		
		
	}


