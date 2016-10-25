/*Defining a thread by extending Thread class */


package com.avaliatech.ThreadClass;

class MyThread extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("Child Thread");
		}
	}
}

public class ThreadDemo {
public static void main(String[] args){
	MyThread t=new MyThread();
	t.start();
	for(int i=1;i<=10;i++){
		System.out.println("Main thread");
	}
}
}
