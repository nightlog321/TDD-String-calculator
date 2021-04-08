package check;
import org.junit.Test;
public class teststringcalculator {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("check.teststringcalculator");
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
}
