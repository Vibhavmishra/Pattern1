package com.avalia.Pattern;


public class largestTwo1 {
public static void main(String[] args){
	int arr[]={5,6,7,8,9};
	int i,j,k;
	for(i=0;i<5-1;i++)
	{
		if(i==2)
			break;
		for(j=i+1;j<5;j++){
			if(arr[i]<arr[j]){
				k=arr[i];
				arr[i]=arr[j];
				arr[j]=k;
			}
		}
	}
	for(i=0;i<2;i++){
		System.out.println(arr[i]);
	}
}	
}
