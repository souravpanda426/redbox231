package takeyouforward;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y; 
		System.out.println(add.apply(10, 20)); // Output: 30
		
		Function<String, String> toUpper = str -> str.toUpperCase();
		toUpper.apply("low");
		
		BiFunction<Double,Double,Double> average = (j,k)-> (j+k)/2;
		Double apply = average.apply(9.7, 4.5);
		System.out.println(apply);
		
		List<Integer> mylist = Arrays.asList(1,2,3,3,4,5);
		List<Integer> collect = mylist.stream().distinct().collect(Collectors.toList());
		System.out.println(collect); 
		
		int reduce = IntStream.range(1, 6).reduce(1,(a,b)->a*b);
		System.out.println(reduce);
		
		int number = 25;
		boolean allMatch = IntStream.rangeClosed(2, (number/2)).noneMatch(n->number%n==0);
		System.out.println(allMatch);
		
		
		BiFunction<String, String, String> concat = (x, y) -> x + y;
		String apply2 = concat.apply("hello", "world");
		System.out.println(apply2);
		
		
	    List<Integer> collect2 = mylist.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
	    System.out.println(collect2.get(0));
	    
	    List<Integer> myList = Arrays.asList(5,5,6,7,8,9);
	    myList.stream().reduce((a,b)->a+b);
	  
		
		
	}

}
