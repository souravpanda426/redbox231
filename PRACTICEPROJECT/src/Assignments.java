import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "Welcome to the Interview";
		
		String y = "";
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		
		for(String st:x.split(" ")) {
			
			hm.put(st,st.length());
		}

		
		ArrayList<Entry<String,Integer>> al = new ArrayList<Entry<String,Integer>> (hm.entrySet());
		
		Collections.sort(al,new MySortings());
		
		for (Entry<String, Integer> entry : al) {
			
			String key = entry.getKey();
			
			y = y+key+ " ";
		}
		
		System.out.println(y);
	}

}
