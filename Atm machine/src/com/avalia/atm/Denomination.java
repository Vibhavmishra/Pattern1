package com.avalia.atm;
public class Denomination {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fhc;
		result = prime * result + hc;
		result = prime * result + thc;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Denomination other = (Denomination) obj;
		if (fhc != other.fhc)
			return false;
		if (hc != other.hc)
			return false;
		if (thc != other.thc)
			return false;
		return true;
	}

	private int thc;
	private int fhc;
	private int hc;

	public Denomination(int thc, int fhc, int hc) {
		this.thc = thc;
		this.fhc = fhc;
		this.hc = hc;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("thousand note is" + thc);
		sb.append("\n");
		sb.append("five hundred note is" + fhc);
		sb.append("\n");
		sb.append("hundred note is" + hc);
		sb.append("\n");
		return sb.toString();
	}

}


