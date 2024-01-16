package mypackage;

public class TwoPlaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question - Check if a string can be obtained by rotating another string 2 places
		String a = "amazon";
		String	b = "azonam";
		
		
		boolean rotated = isRotated(a,b);
		System.out.println(rotated);
		
		

		

	}
	
	public static boolean isRotated(String x , String y) {
		
		String c = y.substring(2, y.length())+y.substring(0, 2);
		
		
		
		return c.equals(x);
	}
	
	
	

}
