package learnbay;

import java.util.ArrayList;
import java.util.List;

public class SunsequencesOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		List<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		
		int[] x = {1,2,3};
		Subsequencerecursion(x,al,0,res);
		
		for (int i = 0; i < res.size(); i++) {
			
			System.out.println(res.get(i));
		}
	}
	
	
	private static void Subsequencerecursion(int[] x,ArrayList<Integer> al,int current,List<ArrayList<Integer>> res) {
		
		
		if(current==x.length) {
			
			res.add(new ArrayList<>(al));
			return;
		}
		al.add(x[current]);
		Subsequencerecursion(x, al, current+1,res);
		al.remove(al.size()-1);
	
		Subsequencerecursion(x, al, current+1,res);
		
	
		
	}

}
