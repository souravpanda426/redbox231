package learnbay;
import java.util.*;

class Solution {
    
    static void segregate0and1(int arr[], int n) {
      int type0 = 0;
      int type1 = n - 1;
      int temp;
      while (type0 < type1) {
        if (arr[type0] == 1) {
            temp = arr[type0];
            arr[type0] = arr[type1];
            arr[type1] = temp;
          type1--;
        } else {
          type0++;
        }
      }
    }

public static void main(String args[]) {
  int n=5;
  int arr[]={1,0,1,0,1};
  System.out.print("Before Sorting: ");
  for (int a: arr)
    System.out.print(a+" ");
    System.out.println();
  segregate0and1(arr, n);
  System.out.print("After Sorting: ");
  for (int a: arr)
    System.out.print(a+" ");
}
}