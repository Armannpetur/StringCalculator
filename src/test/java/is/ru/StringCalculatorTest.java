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

	@Test
	public void testTwoNumbers(){
		assertEquals(3, StringCalculator.add("1,2"));
	}

	@Test
	public void testMultipleNumbers(){
		assertEquals(6, StringCalculator.add("1,2,3"));
	}

	@Test
	public void testNewLine(){
		assertEquals(6, StringCalculator.add("1\n2,3"));
	}

	@Test
	public void testNegativeNumber(){
		try{
			StringCalculator.add("-1,2");
		}
		catch(RuntimeException ex){
			assertEquals("Negatives not allowed: -1");
		}
	}
}