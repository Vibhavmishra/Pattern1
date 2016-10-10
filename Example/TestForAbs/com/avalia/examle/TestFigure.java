package com.avalia.examle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestFigure {
private Rectangle obj1;
//private triangle obj2;
@Before
public void setup(){
	obj1=new Rectangle(11.00,2.00);
	//obj2=new triangle();
	
}
	@Test
	public void test() {
		assertEquals(obj1.area(),22.0000);
	}

}
