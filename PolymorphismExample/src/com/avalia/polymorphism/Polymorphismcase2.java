/*covarient return type id allowed in overriding Because the object is the root class of String*/
package com.avalia.polymorphism;

public class Polymorphismcase2 {
	public Object add() {
		return "object";
	}
}

class Child2 extends Polymorphismcase2 {
	public String add() {
		return "String";
	}
}