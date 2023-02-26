package mypackage;

public class Samples {
	
	
	
	public static void main(String[] args) {
	
	 String[] names = {"ZAK","YAK","BAK","ABC"};
	 
	
	 
	 for(int i=0;i<names.length;i++) {
		 
		 for(int j=i+1;j<names.length;j++) {
			 
			 if(names[i].charAt(0)>names[j].charAt(0)) {
				 
				String temp = names[j];
				names[j]= names[i];
				names[i]=temp;
				 
				 
				 
				 
			 }
		 }
		 
		
		 
	 }

	for(int i=0;i<names.length;i++) {
		System.out.println(names[i]);
	}
		
		
		
		
		
		
		

	}
	
	
	
	
	
	

}
