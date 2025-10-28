package learnbay;

public class RightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] x = {"a","b","c","d","e","f"};
		
		int rotation = 3;
		
		int index = x.length-rotation;
		
		String[] rightrotaion = rightrotaion(x,index);
		
		for (int i = 0; i < rightrotaion.length; i++) {
			
			System.out.println(rightrotaion[i]);
		}
	}
	
	
	public static String[] rightrotaion(String[] x,int k) {
		
		int temp=k;
		
		String[] y = new String[x.length];
		
		int f = 0;
		
		while(k<x.length) {
			
			y[f]=x[k];
			f++;
			k++;
			
			
		}
		
		for(int j=0;j<temp;j++) {
			
			y[f]=x[j];
			f++;
		}
		return y;
		
		
		
	}

}
