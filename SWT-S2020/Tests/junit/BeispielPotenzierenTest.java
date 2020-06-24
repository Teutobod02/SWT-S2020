package junit;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author TiXX BöhXXX
 * @Softwaretechnik (BHTB MIB 13 S20)
 * @s514XXX@beuth-hochschule.de
 * @MatrikelNummer: 776XXX
 * @Datum 21.06.2019
 */

public class BeispielPotenzierenTest {

	/**
	 * zweiter kleier Test für potenzierte Rechenoperationen
	 */

	private BeispielPotenzieren beispielPotenzieren;

	@Before
	public void setUp() {
		beispielPotenzieren = new BeispielPotenzieren();
	}

	@Test
	public void testKonstruktor() {
		assertEquals("Durch den Konstruktor darf keine Aufgabe gesetzt sein.", null,
				// prüft ob der Konstruktur wirklich keine weiteren Augaben ausführen soll
				beispielPotenzieren.getAufgabe());
	}

	@Test

	public void testgetAndSetAufgabe() {
		beispielPotenzieren.setAufgabe("Quadrat");
		// prüft ob die Methode getAufgabe die gewünschte myMethod (Quadrat) zurück gibt
		assertEquals("Produkt muss 'Quadrat' sein.", "Quadrat", beispielPotenzieren.getAufgabe());
	}

	@Test
	/**
	 * @throws Exception
	 */
	public void testProdukt() throws Exception {
		beispielPotenzieren.setAufgabe("Produkt");
		// prüft die Berechnung eines Produktes mit einer in die Methode gegebenen Zahl
		// * 2
		assertTrue("Produkt von '4x2' muss '8' sein.", 8 == beispielPotenzieren.myMethod(4));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testQuadrat() throws Exception {
		beispielPotenzieren.setAufgabe("Quadrat");
		// prüft die Berechnung des Quadrats einer gegebenen Zahl
		assertTrue("Quadrat von '4' muss '16' sein.", 16 == beispielPotenzieren.myMethod(4));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testWurzel() throws Exception {
		beispielPotenzieren.setAufgabe("Wurzel");
		// prüft das Ziehen der Wurzel aus einer gegebenen Zahl
		assertTrue("Wurzel von '4' muss '2' sein.", 2 == beispielPotenzieren.myMethod(4));
	}

	/**
	 * @throws Exception
	 */
	@Test(expected = Exception.class)
	public void testUnbekannteAufgabe() throws Exception {
		beispielPotenzieren.setAufgabe("Undefiniert");
		// prüft das Handling von Unbekannten Aufgaben
		beispielPotenzieren.myMethod(4);
	}
}
