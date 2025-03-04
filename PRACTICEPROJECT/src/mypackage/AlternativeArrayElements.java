package mypackage;

import java.util.Iterator;
import java.util.PrimitiveIterator.OfInt;
import java.util.stream.IntStream;

public class AlternativeArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {1,2,3,4,5,6,7,8,9,10};
		
		 IntStream map = IntStream.range(0, ar.length).filter(i->ar[i]%2==0).map(i->ar[i]);
		 
		 
		 OfInt iterator = map.iterator();
	
		 
		 while(iterator.hasNext()) {
			 
			 
			 Integer next = iterator.next();
			 
			 System.out.println(next);
		 }
		
	
		
		}

	}


