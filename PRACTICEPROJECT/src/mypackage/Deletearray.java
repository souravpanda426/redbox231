package mypackage;

public class Deletearray {
	
	
	public static void main(String[] args) {
		
		
		int [] x = {1,2,3,4,5,6};
		int[] deletearray = Deletearray.deletearray(x,5);
		
		if(deletearray!=null) {
			
			
		for(int i=0;i<deletearray.length;i++) {
			System.out.print(deletearray[i]);
		}
		
	
		}
		
		
		
		
	}
	
	
	private static int[] deletearray(int a[],int ele) {
		
		boolean flag = false;
		
		
		
		for(int k=0;k<a.length;k++) {
			
			if(ele==a[k]) {
				flag =true;
			}
			
			
		}
		
		int[] ya = new int[a.length-1];
		
		
		if(flag==true) {
		
		
		
		
			
		
		
		int index = 0;
		
		
		
	
	
		for (int i = 0; i < a.length; i++) {
			if(a[i]==ele) {
				
				index=i;
				
			}
			
			
		}
		
		for(int i=0;i<a.length-1;i++) {
			
			if(i<index) {
				
				ya[i]=a[i];
				
			}
			
			else {
				ya[i]=a[i+1];
			}
		}
		
		
		return ya;
		
	}
		
		
	
		
		else {
			
			System.out.println("no element found");
			
			return null;
			
		}
		
		


}
	
}
