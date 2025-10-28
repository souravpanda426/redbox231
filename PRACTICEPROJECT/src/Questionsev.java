import java.util.Arrays;
import java.util.Comparator;

public class Questionsev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[][] x = {{1,3},{0,2},{2,3},{4,6},{4,5},{5,5},{0,2},{3,3}};
		 
		  /*Arrays.sort(x, new Comparator<int[]>() {
	            public int compare(int[] a, int[] b) {
	                return a[0] - b[0];
	            }
	        });*/
		 
		 
		 Arrays.sort(x,(a,b)->{
		      if(a[0]!=b[0]){

		     return a[0]-b[0];
		      }
		      else{

		        return a[1]-b[1];
		      }


		     });
	        
	        for (int i = 0; i < x.length; i++) {
				
	        	for (int j = 0; j < x[i].length; j++) {
					
	        		System.out.println(x[i][j]);
				}
			}

	}

}
