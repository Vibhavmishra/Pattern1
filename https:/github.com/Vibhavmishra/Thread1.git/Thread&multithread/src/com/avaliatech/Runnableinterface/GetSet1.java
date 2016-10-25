package com.avaliatech.Runnableinterface;

public class GetSet1 {

	public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
	MyThread7 t=new MyThread7();
	System.out.println(t.getName());
	Thread.currentThread().setName("VIBHAV");
	System.out.println(Thread.currentThread().getName());
}
}
class MyThread7 extends Thread{
	
}