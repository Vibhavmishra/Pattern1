/*If we override start() method then our Start() method will be executed 
 * like a normal method and new Thread won't be created*/

package com.avaliatech.ThreadClass;

class MyThread4 extends Thread{
	public void start(){
		System.out.println("Start");
	}

	public void run(){
		System.out.println("RUN");
	}

}

public class ThreadDemo4 {
public static void main(String[] args){
	MyThread4 t=new MyThread4();
	t.start();
	System.out.println("main");
}
}