package takeyouforward;

import java.util.ArrayList;

public class ArrayPermutation {
	
	
	static ArrayList<Integer> al = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] x = {1,2,3};
		
		int start = 0;
		int end = x.length-1;
		
		generatePermutation(x,start,end);
		
		
		System.out.println(al);
		
		for(int i = 0;i<al.size();i++) {
			
			if(al.get(i)>al.get(0)) {
				
				System.out.println(al.get(i));
				
				break;
			}
		}
		
		
		

	}
	
	public static void generatePermutation(int[] x,int start,int end) {
		
		
		
		String y ="";
		
		
		if(start==end) {
			
			for(int i=0;i<x.length;i++) {
				
				//System.out.print(x[i]);
				
				y = y + x[i];
				
				
			}
			
			al.add(Integer.parseInt(y));
			
			y = "";
			
			
			//System.out.print(" ");
		}
		
		else {
			
			 for (int j = start; j<=end; j++)  {
	              
	                //Swapping the string by fixing a character  
	              x =  swap(x,start,j);  
	                //Recursively calling function generatePermutation() for rest of the characters   
	                generatePermutation(x,start+1,end);  
	                //Backtracking and swapping the characters again.  
	                x = swap(x,start,j);  
	            }  
			
		}

		
		
		
	}
	
public static int[] swap(int[] y,int a, int b) {
		
		int temp = y[a];
		
		y[a]=y[b];
		y[b]=temp;
		return y;
		
		
	}

	}


