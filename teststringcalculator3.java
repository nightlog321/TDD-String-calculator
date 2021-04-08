 package check;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class teststringcalculator3 {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("check.teststringcalculator1");
    }

	@Test
	public void nulltest() {
		assertEquals(0, stringcalculator.add(""));
	}

    @Test
    public void onenumber() {
        assertEquals(calculator.add("2"), 2);
    }

    @Test
    public void twonumbers() {
        assertEquals(calculator.add("1,2"), 3);
    }
  
    @Test
    public void numbersNewlineDelimitedShouldBeSummed() {
        assertEquals(calculator.add("1\n2"), 3);
    }

     @Test
    public void negative() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("negatives not allowed");
        calculator.add("2,-2\n1");
    }
	@Test
    public void greater() {
        assertEquals(calculator.add("12,23212\n4,24"), 40);
    }
}
