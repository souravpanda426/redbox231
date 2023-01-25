package mypackage;

public class SortArrays {

	public static void main(String[] args) {
		
int[] x = {6,5,4,32,1};


 for(int i =0;i<x.length;i++) {
	 
	 for(int k = i+1; k<x.length;k++) {
		 
		 if(x[i]>x[k]) {
			 
			 int temp = x[k];
			 x[k] = x[i];
			 x[i]=temp;
			 
		 }
		 
	 }
	
	
	
}
 
 for (int i = 0; i < x.length; i++) {
	
	 System.out.println(x[i]);
}

	}

}
