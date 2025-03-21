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
			
			return;
		}
		
		else {
		
		for(int i = start;i<end;i++) {
			
		      x= swap(x,start,i);
		      
		   
			permute(x,start+1,end);
			
			
		
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
