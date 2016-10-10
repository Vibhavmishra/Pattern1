/*if child class wANT SHARE ITS BEHAVIOUR TO THE NEXT LEVEL THEN IT SHOULD BE DEFINE
 * AS aBSRACT METHOD.*/
package com.avalia.polymorphism;

public class PolymorphismCase3 {
public int m1(){
	return 'a';
}

abstract class Child3 extends PolymorphismCase3{
	public abstract int m1();
	
}
}