/*If we write super keyword before overridden then a new thread created
 * and child run method executed */

package com.avaliatech.ThreadClass;

class MyThread5 extends Thread{
	public void start(){
		super.start();
		System.out.println("Start");
	}

	public void run(){
		System.out.println("RUN");
	}

}

public class ThreadDemo5 {
public static void main(String[] args){
	MyThread5 t=new MyThread5();
	t.start();
	System.out.println("main");
}
}