package mypackage;


import java.util.SortedSet;
import java.util.TreeSet;

public class SmallestNumber {
	
	static SortedSet<Integer> s;

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		s= new TreeSet();
		int[] x = {5,7,4,3,1,22};
		
		
		
		for (Integer in : x) {
			s.add(in);
			
			
		}
		
		Integer first = s.first();
		System.out.println(first);

	}

}
