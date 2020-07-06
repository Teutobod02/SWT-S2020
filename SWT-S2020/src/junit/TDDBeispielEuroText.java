package junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author TiXX BöhXXX
 * Softwaretechnik (BHTB MIB 13 S20)
 * s514XXX@beuth-hochschule.de
 * MatrikelNummer: 776XXX
 * Datum 21.06.2019
 */

public class TDDBeispielEuroText {

	/**
	 * kleines Beispiel zu zwei möglichen Test für Ihren Buchautor, dem die
	 * Buchstaben bezahlt werden soll
	 */

	@Test
	public final void whenStringIsSubmittedThenNoExceptionIsThrown() {
		Assert.assertEquals(true, Character.isLetter('A'));
		// prüfen ob übergebenes Char ein Buchstabe ist
		Assert.assertTrue(true);

	}

	@Test
	public final void whenWhitespacesareSubmittedThenNoExceptionIsThrown() {
		Assert.assertEquals(true, Character.isSpaceChar(' '));
		// prüfen ob übergebenes Char ein Leerzeichen ist, die bezahle ich nicht
		Assert.assertTrue(true);

	}

}
