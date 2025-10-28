package learnbay;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {13, 46, 24, 52, 20, 9};
		
		/*for (int i = 0; i <= arr.length - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }*/
		System.out.println(Math.ceil(0.03));
		
		
		for (int i = 1; i < arr.length; i++) {
			
			
			int j = i;
			
			while(j>0 && arr[j-1]>arr[j]) {
				
				int temp= arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				
				j--;
				
			}
			
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
