package mypackage;

import java.util.Comparator;

public class MyComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Integer length =  o1.toString().length();
		

		
		Integer length2 = o2.toString().length();
		
		
		if(length<length2) {
			
			return -1;
		}
		
		else if(length2>length) {
			
			return +1;
		}
		return length.compareTo(length2);
		
		
	}

}
