package com.avalia.atm;

import junit.framework.TestCase;

public class Test extends TestCase {
	private ATM atm;
	
	@Override
	protected void setUp() throws Exception {
		atm = new ATM();
		atm.refill(100, 100, 100);
	}

	public void testWithdraw() {
		try {

			assertEquals(new Denomination(34, 1,5), atm.withdraw(35000));
			assertEquals(new Denomination(38, 1, 1), atm.withdraw(38600));
			//assertEquals(new Denomination(38, 0, 3), atm.withdraw(38300));
			//assertEquals(new Denomination(38, 0, 3), atm.withdraw(38300));
			//assertEquals(new Denomination(38, 0, 3), atm.withdraw(38300));
			//assertEquals(new Denomination(38, 0, 3), atm.withdraw(38300));
		} catch (NotCorrectAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//public void testMaxDispensenableAmt() {
		/*assertEquals(40000, atm.maxDispensenableAmt());
		atm.refill(0, 100, 100);
		assertEquals(20000, atm.maxDispensenableAmt());
		atm.refill(0, 0, 100);
		assertEquals(4000, atm.maxDispensenableAmt());
		atm.refill(20, 100, 100);
		assertEquals(30000, atm.maxDispensenableAmt());
		atm.refill(20, 10, 100);
		assertEquals(26000, atm.maxDispensenableAmt());
		atm.refill(0, 10, 100);
		assertEquals(8000, atm.maxDispensenableAmt());*/
		//atm.refill(100, 100, 100);
		//assertEquals(37400, atm.maxDispensenableAmt());
		//atm.refill(10, 15, 10);
		//assertEquals(18500, atm.maxDispensenableAmt());
	//}

}