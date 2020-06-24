package junit;

/**
 * @author Tino Böhmke
 * @Softwaretechnik (BHTB MIB 13 S20)
 * @s514997@beuth-hochschule.de
 * @MatrikelNummer: 776097
 * @Datum 21.06.2019
 */

public class BeispielRechner {
	public BeispielRechner() {
	}

	/**
	 * keiner Recher, der die 4 Grundrechenarten kann
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

