package mypackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

public class AppendStringToText {

	public static void main(String[] args) throws IOException {
		
		
		String  x = "ANKUSH";
		
		Random r = new Random();
		int nextInt = r.nextInt();
		File f = new File("xyz.rtf"+nextInt);
		FileOutputStream fout = new FileOutputStream(f);
		@SuppressWarnings("resource")
		ObjectOutputStream oop = new ObjectOutputStream(fout);
		oop.writeObject(x);
		System.out.println("written 2 file sucessfully");
		
		
		

	}

}
