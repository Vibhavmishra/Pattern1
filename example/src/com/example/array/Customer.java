package com.example.array;

 class Customer {
	String name;
	int rollno;
	public Customer(/*String name,int rollno*/) {
		//this.name=name;
		//this.rollno=rollno;
	}
	public String toString(){
		return name+ ""+rollno;
	}
}
 class Student {
	String name;
	int rollno;
	public Student() {
		//this.name=name;
		//this.rollno=rollno;
	}
	public String toString(){
		return name+ ""+rollno;
	}
	
	public static void main(String[] args) {   
    Object[] arr=new Object[120];
    arr[0]=new Student();
    arr[1]=new Customer();
	}
}
