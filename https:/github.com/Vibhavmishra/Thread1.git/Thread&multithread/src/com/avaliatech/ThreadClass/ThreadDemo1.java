/*if we want replace start() to run() then a new thread won't be created
 * and run() will executed just like a normal method*/
package com.avaliatech.ThreadClass;

class MyThread1 extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("Child Thread");
		}
	}
}

public class ThreadDemo1 {
public static void main(String[] args){
	MyThread1 t=new MyThread1();
	t.run();
	for(int i=1;i<=10;i++){
		System.out.println("Main thread");
	}
}
}
