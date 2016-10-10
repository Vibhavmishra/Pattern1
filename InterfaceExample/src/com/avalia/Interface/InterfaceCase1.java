package com.avalia.Interface;

interface Person {
	public String getName(String name);
}

abstract class Student implements Person {
	public String getName(String name) {
		return name;
	}
}

class Child extends Student {

}