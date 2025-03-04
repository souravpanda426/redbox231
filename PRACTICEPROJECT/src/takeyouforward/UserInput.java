package takeyouforward;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader is = new InputStreamReader(System.in);
		
		is.read();
		
		BufferedReader bf = new BufferedReader(is);
		
		System.out.println(bf.readLine());

	}

}
