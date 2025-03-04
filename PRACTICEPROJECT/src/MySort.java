import java.util.Comparator;
import java.util.Map.Entry;

public class MySort implements Comparator<Entry<Character,Integer>> {

	

	@Override
	public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
		// TODO Auto-generated method stub
		Integer value1 = o1.getValue();
		
		Integer value2 = o2.getValue();
		
		if(value1<value2) {
			
			return +1;
		}
		
		else if(value2>value1) {
			
			return -1;
		}
		return value2.compareTo(value1);
		
		
	}

}
