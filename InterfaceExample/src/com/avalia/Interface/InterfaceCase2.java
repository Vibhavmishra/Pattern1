package com.avalia.Interface;

interface Parent {
abstract String getName();
}
interface child  {
abstract int getRollNo();
}
 class Main implements Parent,child{
	public String getName(){
		 return "vibhav";
	 }
	 public int getRollNo(){
		 return 123;
	 }
}

