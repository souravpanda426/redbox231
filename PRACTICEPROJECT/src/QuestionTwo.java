import java.util.ArrayList;
import java.util.Collections;

public class QuestionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> al = new ArrayList<String>();
		al.add("AUSTRALIA");
		al.add("INDIA");
		al.add("GERMANY");
		al.add("UNITESSTATES");
	
		
		Object[] array = al.toArray();
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = i+1; j < array.length; j++) {
				
				if(array[i].toString().charAt(0)>array[j].toString().charAt(0)) {
					
					
					String temp= array[i].toString();
					
					array[i]=array[j];
					array[j]=temp;
					
					
					
				}
				
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
		}
		
		Collections.sort(al);
		System.out.println(al);

		
	}
	
	
}
	

