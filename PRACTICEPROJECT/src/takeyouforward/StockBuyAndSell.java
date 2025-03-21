package takeyouforward;

public class StockBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int arr[] = {7,1,5,3,6,4};
		  
		  int min = arr[0];
		  
		  int maxProfit=0;
		  
		  int startindex = 0;
		  
		  for (int i = 1; i < arr.length; i++) {
			
			  if(min>arr[i]) {
				  min = arr[i];
				  
				  startindex = i;
			  }
		}
		  
		 
		  
	
		  
		  
		  for (int i = startindex; i < arr.length; i++) {
			
			  int profit = arr[i]-min;
			  
			  if(maxProfit<profit) {
				  maxProfit=profit;
				  
			  }
			  
		}
		  
		  System.out.println(maxProfit);

	}

}
