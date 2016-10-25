/*If we are not overriding run() we won't get any output
 * the thread class run() method will be executed which is empty.*/

package com.avaliatech.ThreadClass;

class MyThread3 extends Thread{
	public void run(){
		
	}
}

public class ThreadDemo3 {
public static void main(String[] args){
	MyThread3 t=new MyThread3();
	t.start();
	
}
}