import java.util.Comparator;

public class MyComparators implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
Integer length = o1.toString().length();

Integer length2 = o2.toString().length();


		return length.compareTo(length2);
	}

}
