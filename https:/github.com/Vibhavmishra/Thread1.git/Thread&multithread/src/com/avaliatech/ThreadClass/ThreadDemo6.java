/*After starting a thread if we want to  restart the same thread then we will
 * get run time error saying IllegalThreadStateException*/

package com.avaliatech.ThreadClass;

public class ThreadDemo6 {
public static void main(String[] args){
	MyThread6 t=new MyThread6();
	t.start();
	System.out.println("Main");
	t.start();
}
}
class MyThread6 extends Thread{
	
}