package de.boehmke.beispielrechner;

/**
 * 
 * @author TiXX BoehXXX 
 * Softwaretechnik (BHTB MIB 13 S20)
 * s514XXX@beuth-hochschule.de
 * MatrikelNummer: 776XXX
 * Datum 21.06.2019
 */

public class BeispielRechner {
	public BeispielRechner() {
	}
	
	/**
	 * This is a small pocket calculator with the 4 basic arithmetic operations
	 * two variables are used (a;b).
	 * @param a = operand1
	 * @param b = operand2
	 * @return the result of the arithmetic operation
	 */
	
	public long Add(long a, long b) {
		return a + b;
	}

	public long Sub(long a, long b) {
		return a - b;
	}

	public long Mal(long a, long b) {
		return a * b;
	}

	public long div(long a, long b) {
		if (b == 0) {
			throw new IllegalArgumentException("zero does not work!");
		}
		return (long) ((double) a / b);
	}

}