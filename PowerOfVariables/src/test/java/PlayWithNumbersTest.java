import static org.junit.Assert.*;

import org.junit.Test;

public class PlayWithNumbersTest {

	@Test
	public void isPrimeNumber() {
		assertTrue(120L == new PlayWithNumbers()._____(5));
		assertTrue(1L == new PlayWithNumbers()._____(0));

		assertTrue(720L == new PlayWithNumbers().____(6));
		assertTrue(6L == new PlayWithNumbers().____(3));

		assertTrue(120L == new PlayWithNumbers().computeFactorialFunctional(5));
		assertTrue(1L == new PlayWithNumbers().computeFactorialImperative(0));

		assertTrue(720L == new PlayWithNumbers().computeFactorialFunctional(6));
		assertTrue(6L == new PlayWithNumbers().computeFactorialImperative(3));
	}

}
