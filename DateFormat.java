package mypackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		
		Date d =  new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		String format = simpleDateFormat.format(d);
		System.out.println(format);

	}

}
