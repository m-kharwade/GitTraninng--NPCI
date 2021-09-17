package com.npci.dsalgo.main;

public class Ascending {
	public static void main(String[] args) {
		
		int[] arr= new int[] {11,67,89,123,6,12,34};
		int temp=0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
