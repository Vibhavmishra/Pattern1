package com.avaliatech.Runnableinterface;

public class GetSet2 {

	public static void main(String[] args) {
        //System.out.println(Thread.currentThread().getName());
	MyThread8 t=new MyThread8();
	System.out.println(t.getName());
	Thread.currentThread().setName("VIBHAV");
	System.out.println("Main thread executed by thread::"+Thread.currentThread().getName());
}
}
class MyThread8 extends Thread{
	public void run(){
		System.out.println("run method executed byThread::"+Thread.currentThread().getName());
	}
}