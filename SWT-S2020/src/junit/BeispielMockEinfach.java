package junit;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;

/**
 * @author TiXX BoehXXX 
 * Softwaretechnik (BHTB MIB 13 S20)
 * s514XXX@beuth-hochschule.de
 * MatrikelNummer: 776XXX
 * Datum 21.06.2019
 */

public class BeispielMockEinfach {

	/**
	 * Array mit Liste verschiedener Farben, welches durch einen Mock ersetzt
	 * werden soll
	 */

	@Test
	public void testSimpleList() {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("green");
		myList.add("blue");
		myList.add("yellow");
		myList.add("pink");
		myList.add("black");
		String item1 = myList.get(0);
		String item2 = myList.get(1);
		String item3 = myList.get(2);
		String item4 = myList.get(3);
		String item5 = myList.get(4);

		System.out.println(item1);
		System.out.println(item2);
		System.out.println(item3);
		System.out.println(item4);
		System.out.println(item5);

	}

	/**
	 * einfachste Form des Mocks, der Mock simuliert die ArrayList 
	 */

	@Test
	public void testBeispielMock() {
		@SuppressWarnings("unchecked")
		ArrayList<String> myMock = Mockito.mock(ArrayList.class);
		myMock.add("green");
		myMock.add("blue");
		myMock.add("yellow");
		myMock.add("pink");
		myMock.add("black");
		String item1 = myMock.get(0);
		String item2 = myMock.get(1);
		String item3 = myMock.get(2);
		String item4 = myMock.get(3);
		String item5 = myMock.get(4);

	}
}
