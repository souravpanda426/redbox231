import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class SorttwodArray {
	
	
	public static void main(String[] args) {
		
	
	
	int[][] x = {{4,5},{3,6}};
	
	Arrays.sort(x,new Comparator<int[]>() {

		@Override
		public int compare(int[] o1, int[] o2) {
			// TODO Auto-generated method stub
			if(o1[0]!=o2[0]) {
				
				return o1[0]-o2[0];
			}
			return o1[1]-o2[1] ;
		}
		
		
		
		
	});
		
		
		
		
		
	for (int i = 0; i < x.length; i++) {
		
		for (int j = 0; j < x[i].length; j++) {
			
			System.out.print(x[i][j]);
			
			
		}
	}
	
	
	
	
	
	}

}
