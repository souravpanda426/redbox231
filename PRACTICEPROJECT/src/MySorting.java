import java.util.Comparator;

public class MySorting  implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
Integer length = (Integer)o1.length();

Integer length2 = (Integer) o2.length();


return length2.compareTo(length);
	




	}

}
