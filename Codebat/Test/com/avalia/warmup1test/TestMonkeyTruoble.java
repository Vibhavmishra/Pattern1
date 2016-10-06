package com.avalia.warmup1test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.avalia.warmup1.MonkeyTrouble;

public class TestMonkeyTruoble {
private MonkeyTrouble obj;
@Before
public  void setup(){
	 obj=new MonkeyTrouble();
}
	@Test
	public void test() {
		assertEquals(true,obj.monkeyTrouble(true, true));
		assertEquals(true,obj.monkeyTrouble(false, false));
		assertEquals(false,obj.monkeyTrouble(true, false));
		assertEquals(false,obj.monkeyTrouble(false, true));
	}
	

}
