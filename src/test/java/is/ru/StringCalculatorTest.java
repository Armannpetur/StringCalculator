package is.ru.StringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testEmptyString(){
		assertEquals(0, StringCalculator.add(""));
	}

	@Test
	public void testOneNumber(){
		assertEquals(2, StringCalculator.add("2"));
	}
}