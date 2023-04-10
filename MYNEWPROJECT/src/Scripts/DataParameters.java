package Scripts;



import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataParameters {
	
	
	@Test()
	
	@Parameters("city")
	
	public void aB(@Optional("kolkota") String city) {
		System.out.println(city);
		
	}

}
