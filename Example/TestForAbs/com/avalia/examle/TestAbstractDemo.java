package com.avalia.examle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestAbstractDemo {
private B obj;
@Before
public void setup(){
	obj=new B();
}
	@Test
	public void test() {
		assertEquals(obj.add(),1);
	}

}
