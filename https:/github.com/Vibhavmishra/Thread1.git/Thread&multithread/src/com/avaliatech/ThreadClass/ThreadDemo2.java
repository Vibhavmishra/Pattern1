/*Overloading of run() is always possible but thread class Start()
 * can invoke no-argument run method*/

package com.avaliatech.ThreadClass;

class MyThread2 extends Thread{
	public void run(){
		System.out.println("No argument");
	}
	public void run(int i){
		System.out.println("int argument");
	}
}

public class ThreadDemo2 {
public static void main(String[] args){
	MyThread2 t=new MyThread2();
	t.start();
	
}
}
