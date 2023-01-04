package mypackage;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ChildPredicates {
	
	
	static Predicate<CHILD> filterByAge(int x){
		
		return a -> a.getAge()>x;
		
				
	
	
	}
	
	
static List<CHILD> filterChilds( List<CHILD> childs,Predicate<CHILD> predicate){
		
		return childs.stream().filter(predicate).collect(Collectors.<CHILD>toList());
		
	}
	
	

}
