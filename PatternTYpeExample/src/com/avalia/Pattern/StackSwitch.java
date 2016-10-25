package com.avalia.Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackSwitch {
public static void main(String[] args) throws NumberFormatException, IOException{
	int arr[]=new int[8];
	InputStreamReader irs=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(irs);
	String opt="y";
	while(opt!="n"){
	System.out.println("1. push");
	System.out.println("2. pop");
	System.out.println("Enter Choice");
	int ch=Integer.parseInt(br.readLine());
	switch(ch){
	case 1:
		int top=-1;
		if(top>8){
			System.out.println("Stack is Overflow");
		}
		else{
			top++;
			System.out.println("Enter Elements of Stack");
			
	}
	}
	}
}
}
