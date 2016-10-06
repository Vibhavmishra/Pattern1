package com.avalia.atm;
public class ATM {
	private int note1000;
	private int note500;
	private int note100;

	public void refill(int th, int fh, int h) {
		// TODO: need to check for negative numbers
		if (th >= 0 && fh >= 0 && h >= 0) {
			note1000 = th;
			note500 = fh;
			note100 = h;
		} else {
			System.out.println("Not refill");
		}
	}

	private boolean isCorrectAmount(int amt) {

		if (amt <= 0) {
			return false;
		}
		if (amt % 100 != 0) {
			return false;
		}
		if (amt > maxDispensenableAmt()) {
			return false;
		}
		return true;

	}

	public int maxDispensenableAmt() {
		if (note1000 >= 40)
			return 40000;
		int note500required = 40 - note1000;
		if (note500 >= note500required) {
			return note1000 * 1000 + note500required * 500;
		}
		int note100Required = 40 - (note1000 + note500);
		if (note100 >= note100Required) {
			return note1000 * 1000 + note500 * 500 + note100Required * 100;
		}
		return note1000 * 1000 + note500 * 500 + note100 * 100;

	}

	public Denomination withdraw(int amnt) throws NotCorrectAmountException {
		int thc = 0, fhc = 0, hc = 0;
		int threq = 0;
		int fhreq = 0;
		int hreq = 0;
		int amount = amnt;
		if (!isCorrectAmount(amnt)) {
			throw new NotCorrectAmountException("invalid amount");
		}

		while (amount > 1000 && note1000 > threq) {
			if (amount >= 1000) {
				threq = amount / 1000;
				if (note1000 > threq && note1000 > 0) {
					amount = amount - 1000;
					threq--;
					thc++;
					note1000--;
				} else
					break;
			}

		}
		while (amount > 500 && note500 > 0) {
			if (amount >= 500) {
				fhreq = amount / 500;
				if (note500 >= fhreq && note500 > 0) {
					fhc++;
					amount = amount - 500;
					fhreq--;
					note500--;
				} else
					break;
			}
		}
		while (amount >= 100 && note100 > 0) {
			if (amount >= 100) {
				hreq = amount / 100;
				if (note100 >= hreq && note100 > 0) {
					amount = amount - 100;
					hreq--;
					hc++;
					note100--;
				} else
					break;
			}
		}

		if (thc + fhc + hc >= 41)
			throw new NotCorrectAmountException("total notes should be less than or equal to 40");

		return new Denomination(thc, fhc, hc);

	}
}


