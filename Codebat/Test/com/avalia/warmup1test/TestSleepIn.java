package com.avalia.warmup1test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.avalia.warmup1.SleepIn;

public class TestSleepIn {
	private SleepIn a;
	@Before
	public  void setup(){
		 a=new SleepIn();
	}
	@Test
	public void test() {
       assertEquals(true,a.sleepIn(false, false));
       assertEquals(false,a.sleepIn(true, false));
       assertEquals(true,a.sleepIn(false, true));
       assertEquals(true,a.sleepIn(true, true));
	}

}
