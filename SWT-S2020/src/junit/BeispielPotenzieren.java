
package junit;

/**
 * @author Tino Böhmke
 * @Softwaretechnik (BHTB MIB 13 S20)
 * @s514997@beuth-hochschule.de
 * @MatrikelNummer: 776097
 * @Datum 22.06.2019
 */

public class BeispielPotenzieren {

	/**
	 * zweites kleies Beispiel, dieses mal für potenzierte Rechenoperationen 
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
			throw new Exception("Fehler: Korrekte Definition fehlt.");
		}
	}
}
