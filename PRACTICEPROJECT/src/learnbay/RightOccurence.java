package learnbay;

public class RightOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    int[] ar = {1,2,2,2,3,4,4,4,4,4,5,5,6,7,7,7};
		
		
		
		int low =0;
		int high = ar.length-1;
		int target=4;
		
		int ans=0;
		
		
		while(low<=high) {


			int mid = (low+high)/2;


			if(ar[mid]==target) {

				ans=mid;

				low = mid+1;

			}

			else if(ar[mid]>target){


				high = mid-1;
			}

			else {

				low = mid +1;
			}
		}

		System.out.println(ans);

		
		
	}

}
