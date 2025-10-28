package learnbay;

import java.util.HashSet;

public class FirstNegative {
	
	
	

	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {1,2,-1,3,4,-2,-8,5,7,9,-10};
		
	HashSet<Integer> hm = new HashSet<Integer>();
	hm.contains(9);
		
		
		int k = 4;
		
		int start=0;
		
		int end = k-1;
		
		int number = findFirsttNegativeNumberIndex(x,start);
		
	
		
		while(end<x.length) {
			
			
			if(number>=start & number<=end) {
			
				
				System.out.print(x[number]+" ");
				
				
			}
			
			else if(number<start) {
					
					
					
					number = findFirsttNegativeNumberIndex(x,start);
					
					if(number>=start & number<=end) {
						
						System.out.print(x[number]+" ");
					}
					else {
						
						System.out.print(0+" ");
					}
					
					
				}
			
			
			else {
				
			
				
				System.out.print(0+" ");
			}
			
			
           
			
			
			
			start++;
			end++;
		}
		
		
	

	}
	
	
	
	



	public static int findFirsttNegativeNumberIndex(int[] x,int start) {
		
		int rt=0; int temp=start;
		
		while(temp<x.length) {
			
			if(x[temp]<0) {
				
				rt=temp;;
				
				break;
			}
			
			temp++;
		}
		return rt;
		
	}
	
	
	
}
