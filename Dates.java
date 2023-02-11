package mypackage;

public class Date {

	public static void main(String[] args) {
		
		
		long currentTimeMillis = System.currentTimeMillis();
		java.sql.Date d = new java.sql.Date(currentTimeMillis);
		
		System.out.println(d);

	}

}
