package learnbay;

public class SumArray {
	
	static int sum=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {1,2,3,4,6,7,8};
		int findSum = findSum(x,0);
		System.out.println(findSum);

	}
	
	
	public static int findSum(int[]x,int y) {

		if(y<x.length) {
			sum = sum + x[y];
			y++;
			
			findSum(x,y);
			
		}
		return sum;
		
		
	}

}
