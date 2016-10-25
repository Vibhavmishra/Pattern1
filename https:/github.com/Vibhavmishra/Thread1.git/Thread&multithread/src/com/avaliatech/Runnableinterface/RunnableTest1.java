package com.avaliatech.Runnableinterface;

public class RunnableTest1 {
public static void main(String[] args){
	MyRunnable r=new MyRunnable();
	Thread t1=new Thread(r);
	t1.start();
	for(int i=0;i<10;i++){
		System.out.println("Main thread");
	}
}
}
class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("Child thread");
		}
	}
}