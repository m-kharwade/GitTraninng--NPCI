package com.npci.dsalgo.main;

public class Problem2 {

	public static void main(String[] args) {
	
	int arr[]=new int[] {2,6,7,9,3,5,6};

     int t=6;
 
    for(int i=0;i<arr.length;i++)
    {
    	 if (arr[i] == t) {
             System.out.println(i);
         }
    	 else
    	 {
    		 continue;
    	 }
           
    }
        
}
}
