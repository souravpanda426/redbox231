package mypackage;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String x ="ABC";
		permute(x,0,x.length());

	}
	
	
	
	public static void permute(String x,int start ,int end) {
		
		
		if(start==end-1) {
			
			System.out.println(x);
		}
		
		else {
		
		for(int i = start;i<end;i++) {
			
		      x= swap(x,start,i);
		      
		      System.out.println("before permute i value is"+ i);
		      System.out.println("before permute start value is"+ start);
		      
		      System.out.println("before permute x value is "+x);
			permute(x,start+1,end);
			
			System.out.println("after permute i value is"+ i);
		      System.out.println("after permute start value is"+ start);
		      
		      System.out.println("after permute x value is "+x);
			
		
			 x= swap(x,start,i);
			
			
		}
		
		
		}
	}
	
	
	
	public static String swap(String x , int a , int b) {
		
		
		char[] ch = x.toCharArray();
		
		char temp = ch[a];
		ch[a]=ch[b];
		ch[b]=temp;
		
		return String.valueOf(ch);
		
	}

}
