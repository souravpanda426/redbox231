import java.util.ArrayList;
import java.util.Collections;


public class QuestionFiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*/https://leetcode.com/problemset
		
		{1,2,4}
		;{1,3,4}*/
		
		ArrayList<Integer> list1 =new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(4);
		list2.add(1);
		list2.add(3);
		list2.add(4);
		
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		
		for (Integer integer : list1) {
			
			list3.add(integer);
			
		}
		
		for (Integer integer : list2) {
			
			list2.add(integer);
		}
		
		Collections.sort(list3);
		
		System.out.println(list3);
	}

}
