
package junit;

/**
 * @author TiXX BoehXXX 
 * Softwaretechnik (BHTB MIB 13 S20)
 * s514XXX@beuth-hochschule.de
 * MatrikelNummer: 776XXX
 * Datum 21.06.2019
 */

public class BeispielPotenzieren {

	/**
	 * This is a small pocket calculator with arithmetic operations
	 * variable are used is a.
	 * @param a = operand
	 * @return the result of the arithmetic operation
	 */
	

	private String Aufgabe;

	public String getAufgabe() {
		return Aufgabe;
	}

	public void setAufgabe(String Aufgabe) {
		this.Aufgabe = Aufgabe;
	}

	public double myMethod(double a) throws Exception {
		if ("Quadrat".equalsIgnoreCase(Aufgabe)) {
			return a * a;
		} else if ("Produkt".equalsIgnoreCase(Aufgabe)) {
			return a * 2;
		} else if ("Halbieren".equalsIgnoreCase(Aufgabe)) {
			return a / 2;
		} else if ("Wurzel".equalsIgnoreCase(Aufgabe)) {
			return Math.sqrt(a);
		} else {
			throw new Exception("Error: Correct definition is missing.");
		}
	}
}
