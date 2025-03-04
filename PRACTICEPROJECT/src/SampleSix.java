import java.util.ArrayList;
import java.util.HashMap;

public class SampleSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int arr1[] = {1,2,3,4,5}; 
		int arr2[] = {2,3,4,4,5};
		
		 HashMap <Integer,Integer > freq=new HashMap<>();
		  ArrayList<Integer> Union=new ArrayList<>();
		  
		  
		  for (int i = 0; i < arr1.length; i++)
		    freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
		    
		  for (int i = 0; i < arr2.length; i++)
		    freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
		  for (int it: freq.keySet())
		    Union.add(it);
		  
		  
			System.out.println(freq);
		
		}
	

		
	}


