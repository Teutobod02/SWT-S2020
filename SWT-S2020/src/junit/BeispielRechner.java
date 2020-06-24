package junit;

/**
 * @author TiXX BöhXXX
 * @Softwaretechnik (BHTB MIB 13 S20)
 * @s514XXX@beuth-hochschule.de
 * @MatrikelNummer: 776XXX
 * @Datum 21.06.2019
 */

public class BeispielRechner {
	public BeispielRechner() {
	}

	/**
	 * keiner Recher mit den 4 Grundrechenarten
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
			throw new IllegalArgumentException("durch Null geht nicht!");
		}
		return (long) ((double) a / b);
	}

}

