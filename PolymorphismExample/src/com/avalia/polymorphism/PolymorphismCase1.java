/**/
package com.avalia.polymorphism;

public class PolymorphismCase1 {
	public String add() {
		return "abc";
	}
}

class child extends PolymorphismCase1 {
	public String add() {
		return "xyz";
	}
}
