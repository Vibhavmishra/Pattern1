package com.avalia.atm;

public class AtmSystem {

	public static void main(String[] args) {
		ATM tr = new ATM();
		tr.refill(0, 0, 100);
		try {
			tr.withdraw(300);
		} catch (NotCorrectAmountException e) {
			System.out.println(e.getMessage());
		}

	}

}
